package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("Qual o valor do dolar?");
		double dolar = sc.nextDouble();
		
		System.out.println("Quantos dolares vai compra?");
		double quant = sc.nextDouble();
		
		double r = CurrencyConverter.converte(dolar, quant);
		System.out.printf("Convertendo %.2f%n",r);
		sc.close();
	}

}
