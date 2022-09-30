package Praktikum_02_Selection_Repetition;

import java.util.Scanner;

public class latihan05 {

	public static void main(String[] args) {
		
		int i, j;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Masukkan jumlah baris :");
		
		int baris = input.nextInt(); 
		
		//untuk bagian atas
		for (i=1; i<=baris; i++) {
			for (j=i; j<=baris; j++) {
				System.out.print("*");//Mencetak
			}
			
			for (j=1; j<=(2*i-2); j++) {
				System.out.print(" ");//mencetak bagian yang kosong
			}
			
			for (j=i; j<=baris; j++) {
				System.out.print ("*");
			}
			System.out.print("\n");
		}
		
		//untuk bagian bawah
		for (i=1; i<=baris; i++) {
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			for (j=(2*i-2); j<(2*baris-2); j++) {
				System.out.print(" ");
			}
			
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
			
		}
		
		input.close();
	}

}
