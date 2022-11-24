package entities;

import java.text.MessageFormat;

public class ContaPoupanca extends ContaBancaria{
	
	private Double limite;

	public ContaPoupanca(Integer numConta, Double saldo, Double limite) {
		super(numConta, saldo);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public double sacar(double parametro) {
		if(limite < parametro)  {
			IllegalArgumentException erro = new IllegalArgumentException();
		    throw erro;
		}
		return getSaldo() - parametro;
	}

	@Override
	public void depositar(double parametro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String mostrarDados() {
		return MessageFormat.format("{0} - limite = {1}",super.mostrarDados(),limite);
	}

	@Override
	public double transferir(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
