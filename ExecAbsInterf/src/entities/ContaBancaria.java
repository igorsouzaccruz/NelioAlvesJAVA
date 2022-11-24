package entities;

import java.text.MessageFormat;

public abstract class ContaBancaria implements Imprimivel {

	private Integer numConta;
	private Double saldo;
	
	public ContaBancaria(Integer numConta, Double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public abstract double sacar(double parametro); 
	
	public abstract void depositar(double parametro);
	
	public abstract double transferir(double valor);

	@Override
	public String mostrarDados() {
		return MessageFormat.format("Conta: {0} - Saldo: {1}",numConta,saldo);
	}	
	
}
