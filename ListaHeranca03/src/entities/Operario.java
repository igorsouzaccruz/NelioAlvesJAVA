package entities;

public class Operario extends Empregado {
	
	private Double valorProducao;
	private Double comissao;
	
	public Operario(String name, String endereco, String telefone, Integer codigoSetor, Double salarioBase,
			Double imposto, Double valorProducao, Double comissao) {
		super(name, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public Double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(Double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + (valorProducao*comissao);
	}

	@Override
	public String toString() {
		return "Operario [getName()=" + getName() + ", getEndereco()=" + getEndereco() + ", getTelefone()="
				+ getTelefone() + ", valorProducao=" + valorProducao + ", comissao=" + comissao + ", calcularSalario()="
				+ calcularSalario() + "]";
	}
	
	
	

}
