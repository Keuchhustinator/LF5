//Maximilian Gurr SE-C-51
//Fahrkartenautomat A4.2.1

import java.util.Scanner;

public class A421_Rabattsystem {

	public static void main(String[] args) {
		
		double bestell, rabatt;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte geben Sie Ihren Bestellwert ein: ");
		bestell = sc.nextDouble();
		
		if (bestell <= 100)
			rabatt = 0.9;
		else if (bestell <= 500)
			rabatt =0.85;
		else 
			rabatt = 0.8;
		
		bestell = bestell * rabatt;
		
		System.out.printf("\nDer Bestellwert abzüglich Rabatt beträgt %.2f EUR.", bestell);
		
		sc.close();

	}

}
