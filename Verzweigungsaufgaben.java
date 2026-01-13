//Maximilian Gurr SE-C-51
//5.2.4
import java.util.Scanner;
public class Verzweigungsaufgaben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl1, zahl2;

		Scanner sc = new Scanner(System.in);
		
	//Aufgabe 1
		
		System.out.println("Bitte geben Sie 2 ganzzahlige Zahlen ein.");
		zahl1 = sc.nextInt();
		zahl2 = sc.nextInt();
		
		if (zahl1==zahl2) 
			System.out.println("Gleiche Werte!");
		
	//Aufgabe 2
		
		double double1, double2, zwischen = 0;
		
		System.out.println("Bitte geben Sie 2 reelle Zahlen ein.");
		double1 = sc.nextDouble();
		double2 = sc.nextDouble();
		
		if (double1 > double2) {
			zwischen = double1;
			double1 = double2;
			double2 = zwischen;
		}
		if (double1 == double2) 
			System.out.println(double1 +", "+ double2);
		else {
			System.out.println(double1);
			System.out.println(double2);
		}
			
	//Aufgabe 3
		
		int gerade;
		
		System.out.println("Bitte geben sie eine ganze Zahl ein.");
		gerade = sc.nextInt();
		
		if (gerade % 2 == 0) {
			gerade =gerade /2;
			System.out.println(gerade);
		}else
			System.out.println("Zahl ungerade");
			
	//Aufgabe 4
		
		double gross;
		
		System.out.println("Geben sie eine Zahl zwischen einschließlich 0 und 100 ein.");
		gross = sc.nextDouble();
		
		if ((gross < 0) || (gross >100))
			System.out.println("fehlerhafte Eingabe!");
		else {
			if (gross > 50) 
				System.out.println("Groß!");
			else 
				System.out.println("Klein!");
		}
		
		sc.close();
	}

}
