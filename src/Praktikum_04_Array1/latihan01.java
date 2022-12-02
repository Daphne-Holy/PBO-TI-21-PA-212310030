package Praktikum_04_Array1;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class latihan01 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer> > matriks = new ArrayList<ArrayList<Integer> >();
		
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				String value = JOptionPane.showInputDialog(null, "masukkan element A [ " + i + " ] [ " + j + " ]");
				matriks.add(new ArrayList<Integer>());
				matriks.get(i).add(j, Integer.parseInt(value));
			}
		}
		String output = "";
		System.out.println("Matriks A");
		output += "Matriks A \n";
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				output += matriks.get(i).get(j) + " ";
				
			}
			output += "\n";
		}
		for (int a = 0; a <2 ; a++) {
			for (int b = 0; b<2; b++) {
				String value = JOptionPane.showInputDialog(null, "masukkan element B [ " + a + " ] [ " + b + " ] ");
				
				matriks.add(new ArrayList<Integer>());
				matriks.get(a).add(b, Integer.parseInt(value));
			}
		}
		System.out.println("Matriks B");
		output += "Matriks B \n";
		
		for (int a = 0; a <2; a++) {
			for (int b = 0; b < 2; b++) {
				output += matriks.get(a).get(b) + " ";
				
			}
			
			output += "\n";
		}
		
		JOptionPane.showMessageDialog(null, output);
	}

}
