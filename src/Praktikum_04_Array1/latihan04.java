package Praktikum_04_Array1;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class latihan04 {
    
    public static ArrayList<String> head = new ArrayList<String>();

    public static void main(String[] args) {
        head.add("Nama Lengkap");
        head.add("Alamat");
        head.add("No. Telp");

        ArrayList<ArrayList<String>> title_values = new ArrayList<ArrayList<String>>();

        for(int i = 0; i < head.size(); i++) {
            title_values.add(new ArrayList<String>());
            for(int j = 0; j < head.size(); j++) {
                String values = JOptionPane.showInputDialog(null,
                                "Masukkan " + head.get(j) + ":",
                                "Data input ke - " + i,
                                JOptionPane.QUESTION_MESSAGE);
                title_values.get(i).add(j, values);
            }
        }

        String print_data = PrintArr(title_values);

        JOptionPane.showMessageDialog(null, print_data, "Output", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String PrintArr(ArrayList<ArrayList<String>> val) {
        String output = "";

        for(int i = 0; i < head.size(); i++) {
            for(int j = 0; j < head.size(); j++) {
                output += head.get(j) + ": " + val.get(i).get(j) + "\n";
            }
            output += "\n";
        }

        return output;
    }
    
}

