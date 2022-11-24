package application;

import java.util.Locale;
import java.util.Scanner;

import entities.conta;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		conta account;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there a initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial value: ");
			double initialDeposit = sc.nextDouble();
			account = new conta(number,holder,initialDeposit);
		}
		else {
			account = new conta(number,holder); 
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposite(depositValue);
		System.out.println("Updated: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated: ");
		System.out.println(account);
		sc.close();
	} 

}
