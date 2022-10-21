package Praktikum_03_Swing_1;

import javax.swing.JOptionPane;

public class Latihan02 {

	public static void main(String[] args) {
		Biodata bio = new Biodata();
		
		JOptionPane.showMessageDialog(null, "Selamat Datang!");
		
		String nama = JOptionPane.showInputDialog(null, "Masukkan nama lengkap anda:", "Input nama", JOptionPane.QUESTION_MESSAGE);
		String usia = JOptionPane.showInputDialog(null, "Masukkan usia anda:", "Input usia", JOptionPane.QUESTION_MESSAGE);
		String alamat = JOptionPane.showInputDialog(null, "Masukkan alamat anda:", "Input alamat", JOptionPane.QUESTION_MESSAGE);
		
		int pUsia = Integer.parseInt(usia);
		
		
		
		
		bio.setData(nama, pUsia, alamat);
		bio.getData();

	}

}
