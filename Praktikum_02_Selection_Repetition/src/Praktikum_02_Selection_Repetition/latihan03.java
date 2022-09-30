package Praktikum_02_Selection_Repetition;

import java.util.Scanner;

public class latihan03 {

	public static void main(String[] args) {
		int x;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Menu Sarapan:");
		System.out.print("\n 1. Nasi Goreng");
		System.out.print("\n 2. Bubur Ayam");
		System.out.print("\n 3. Soto Ayam");
		
		System.out.print("\n Masukkan pilihan : ");
		
		x = input.nextInt();
		
		switch (x) {
		
		case 1:
			System.out.println("Anda memesan Nasi Goreng dengan harga Rp 22.000,-");
			break;
			
		case 2:
			System.out.println("Anda memesan Bubur Ayam dengan harga Rp 15.000,-");
			break;
		case 3:
			System.out.println("Anda memesan Soto Ayam dengan harga Rp 25.000,-");
			break;
			
		default:
			System.out.print("Maaf menu yang anda masukkan salah.");
		}
		
		input.close();

	}

}
