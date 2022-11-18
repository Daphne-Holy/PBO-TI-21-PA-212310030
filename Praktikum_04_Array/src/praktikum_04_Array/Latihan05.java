package praktikum_04_Array;
import javax.swing.JOptionPane;

public class Latihan05 {

	public static void main(String[] args) {
		
		String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
		String output = " ";
		
		
		for (int i = 0; i < field.length; i++) {
		String input =  JOptionPane.showInputDialog(null, "Masukkan " + field[i] + ":", "Data Array ke-" + i, JOptionPane.QUESTION_MESSAGE);
			output += field[i] + ":" + " " + input + "\n";
			
		}
		
		JOptionPane.showMessageDialog(null, output);
		
		
	}	
}
