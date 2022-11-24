import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		Rectangle rect = new Rectangle();
		System.out.println("Entre com width e height: ");
		rect.Width = sc.nextDouble();
		rect.Height = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", rect.area());
		System.out.printf("perimeter: %.2f%n", rect.perimeter());
		System.out.printf("diagonal: %.2f%n", rect.diagonal());
		sc.close();

	}

}
