import java.util.Locale;
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = A+B;
		System.out.println("SOMA = " + C);
		
		sc.close();
	}

}
