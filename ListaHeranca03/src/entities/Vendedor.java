package entities;

public class Vendedor extends Empregado{
	
	private Double valorVendas;
	private Double comissao;
	
	public Vendedor(String name, String endereco, String telefone, Integer codigoSetor, Double salarioBase,
			Double imposto, Double valorVendas, Double comissao) {
		super(name, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public Double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(Double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + (valorVendas*comissao);
	}

	@Override
	public String toString() {
		return "Vendedor [getName()=" + getName() + ", getEndereco()=" + getEndereco() + ", getTelefone()="
				+ getTelefone() + ", valorVendas=" + valorVendas + ", comissao=" + comissao + ", calcularSalario()="
				+ calcularSalario() + "]";
	}
	
	

}
