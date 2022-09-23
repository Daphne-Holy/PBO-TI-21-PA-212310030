import java.util.Scanner;

public class Latihan03 {
	
	public static void main (String[] args) {
		
		Scanner nilai = new Scanner (System.in);//untuk angka
		
		float L, K, s1, s2, s3, s, tinggi, luasP, volume;
		double keliling, luas;//untuk nilai angka desimal
		System.out.println("Menghitung Luas Layang-layang");
		
		{ 
			int d1, d2;// method menjadi integer
			System.out.println("Diagonal 1 = ");
			d1 = nilai.nextInt();//Penginputan data
			
			System.out.println("Diagonal 2 = ");
			d2 = nilai.nextInt();//Penginputan data
			
			luas = d1 * d2 /2;
			
			System.out.println("Luas Layang-layang =" +luas);//mencetak hasil akhir luas layang-layang
		}
		
		System.out.println("Menghitung Keliling Layang-layang");
		
		int sisiX, sisiY;
		System.out.println("Sisi X = ");
		sisiX = nilai.nextInt();
		System.out.println("Sisi Y = ");
		sisiY = nilai.nextInt();
		keliling = 2*sisiX + 2*sisiY;
		
		System.out.println("Keliling Layang-layang = "+keliling);
		System.out.println("Hasil akhir dari Luas Layang-layang = "+luas+" dan Keliling = "+keliling);
		
		System.out.println("Luas Permukaan & Volume Prisma Segi 3");
		System.out.println("Masukkan Luas Alas : ");
		L = nilai.nextFloat();
		
		System.out.println("Masukkan Sisi 1 : ");
		s1 = nilai.nextFloat();
		System.out.println("Masukkan Sisi 2 : ");
		s2 = nilai.nextFloat();
		System.out.println("Masukkan Sisi 3 : ");
		s3 = nilai.nextFloat();
		
		s = s1+s2+s3;
		
		System.out.println("Keliling Alas : " +s);
		
		
		
		System.out.println("Masukkan Tinggi : ");
		tinggi = nilai.nextFloat();
		
		luasP = (2*L)+(s+tinggi);
		System.out.println("Luas Permukaannya : " + luasP);
		
		volume = L * tinggi;
		System.out.println("Volume : "+volume);
		}

	
