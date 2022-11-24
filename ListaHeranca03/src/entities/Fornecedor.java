package entities;

public class Fornecedor extends Pessoa{
	
	private Double valorCredito;
	private Double valorDivida;
	
	public Fornecedor(String name, String endereco, String telefone, Double valorCredito, Double valorDivida) {
		super(name, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(Double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public Double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(Double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo() {
		return valorCredito - valorDivida;
	}

	@Override
	public String toString() {
		return "Fornecedor [getName()=" + getName() + ", getEndereco()=" + getEndereco() + ", getTelefone()="
				+ getTelefone() + ", valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + ", obterSaldo()="
				+ obterSaldo() + "]";
	}
	
}
