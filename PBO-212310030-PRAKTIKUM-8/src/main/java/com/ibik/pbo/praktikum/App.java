package com.ibik.pbo.praktikum;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App extends JFrame implements ActionListener 
{
	private JButton login;
	private JButton KeyL;
	
	App(){
		setTitle ("Main Menu");
		setVisible(true);
		pack();
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateUI(this);
		
	}
	
    public static void main( String[] args ) {
    	new App();
    }
    
    public void GenerateUI (JFrame frame) {
    	
    	login = new JButton ("Login");
    	login.setLayout(null);
    	login.addActionListener(this);
    	frame.add(login);
    
    	
    	frame.setLayout(new FlowLayout());
    	
    }
    
    @Override
    public void actionPerformed (ActionEvent onClick) {
    	if(onClick.getSource() == login) {
			Login.main(null);
		}
    }
}
