import java.util.Scanner;

public class Terceiro {

	private double soma = 0;
	private int i = 0;
	private int num;
	private int n;

	public void somaNumeros() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de números: ");
		n = sc.nextInt();

		while (i < n) {
			i = i + 1; // ou i++
			System.out.println("Número: ");
			num = sc.nextInt();
			soma = soma + num; // ou soma += num
		}
		System.out.println("Soma dos " + n + "números: " + soma);
	}
}