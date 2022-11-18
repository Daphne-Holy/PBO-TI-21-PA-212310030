package praktikum_04_Array;
import javax.swing.JOptionPane;

public class Latihan03 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Masukkan jumlah array");
		int parseInput= Integer.parseInt(input);
		int x[] = new int[parseInput];
		
		for(int i = 0; i < x.length; i++) {
			String inputArray = JOptionPane.showInputDialog(null, "Masukkan input array ke - " + (i + 1), "Data ke - " + (i + 1) , JOptionPane.QUESTION_MESSAGE);
			int pArray = Integer.parseInt(inputArray);
			x[i] = pArray;
		}
		
		String output = "";

		
		for(int j = 0; j < x.length; j++) {
			output += "Array ke - " + (j + 1) + " = " + x[j] + "\n";
			
		}
		
		JOptionPane.showMessageDialog(null, output, "Array", JOptionPane.INFORMATION_MESSAGE);
		
	}

}