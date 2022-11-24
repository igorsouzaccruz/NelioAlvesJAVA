package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cargo;
import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Cargo> listCargo= new ArrayList<>();
		List<Funcionario> listFuncionario = new ArrayList<>();
		
					
		System.out.println("Número de cargos?: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Número do cargo: ");
			int numCargo = sc.nextInt();
			System.out.println("Valor da hora trabalhada?: ");
			double valorHora = sc.nextDouble();
			listCargo.add(new Cargo(numCargo, valorHora));
		}
		
		System.out.println("Numero de funcionários?: ");
		int f = sc.nextInt();
		
		for(int j = 0; j < f; j++) {
			
			System.out.println("Codigo do cargo: ");
			int codigoCargo = sc.nextInt();
			System.out.println("Sexo(F ou M): ");
			char sexo = sc.next().toUpperCase().charAt(0);
			System.out.println("Horas trabalhadas? ");
			double HT = sc.nextDouble();
			listFuncionario.add(new Funcionario(codigoCargo, sexo, HT, listCargo.get(codigoCargo-1)));
		}
		for(int j = 0; j < f; j++) {
		
		System.out.println();
		
		System.out.println("Funcionario: " + listFuncionario.get(j) + "Salario total: " + listFuncionario.get(j).salarioTotal());
		}
		
	}

}
