package application;

import java.util.Locale;
import java.util.Scanner;

import entities.aluno;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		aluno note = new aluno();
		
		System.out.println("Nome : ");
		note.nome = sc.nextLine();
		System.out.println("Nota primeiro semestre : ");
		note.a = sc.nextDouble();
		System.out.println("Nota segundo semestre : ");
		note.b = sc.nextDouble();
		System.out.println("Nota terceiro semestre : ");
		note.c = sc.nextDouble();
		
		double media = note.media();
		note.pass(media);
		
		
		sc.close();
	}

}
