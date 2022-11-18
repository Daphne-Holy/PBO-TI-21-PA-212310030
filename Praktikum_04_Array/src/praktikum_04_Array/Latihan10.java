package praktikum_04_Array;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan10 {

	public static void main(String[] args) {
		
		ArrayList<String> field = new ArrayList<String>();
		field.add("Nama Lengkap");
		field.add("Alamat");
		field.add("No Telp");
		
		JOptionPane jop = new JOptionPane();
		String output = "";
		
		for(int i = 0; i < field.size(); i++) {
			String isi = jop.showInputDialog(null, "Masukkan " + field.get(i) + ":", "Data array ke-" + i, jop.QUESTION_MESSAGE);
			output += field.get(i) + ":" + " " + isi + "\n";
		}
		
		jop.showMessageDialog(null, output);
	}

}
