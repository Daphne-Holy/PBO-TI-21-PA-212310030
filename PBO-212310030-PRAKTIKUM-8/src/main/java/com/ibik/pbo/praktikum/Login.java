package com.ibik.pbo.praktikum;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class Login extends JFrame{

	private JPanel contentPane;
	private final JCheckBox chckbxNewCheckBox = new JCheckBox("REMEMBER PASSWORD?");
	private JTextField textemail;
	private JPasswordField textpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(42, 30, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(42, 77, 64, 13);
		contentPane.add(lblNewLabel_1);
		
		textemail = new JTextField();
		textemail.setBounds(168, 27, 211, 19);
		contentPane.add(textemail);
		textemail.setColumns(10);
		chckbxNewCheckBox.setBounds(168, 107, 188, 36);
		contentPane.add(chckbxNewCheckBox);
		
		final JButton register = new JButton("Register");
		register.setBounds(103, 172, 85, 21);
		contentPane.add(register);
		
		
		final JButton login = new JButton("Login");
		login.setBounds(237, 172, 85, 21);
		contentPane.add(login);
		
		textpass = new JPasswordField();
		textpass.setBounds(168, 74, 211, 19);
		contentPane.add(textpass);
		
		register.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Register.main(null);
			}
			
		});
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textemail.getText().isEmpty() || new String (textpass.getPassword()).isEmpty()) {
					JOptionPane.showMessageDialog(null, "Masukkan Email dan Password terlebih dahulu",null, JOptionPane.WARNING_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Welcome USER", null, JOptionPane.INFORMATION_MESSAGE);
					Latihan05.main(null);
				}
			}
		});

	}


}
