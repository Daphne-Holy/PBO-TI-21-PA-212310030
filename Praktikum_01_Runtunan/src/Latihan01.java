import java.util.Scanner;

public class Latihan01 {

	public static void main(String[] args) {
		
		double celcius, fahrenheit, rheamur, kelvin;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan suhu yang akan dihitung:");

		celcius = input.nextInt();//suhu celcius
		fahrenheit = (9/5 * celcius ) + 32;//suhu fahrenheit
		rheamur = celcius * 4/5;//suhu rheamur
		kelvin = celcius + 273.15;//suhu kelvin
		
		System.out.println("Suhu celcius: " + celcius);
		System.out.println("Suhu kelvin: " + kelvin);
		System.out.println("Suhu rheamur: " + rheamur);
		System.out.println("Suhu fahrenheit: " + fahrenheit);
	}
}
