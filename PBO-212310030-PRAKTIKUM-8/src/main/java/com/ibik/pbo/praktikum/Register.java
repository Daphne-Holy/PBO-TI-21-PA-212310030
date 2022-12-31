package com.ibik.pbo.praktikum;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textfull;
	private JTextField textemail;
	private JTextField textphone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		new Register();
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FullName");
		lblNewLabel.setBounds(33, 33, 85, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(33, 80, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone");
		lblNewLabel_2.setBounds(33, 130, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(33, 181, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Citizenship");
		lblNewLabel_4.setBounds(33, 241, 85, 13);
		contentPane.add(lblNewLabel_4);
		
		final JButton submit = new JButton("SUBMIT");
		submit.setBounds(220, 296, 85, 21);
		contentPane.add(submit);
		
		textfull = new JTextField();
		textfull.setBounds(174, 33, 234, 19);
		contentPane.add(textfull);
		textfull.setColumns(10);
		
		textemail = new JTextField();
		textemail.setColumns(10);
		textemail.setBounds(174, 80, 234, 19);
		contentPane.add(textemail);
		
		textphone = new JTextField();
		textphone.setColumns(10);
		textphone.setBounds(174, 130, 234, 19);
		contentPane.add(textphone);
		
		final JRadioButton male_btn = new JRadioButton("Male");
		male_btn.setBounds(189, 180, 103, 21);
		contentPane.add(male_btn);
		
		final JRadioButton female_btn = new JRadioButton("Female");
		female_btn.setBounds(305, 180, 103, 21);
		contentPane.add(female_btn);
		
		final ButtonGroup group = new ButtonGroup();
		group.add(male_btn);
		group.add(female_btn);
		
		final JComboBox citizen = new JComboBox();
		citizen.setModel(new DefaultComboBoxModel(new String[] {"Indonesia", "Japan", "India", "USA", "England"}));
		citizen.setBounds(174, 240, 234, 21);
		contentPane.add(citizen);
		
		setResizable(false);
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textfull.getText().isEmpty() || textemail.getText().isEmpty() || textphone.getText().isEmpty() && !group.getSelection().isSelected()) {
					JOptionPane.showMessageDialog(null, "masukkan data dengan benar",null, JOptionPane.WARNING_MESSAGE);
				}
				else {
					if(e.getSource() == submit) {
						String output = "Data anda : \n \n";
						String outputKelamin = "";
						
						if(male_btn.isSelected()) {
							outputKelamin = male_btn.getText();
							output += "Fullname : " + textfull.getText() + "\n" + "Email : " + textemail.getText() + "\n" + "Phone : " + textphone.getText() + "\n" + "Gender : " + outputKelamin + "\n" + "Citizenship : " + citizen.getSelectedItem();
						}
						else {
							outputKelamin = female_btn.getText();
							output += "Fullname : " + textfull.getText() + "\n" + "Email : " + textemail.getText() + "\n" + "Phone : " + textphone.getText() + "\n" + "Gender : " + outputKelamin + "\n" + "Citizenship : " + citizen.getSelectedItem();

						}
						
						JOptionPane.showMessageDialog(null, output);
						Login.main(null);
					}
				}
			}
			
		});
		
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}
}
