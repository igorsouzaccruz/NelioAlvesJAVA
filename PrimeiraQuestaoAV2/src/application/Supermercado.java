package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Biscoito;
import entities.Leite;
import entities.Shampoo;

public class Supermercado {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shampoo> shampoo = new ArrayList<>();
		List<Biscoito> biscoito = new ArrayList<>();
		List<Leite> leite = new ArrayList<>();
		
		shampoo.add(new Shampoo("Dove",15.5,0));
		shampoo.add(new Shampoo("Elseve",17.5,4));
		shampoo.add(new Shampoo("Pantene",10.9,2));
		
		biscoito.add(new Biscoito("Oreo",8.0,50));
		biscoito.add(new Biscoito("Maria",4.0,20));
		biscoito.add(new Biscoito("Passatempo",9.5,70));
		
		leite.add(new Leite("Betania",6.0,60));
		leite.add(new Leite("Italac",5.90,58));
		leite.add(new Leite("Piracanjuba",5.8,70));
		
		System.out.println(shampoo);
		System.out.println();
		System.out.println(biscoito);
		System.out.println();
		System.out.println(leite);
		System.out.println();
		
		
		

	}

}
