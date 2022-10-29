package praktikum_04_Array;
import javax.swing.JOptionPane;

public class Latihan05 {

	public static void main(String[] args) {
		
		String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
		
		
		
		for (int i = 0; i < field.length; i++) {
		String input =  JOptionPane.showInputDialog(null, field[i], "Masukkan Data", JOptionPane.QUESTION_MESSAGE);

		}
		
		String output = " ";
		
		for(int j = 0; j < field.length; j++) {
			output += "Data ke - " + (j+1) + " : " + field[j] + "\n"; 
		}
		
		JOptionPane.showMessageDialog(null, output, "Data", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
