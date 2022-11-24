package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Empresa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Quantos funcionarios você deseja cadastrar?");
		int n = sc.nextInt();

		/* O programa em questão primeiramente localizados usando a função Locale no US para resolver problemas de pontuação
		 * Depois inserimos o scanner para adicionar os valores pelo teclado e a lista que vai ser usada para add os valores
		 * o problema solicita inicialmente a quantidade de funcionarios que deseja cadastra e adiciona a lista no final 
		 * para ser impresso na tela depois do for		*/
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("Adicionar Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Sexo (M ou F): "); 
			char sexo = sc.next().toUpperCase().charAt(0);
			System.out.print("Cargo: ");
			sc.nextLine();
			String cargo = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Preço por hora: ");
			double precoHora = sc.nextDouble();
			System.out.print("É terceirizado?(True ou False): ");
			boolean terceirizado = sc.nextBoolean();
			
			list.add(new Funcionario( name, sexo, cargo,idade, precoHora, terceirizado));
		}
		System.out.println();
		System.out.println(list);
	}

}
