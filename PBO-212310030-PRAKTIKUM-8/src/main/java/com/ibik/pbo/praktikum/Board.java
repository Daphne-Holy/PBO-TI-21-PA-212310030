package com.ibik.pbo.praktikum;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

	private Timer timer;
	private Sprite sprite;
	private final int DELAY = 10;
	
	public Board() {
		initBoard();
	}
	
	private void initBoard() {
		
		addKeyListener(new TAdapter());
		setBackground(Color.black);
		setFocusable(true);
		
		sprite = new Sprite();
		
		timer = new Timer(DELAY, this);
		timer.start();
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		doDrawing(g);
		
		Toolkit.getDefaultToolkit().sync();
	}
	
	private void doDrawing(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(sprite.getImage(), sprite.getX(), sprite.getY(), this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		step();
	}
	
	private void step() {
		sprite.move();
		
		repaint(sprite.getX()-1, sprite.getY()-1, sprite.getWidth()+2, sprite.getHeight()+2);
	}
	
	private class TAdapter extends KeyAdapter {
		
		@Override
		public void keyReleased(KeyEvent e) {
			sprite.KeyReleased(e);
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			sprite.KeyPressed(e);
		}
	}
}
