package com.ibik.pbo.praktikum;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Sprite {

	private int dx;
	private int dy;
	private int x = 40;
	private int y = 60;
	private int w;
	private int h;
	private Image image;
	
	public Sprite() {
		
		loadImage();
	}

	private void loadImage() {
		ImageIcon ii = new ImageIcon("C:/Users/Daphne Holy/Pictures/butterfly.png");
		image = ii.getImage();
		
		w = image.getWidth(null);
		h = image.getHeight(null);
	}
	
	public void move() {
		
		x += dx;
		y += dy;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return w;
	}
	
	public int getHeight() {
		return h;
	}
	
	public Image getImage() {
		return image;
	}
	
	
	public void KeyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT) {
			dx = -2;
		}
		
		if(key == KeyEvent.VK_RIGHT) {
			dx = 2;
		}
		
		if(key == KeyEvent.VK_UP) {
			dy = -2;
		}
		
		if(key == KeyEvent.VK_DOWN) {
			dy = 2;
		}
	}
	
	public void KeyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
		
		if(key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
			dy = 0;
		}
	}
	
}
