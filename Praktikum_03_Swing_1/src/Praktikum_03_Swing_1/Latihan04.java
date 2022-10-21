package Praktikum_03_Swing_1;

import javax.swing.JOptionPane;

public class Latihan04 {

	public static void main(String[] args) {
		Biodata bio = new Biodata();
		
		JOptionPane.showMessageDialog(null, "Selamat Datang!");
		final String WARN = "PERINGATAN!";
		boolean isLanjut = true;
		
		while(isLanjut) {
			String nama = JOptionPane.showInputDialog(null, "Masukkan Nama lengkap anda:", "Input Nama", JOptionPane.QUESTION_MESSAGE);
			
			if(nama.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong!", WARN, JOptionPane.WARNING_MESSAGE);
				System.exit(0);
			}
			
			String usia = JOptionPane.showInputDialog(null, "Masukkan usia anda:", "Input usia", JOptionPane.QUESTION_MESSAGE);
			final String REG_NUMERIK = "[0-9]+";
			
			if(usia.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Usia tidak boleh kosong!", WARN, JOptionPane.WARNING_MESSAGE);
			} else if (!usia.matches(REG_NUMERIK)) {
				JOptionPane.showMessageDialog(null, "Isian usia harus numerik!", WARN, JOptionPane.WARNING_MESSAGE);
				System.exit(0);
			}
			
			
			String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat anda:", "Input Alamat", JOptionPane.QUESTION_MESSAGE);
			
			if(alamat.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Alamat harus diisi!", WARN, JOptionPane.WARNING_MESSAGE);
			} else if (alamat.length() <10) {
				JOptionPane.showMessageDialog(null, "Masukkan Alamat min. 10 karakter!", WARN, JOptionPane.WARNING_MESSAGE);
			}
			
			int pUsia = Integer.parseInt(usia);
			
			bio.setData(nama, pUsia, alamat);
			bio.getData();
			
			int keluar = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?", "Keluar?", JOptionPane.YES_NO_OPTION);
			
			if (keluar == JOptionPane.YES_OPTION) {
				isLanjut = false;
			} else {
				isLanjut = true;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Terimakasih!");
	}

}
