package Praktikum_02_Selection_Repetition;

import java.util.Scanner;

public class latihan02 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Masukkan NPM anda : ");
		int cek = 0;
		int a = input.nextInt();
		
		System.out.print("\nMenentukan apakah NPM anda bilangan prima atau bukan...");
		
		
		for (int i = 2 ; i <= a; i++) {
			
			if (a%i==0) {
				cek++;
			}
		}
		
		if (cek==1) {
			
			System.out.print(a+ "\ntermasuk bilangan prima");
		} else {
			System.out.print(a+ "\nbukan termasuk bilangan prima karna dapat dibagi dengan 2");
		}
		
		input.close();
	}

}
