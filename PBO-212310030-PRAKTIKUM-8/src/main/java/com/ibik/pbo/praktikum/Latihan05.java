package com.ibik.pbo.praktikum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenu;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Latihan05 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Latihan05 frame = new Latihan05();
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
	public Latihan05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 579);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Undo");
		editMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Redo");
		editMenu.add(mntmNewMenuItem_2);
		menuBar.add(helpMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("About");
		helpMenu.add(mntmNewMenuItem);
		
		JMenuItem item1 = new JMenuItem("Open");
		JMenuItem item2 = new JMenuItem("Save");
		JMenuItem item3 = new JMenuItem("New");
		
		fileMenu.add(item1);
		fileMenu.add(item2);
		fileMenu.add(item3);
		

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("FORM PENILAIAN MATA KULIAH PBO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"NPM", "NAMA", "NILAI"},
				{"212310019", "MUHAMMAD RAFI ZUHAIR ARTADINATA", "A"},
				{"212310034", "RADEN RAYYAN PRATAMA RAKHMADIE", "A"},
				{"212310030", "DAPHNE HOLY", "A"},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(204);
		contentPane.add(table, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "MAHASISWA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NPM");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(45, 47, 93, 13);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(45, 70, 447, 48);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("NAMA");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(45, 192, 93, 13);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(45, 215, 447, 48);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("NILAI");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(45, 302, 93, 13);
		panel.add(lblNewLabel_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("A");
		rdbtnNewRadioButton.setBounds(117, 347, 41, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		rdbtnB.setBounds(187, 347, 41, 21);
		panel.add(rdbtnB);
		
		JButton save = new JButton("SAVE");
		save.setBounds(76, 394, 128, 48);
		panel.add(save);
		
		JButton delete = new JButton("DELETE");
		delete.setBounds(236, 394, 128, 48);
		panel.add(delete);
		
		JButton clear = new JButton("CLEAR");
		clear.setBounds(401, 394, 128, 48);
		panel.add(clear);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		rdbtnC.setBounds(256, 347, 41, 21);
		panel.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("D");
		rdbtnD.setBounds(323, 347, 41, 21);
		panel.add(rdbtnD);
		
		JRadioButton rdbtnE = new JRadioButton("E");
		rdbtnE.setBounds(401, 347, 41, 21);
		panel.add(rdbtnE);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);group.add(rdbtnB);group.add(rdbtnC);group.add(rdbtnD);group.add(rdbtnE);
	}
}
