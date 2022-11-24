import java.util.Scanner;

public class Quarto {

	
	



	public void fatorial() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor de n:");
		int n = sc.nextInt();
		double prod =  1;
		int i = 0;
		while (i < n) {
			i = i+1;
			prod = prod * i; // ou prod *= i;
		}
		
		System.out.println("Fatorial de " + n + " = " + prod);
	}

}
