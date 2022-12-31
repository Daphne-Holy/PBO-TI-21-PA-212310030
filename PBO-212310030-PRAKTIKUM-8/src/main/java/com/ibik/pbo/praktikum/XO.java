package com.ibik.pbo.praktikum;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class XO implements ActionListener {

	JFrame frame = new JFrame();
	JPanel ypanel = new JPanel();
	JPanel xpanel = new JPanel();
	JLabel textfield = new JLabel();
	JButton[] btn = new JButton[9];
	int chance_flag = 0;
	Random random = new Random();
	boolean pl1_chance;
	
	XO(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.getContentPane().setBackground(new Color(51, 53, 48));
		frame.setTitle("X & O");
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		textfield.setBackground(new Color(120, 20, 124));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Start", Font.ITALIC, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("X & O");
        textfield.setOpaque(true);
        
        ypanel.setLayout(new BorderLayout());
        ypanel.setBounds(0, 0, 800, 800);
        
        xpanel.setLayout(new GridLayout(3,3));
        xpanel.setBackground(new Color(150, 150, 150));
        
        for (int i = 0; i < 9; i++) {
        	btn[i] = new JButton();
        	xpanel.add(btn[i]);
        	btn[i].setFont(new Font("Start", Font.ITALIC, 120 ));
        	btn[i].setFocusable(false);
        	btn[i].addActionListener(this);
        	
        }
        
        ypanel.add(textfield);
        frame.add(ypanel, BorderLayout.NORTH);
        frame.add(xpanel);
        
        startGame();
	}
	
	
	
	
	public static void main(String[] args) {
		new XO();

	}
	
	public void startGame() {
		
		try {
			textfield.setText("Loading ...");
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int chance = random.nextInt(100);
		
		if (chance%2 == 0) {
			pl1_chance = true;
			textfield.setText("X turn");
		} else {
			pl1_chance = false;
			textfield.setText("O turn");
		}
	}
	
	public void gameOver(String s) {
		chance_flag = 0;
		Object[] option = {"Restart", "Exit"};
		int n = JOptionPane.showOptionDialog(frame, "Game Over\n"+s, "Game Over", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
		
		if (n==0) {
			frame.dispose();
			new XO();
			
		} else {
			frame.dispose();
		}
	}
	
	public void matchCheck() {
        if ((btn[0].getText() == "X") && (btn[1].getText() == "X") && (btn[2].getText() == "X")) {
            xWins(0, 1, 2);
        }
        else if ((btn[0].getText() == "X") && (btn[4].getText() == "X") && (btn[8].getText() == "X")) {
            xWins(0, 4, 8);
        }
        else if ((btn[0].getText() == "X") && (btn[3].getText() == "X") && (btn[6].getText() == "X")) {
            xWins(0, 3, 6);
        }
        else if ((btn[1].getText() == "X") && (btn[4].getText() == "X") && (btn[7].getText() == "X")) {
            xWins(1, 4, 7);
        }
        else if ((btn[2].getText() == "X") && (btn[4].getText() == "X") && (btn[6].getText() == "X")) {
            xWins(2, 4, 6);
        }
        else if ((btn[2].getText() == "X") && (btn[5].getText() == "X") && (btn[8].getText() == "X")) {
            xWins(2, 5, 8);
        }
       else if ((btn[3].getText() == "X") && (btn[4].getText() == "X") && (btn[5].getText() == "X")) {
            xWins(3, 4, 5);
        }
       else if ((btn[6].getText() == "X") && (btn[7].getText() == "X") && (btn[8].getText() == "X")) {
            xWins(6, 7, 8);
        }
      
        else if ((btn[0].getText() == "O") && (btn[1].getText() == "O") && (btn[2].getText() == "O")) {
            oWins(0, 1, 2);
        }
        else if ((btn[0].getText() == "O") && (btn[3].getText() == "O") && (btn[6].getText() == "O")) {
            oWins(0, 3, 6);
        }
        else if ((btn[0].getText() == "O") && (btn[4].getText() == "O") && (btn[8].getText() == "O")) {
            oWins(0, 4, 8);
        }
        else if ((btn[1].getText() == "O") && (btn[4].getText() == "O") && (btn[7].getText() == "O")) {
            oWins(1, 4, 7);
        }
        else if ((btn[2].getText() == "O") && (btn[4].getText() == "O") && (btn[6].getText() == "O")) {
            oWins(2, 4, 6);
        }
        else if ((btn[2].getText() == "O") && (btn[5].getText() == "O") && (btn[8].getText() == "O")) {
            oWins(2, 5, 8);
        }
        else if ((btn[3].getText() == "O") && (btn[4].getText() == "O") && (btn[5].getText() == "O")) {
            oWins(3, 4, 5);
        } else if ((btn[6].getText() == "O") && (btn[7].getText() == "O") && (btn[8].getText() == "O")) {
            oWins(6, 7, 8);
        }
        else if(chance_flag==9) {
            textfield.setText("Match Tie");
             gameOver("Match Tie");
        }
    }

	public void xWins(int x1, int x2, int x3) {
        btn[x1].setBackground(Color.RED);
        btn[x2].setBackground(Color.RED);
        btn[x3].setBackground(Color.RED);

        for (int i = 0; i < 9; i++) {
            btn[i].setEnabled(false);
        }
        textfield.setText("X wins");
        gameOver("X Wins");
	}

	public void oWins(int x1, int x2, int x3) {
        btn[x1].setBackground(Color.RED);
        btn[x2].setBackground(Color.RED);
        btn[x3].setBackground(Color.RED);

        for (int i = 0; i < 9; i++) {
            btn[i].setEnabled(false);
        }
        textfield.setText("O Wins");
        gameOver("O Wins");
    }
	
	@Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == btn[i]) {
                if (pl1_chance) {
                    if (btn[i].getText() == "") {
                        btn[i].setForeground(new Color(255, 0, 0));
                        btn[i].setText("X");
                        pl1_chance = false;
                        textfield.setText("O turn");
                        chance_flag++;
                        matchCheck();
                    }
                } else {
                    if (btn[i].getText() == "") {
                        btn[i].setForeground(new Color(0, 0, 255));
                        btn[i].setText("O");
                        pl1_chance = true;
                        textfield.setText("X turn");
                        chance_flag++;
                        matchCheck();
                    }
                }
            }
        }
    }

	
	
}