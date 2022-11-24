package entities;

public class Vendedor extends Empregado {

	private Double valorVendas;
	private Integer qntVendas;
	
	public Vendedor(String nome, Integer idade, String sexo, Double salario, String matricula, Double valorVendas,
			Integer qntVendas) {
		super(nome, idade, sexo, salario, matricula);
		this.valorVendas = valorVendas;
		this.qntVendas = qntVendas;
	}

	public Double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(Double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public Integer getQntVendas() {
		return qntVendas;
	}

	public void setQntVendas(Integer qntVendas) {
		this.qntVendas = qntVendas;
	}
	
	@Override
	public String toString() {
		return "Saida de dados:  [Nome =" + getNome() + ", Salario =" + getSalario() + ", Valor das Vendas =" + valorVendas +
				"Quantidade de vendas" + qntVendas + "] Vendedor.";
	}
}
