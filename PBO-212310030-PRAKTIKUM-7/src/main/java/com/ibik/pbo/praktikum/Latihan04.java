package com.ibik.pbo.praktikum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Latihan04 {

	private JFrame frame;
	private JTable table;
	private JPanel panel;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JRadioButton rdbtnB;
	private JRadioButton rdbtnC;
	private JRadioButton rdbtnD;
	private JRadioButton rdbtnE;
	private JRadioButton rdbtnF;
	private JButton btnDelete;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Latihan04 window = new Latihan04();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Latihan04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 795, 376);
		
		JLabel lblNewLabel = new JLabel("FORM PENILAIAN MATAKULIAH PBO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"NPM", "NAMA", "NILAI"},
				{"212310019", "MUHAMMAD RAFI ZUHAIR ARTADINATA", "A"},
				{"212310030", "DAPHNE HOLY", "A"},
				{"212310034", "RADEN RAYYAN PRATAMA RAKHMADIE", "A"},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(204);
		frame.getContentPane().add(table, BorderLayout.EAST);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "MAHASISWA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setToolTipText("");
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NPM");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(32, 36, 45, 13);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(32, 59, 267, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Nama");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(32, 103, 45, 13);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(32, 127, 267, 34);
		panel.add(textField_1);
		
		lblNewLabel_3 = new JLabel("Nilai");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(32, 188, 45, 13);
		panel.add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("A");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(32, 218, 45, 21);
		panel.add(rdbtnNewRadioButton);
		
		rdbtnB = new JRadioButton("B");
		rdbtnB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnB.setBounds(72, 218, 45, 21);
		panel.add(rdbtnB);
		
		rdbtnC = new JRadioButton("C");
		rdbtnC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnC.setBounds(119, 218, 45, 21);
		panel.add(rdbtnC);
		
		rdbtnD = new JRadioButton("D");
		rdbtnD.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnD.setBounds(166, 218, 45, 21);
		panel.add(rdbtnD);
		
		rdbtnE = new JRadioButton("E");
		rdbtnE.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnE.setBounds(213, 218, 45, 21);
		panel.add(rdbtnE);
		
		rdbtnF = new JRadioButton("F");
		rdbtnF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnF.setBounds(260, 218, 45, 21);
		panel.add(rdbtnF);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setBounds(32, 251, 85, 34);
		panel.add(btnNewButton);
		
		btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(143, 251, 85, 34);
		panel.add(btnDelete);
		
		btnClear = new JButton("CLEAR");
		btnClear.setBounds(250, 251, 85, 34);
		panel.add(btnClear);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSaveAs = new JMenuItem("New");
		mnNewMenu.add(mntmSaveAs);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnNewMenu.add(mntmSave);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
	}
}
