package com.ibik.pbo.praktikum;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class KeyL extends JFrame {
	
	public KeyL() {
		initUI();
	}
	
	
	private void initUI() {
		add(new Board());
		
		setTitle("Contoh KeyListener");
		setSize(400, 300);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		 
			KeyL l = new KeyL();
			l.setVisible(true);

	}

}
