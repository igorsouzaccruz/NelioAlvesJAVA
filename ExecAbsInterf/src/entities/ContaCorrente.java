package entities;

import java.text.MessageFormat;

public class ContaCorrente extends ContaBancaria implements Imprimivel {

	private Double taxaDeOperacao;

	public ContaCorrente(Integer numConta, Double saldo, Double taxaDeOperacao) {
		super(numConta, saldo);
		this.taxaDeOperacao = taxaDeOperacao;
	}

	public Double getTaxaDeOperacao() {
		return taxaDeOperacao;
	}

	public void setTaxaDeOperacao(Double taxaDeOperacao) {
		this.taxaDeOperacao = taxaDeOperacao;
	}

	@Override
	public double sacar(double parametro) {
		if((getSaldo() - parametro) < 0 ) {
			IllegalArgumentException erro = new IllegalArgumentException();
		    throw erro;
		}
		return getSaldo() - parametro - taxaDeOperacao;
		
	}

	@Override
	public void depositar(double parametro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String mostrarDados() {
		return MessageFormat.format("{0} - taxaDeOperacao = {1}", super.mostrarDados(),taxaDeOperacao);
	}

	@Override
	public double transferir(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
