package Praktikum_02_Selection_Repetition;

import java.util.Scanner;

public class latihan04 {

	public static void main(String[] args) {
		
		int a, sum = 1;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Masukkan angka (tidak boleh kurang dari 20) : ");
		a = input.nextInt();
		
		for (int i = 1; i <= a; i++) {
			sum = sum * i;
			String k = (i==a) ? "="+sum: "*";
			
			System.out.print(i + k);
		}
		
		input.close();

	}

}
