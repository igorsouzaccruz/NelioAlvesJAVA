package application;

import entities.ContaBancaria;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.Relatorio;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria corrente = new ContaCorrente(2020, 1000.00, 15.00);
		ContaBancaria poupacao = new ContaPoupanca(3030, 1000.00, 1500.00);
		
		Relatorio relCorrente = new Relatorio(corrente);
	
		System.out.println(corrente.getSaldo());
		System.out.println(poupacao.getSaldo());
			
		System.out.println(corrente.sacar(500.00));
		System.out.println(poupacao.sacar(1500.00));
		
		relCorrente.gerarRelatorio();
		

		
	}

}
