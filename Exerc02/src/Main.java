import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double i = 0;	
		if (x > 4500) {
			i = (x - 4500)*0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			
		}
		else if (x < 4500 && x >= 3000) {
			i = (x - 3000.01)*0.18  + 1000.0 * 0.08;
		}
		else if (x < 3000 && x >= 2000) {
			i = (x - 2000)*0.08;				
		}
		else {
			System.out.println("isento");
		}
		System.out.printf("Valor R$: %.2f%n",i);
		sc.close();
	
	}

}
