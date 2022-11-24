import java.util.Scanner;

public class Quinto {

	public void serieFinita() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número de termos:");
		int n = sc.nextInt();
		System.out.println("Valor de x: ");
		float x = sc.nextFloat();
		float termo = x;
		float s = x;
		int i = 1;
		float x2 = x * x;
		for (int j = 1; j < n; j++) {
		i = i + 2; // ou i += 2;
		termo = (- termo * x2 ) / (i * (i - 1));
		s = s + termo; // ou s += termo;
		}
		System.out.println("S = " + s);
		}
}
