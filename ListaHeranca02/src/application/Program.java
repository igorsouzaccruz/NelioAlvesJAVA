package application;

import entities.Pessoa;

import entities.Cliente;
import entities.Gerente;
import entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		
				
		Pessoa cliente = new Cliente("João", 28, "Masculino", 1000.00, 1993);
		Pessoa gerente = new Gerente("Carlos", 35, "Masculino", 5000.00, "2000", "Sheila Maria");
		Pessoa vendedor = new Vendedor("Maria",18,"Feminino",8000.00, "300", 50000.00, 100);

		System.out.println(cliente);
		System.out.println(gerente);
		System.out.println(vendedor);
	}
}