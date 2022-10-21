package Praktikum_03_Swing_1;

import javax.swing.JOptionPane;

public class Latihan03 {

	public static void main(String[] args) {
		Biodata bio = new Biodata();
		JOptionPane jop = new JOptionPane()
		
		JOptionPane.showMessageDialog(null, "Selamat Datang!");
		final String WARN = "PERINGATAN!";
		
		String nama = JOptionPane.showInputDialog(null, "Masukkan nama lengkap anda:", "Input nama", JOptionPane.QUESTION_MESSAGE);
		
		if(nama.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nama harus diisi!", WARN, JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}
		
		String usia = JOptionPane.showInputDialog(null, "Masukkan usia anda:", "Input usia", JOptionPane.QUESTION_MESSAGE);
		final String REG_NUMERIK = "[0-9]+";
		
		if(usia.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Usia harus diisi!", WARN, JOptionPane.WARNING_MESSAGE);
		} else if(!usia.matches(REG_NUMERIK)) {
			JOptionPane.showMessageDialog(null, "isian harus numerik!", WARN, JOptionPane.WARNING_MESSAGE);
		}

		String alamat = JOptionPane.showInputDialog(null, "Masukkan alamat anda:", "Input Alamat", JOptionPane.QUESTION_MESSAGE);
		
		if(alamat.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Alamat harus diisi!", WARN, JOptionPane.QUESTION_MESSAGE);
		} else if (alamat.length() < 10) {
			JOptionPane.showMessageDialog(null, "Masukkan alamat min. 10 karakter!", WARN, JOptionPane.WARNING_MESSAGE);
		}
		
		int pUsia = Integer.parseInt(usia);
		
		
		bio.setData(nama, pUsia, alamat);
		bio.getData();
		
	}

}
