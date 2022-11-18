package praktikum_04_Array;
import javax.swing.JOptionPane;

public class Latihan06 {

	public static void main(String[] args) {
		int arr[][] = new int[2][2];
		JOptionPane jop = new JOptionPane();
		String output = "Matriks A" + "\n";
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				String a = jop.showInputDialog(null, "Masukkan angka:", "Matrix A" + "[" + i + "]" + "[" + j + "]", jop.QUESTION_MESSAGE);
				output += Integer.parseInt(a) + " ";
			}
			output += "\n";
		}
		
		output += "Matriks B" + "\n";
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				String b = jop.showInputDialog(null, "Masukkan angka:", "Matrix B" + "[" + i + "]" + "[" + j + "]", jop.QUESTION_MESSAGE);
				output += Integer.parseInt(b) + " ";
			}
			output += "\n";
		}
		
		jop.showMessageDialog(null, output);
	}

	}

