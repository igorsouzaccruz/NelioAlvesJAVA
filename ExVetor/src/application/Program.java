package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		Room[] vect = new Room[10];
		
		System.out.println("Quantos alunos vão aluga? ");
		int n = sc.nextInt();
		
			
		
		for (int i = 1; i <=n;  i++) {
			System.out.println();
			System.out.println("Alugador " + i + ":");
			System.out.println("Name: ");	
			sc.nextLine();	
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new Room(name, email);
		}
		
		System.out.println("Quartos lotados: ");
				for(int i = 0; i < 10; i++) {
					if(vect[i] != null) {
						System.out.println();
			System.out.printf(i + " : " + vect[i] );
		}
		}
		
		sc.close();
	}

}
