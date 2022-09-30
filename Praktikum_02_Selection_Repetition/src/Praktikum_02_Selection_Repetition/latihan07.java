package Praktikum_02_Selection_Repetition;

import java.util.Scanner;

public class latihan07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String jwb;
		
		Resto restoObj = new Resto();
		
		do {
			restoObj.chooseMenu();
			System.out.print("Apakah anda akan memesan kembali (Y/N) ? ");
			jwb = input.nextLine();
		}
		while(jwb.equals("Y"));
		
		input.close();
	}
}