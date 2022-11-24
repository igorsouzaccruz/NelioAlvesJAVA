package application;

import entities.Administrador;
import entities.Empregado;
import entities.Fornecedor;
import entities.Operario;
import entities.Pessoa;
import entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		Pessoa forne = new Fornecedor("Jose", "rua maria 1239","988855544", 1000.00, 300.00);
		Pessoa empre = new Empregado("Ruan", "rua maria 1239", "988855544",01, 8000.00, 0.1);
		Pessoa adm = new Administrador("Ryan","rua", "988855544", 02, 8000.00, 0.1, 500.00);
		Empregado ope = new Operario("Jose", "qualquer", "9999999999", 03, 3000.00, 0.1, 5000.00, 0.05);
		Empregado vend = new Vendedor("Julio", "Qualquer", "9999999999", 04, 3000.00, 0.1, 5000.00, 0.05);
		
		System.out.println(forne);
		System.out.println(empre);
		System.out.println(adm);
		System.out.println(ope);
		System.out.println(vend);

	}

}
