import java.util.Locale;
import java.util.Scanner;

public class exerc02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		
		double area = Math.PI * Math.pow(A, 2);
		System.out.printf("Area do circulo: %.4f%n",area);
		
		sc. close();
	}

}
