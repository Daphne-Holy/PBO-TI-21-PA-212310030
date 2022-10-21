package Praktikum_03_Swing_1;

import javax.swing.JOptionPane;
public class Biodata {

	private String Fullname, alamat;
	private int usia;
	
	
	void setData(String valName, int valUsia, String valAlamat) {
		
		Fullname = valName;
		usia = valUsia;
		alamat = valAlamat;
	}
	
	void getData() {
		
			String output = "Biodata " + Fullname + "\n\n"
					+ "Nama : " + Fullname + "\n"
					+ "Usia : " + usia + "\n"
					+ "Alamat : " + alamat + "\n";
			
			JOptionPane.showMessageDialog(null, output, "Data Biodata", JOptionPane.INFORMATION_MESSAGE);
	}

}
