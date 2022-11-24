package entities;

public class Administrador extends Empregado{
	
	private Double ajudeDeCusto;

	public Administrador(String name, String endereco, String telefone, Integer codigoSetor, Double salarioBase,
			Double imposto, Double ajudeDeCusto) {
		super(name, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudeDeCusto = ajudeDeCusto;
	}

	public Double getAjudeDeCusto() {
		return ajudeDeCusto;
	}

	public void setAjudeDeCusto(Double ajudeDeCusto) {
		this.ajudeDeCusto = ajudeDeCusto;
	}
	
	@Override
	public double calcularSalario() {
		return (getSalarioBase() + ajudeDeCusto) - getSalarioBase()*getImposto() ;
	}

	@Override
	public String toString() {
		return "Administrador [getCodigoSetor()=" + getCodigoSetor() + ", getImposto()=" + getImposto() + ", getName()="
				+ getName() + ", getEndereco()=" + getEndereco() + ", getTelefone()=" + getTelefone()
				+ ", ajudeDeCusto=" + ajudeDeCusto + ", calcularSalario()=" + calcularSalario() + "]";
	}

	
}
