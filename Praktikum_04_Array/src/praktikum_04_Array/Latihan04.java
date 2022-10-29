package praktikum_04_Array;
import javax.swing.JOptionPane;

public class Latihan04 {

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
		
		
		if (x == null || x.length <1)
			return;
		int min = x[0];
		int max = x[0];
		
		
		for(int j = 0; j < x.length; j++) {
			output += "Array ke - " + (j + 1) + " = " + x[j] + "\n";
			
			if (max < x[j]) {
				max = x[j];
			}
			
			if(min > x[j]) {
				min = x[j];
			}
			
			
		}
		
		output += "\nMin = " + min + "\n" + "Max = " + max + "\n";
		
		JOptionPane.showMessageDialog(null, output, "Array", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
