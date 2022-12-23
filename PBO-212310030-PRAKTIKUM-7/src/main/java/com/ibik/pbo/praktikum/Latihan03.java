package com.ibik.pbo.praktikum;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.*;

public class Latihan03 extends JFrame{
	private JLabel email, password;
	private JCheckBox remember;
	private JTextField textemail;
	private JPasswordField textpassword;
	private JButton btn_submit;
	
	Latihan03() {
		setTitle("Latihan 03");
		setLocationRelativeTo(null);
		setVisible(true);
		pack();
		setResizable(true);
		setSize(300, 350);
		GenerateUI(this);
		setLayout(null);
	}
	public static void main(String[] args) {
		new Latihan03();
	}
	
	private static boolean isPasswordCorrect(char[] input) {
		boolean isCorrect = true;
		char[] correctPassword = {'2','1','2','3','1','0','0','3','0'};
		
		if(input.length !=correctPassword.length) {
			isCorrect = false;
		} else {
			isCorrect = Arrays.equals (input, correctPassword);
		}
		
		Arrays.fill(correctPassword, '0');
		return isCorrect;
	}
	

	private void GenerateUI(JFrame frame) {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		frame.setContentPane(mainPanel);
		
		email = new JLabel("Email");
		textemail = new JTextField();
		textemail.setBounds(100, 20, 160, 30);
		email.setBounds(20, 20, 80, 30);
		frame.add(email); frame.add(textemail);
		
		password = new  JLabel("Password");
		textpassword = new JPasswordField();
		textpassword.setBounds(100, 80, 160, 30);
		password.setBounds(20, 75, 80, 30);
		frame.add(password); frame.add(textpassword);
		
		remember = new JCheckBox("Remember Account? ");
		remember.setBounds(75, 130, 200, 30);
		frame.add(remember);
		
		btn_submit = new JButton("SUBMIT");
		btn_submit.setBounds(75, 180, 150, 30);
		frame.add(btn_submit);
		
	
		
		
		btn_submit.addActionListener(new ActionListener() {


			@Override
			public void actionPerformed(ActionEvent e) {
				char[] input = textpassword.getPassword();
				
					if(textemail.getText() == null || textpassword.getPassword() == null) {
						JOptionPane.showMessageDialog(null, "isi data dengan benar!", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
				} else {
					if (isPasswordCorrect(input) && e.getSource() == btn_submit) {
						JOptionPane.showMessageDialog(null, "Welcome User!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "Data yang anda masukkan salah", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
					}
				}
					
					
				
			}

			
		});
	}
}