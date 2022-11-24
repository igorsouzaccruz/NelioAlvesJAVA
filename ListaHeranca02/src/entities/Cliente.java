package entities;

public class Cliente extends Pessoa {
	
	private Double valorDivida;
	private Integer anoNascim;
	
	public Cliente(String nome, Integer idade, String sexo, Double valorDivida, Integer anoNascim) {
		super(nome, idade, sexo);
		this.valorDivida = valorDivida;
		this.anoNascim = anoNascim;
	}

	public Double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(Double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public Integer getAnoNascim() {
		return anoNascim;
	}

	public void setAnoNascim(Integer anoNascim) {
		this.anoNascim = anoNascim;
	}

	@Override
	public String toString() {
		return "Saida de dados:  [Nome = " + getNome() + ", Idade = " + getIdade() + ", Sexo = " + getSexo()
				+ ", Valor da divida = " + valorDivida + ", Ano Nascimento = " + anoNascim + "] Cliente";
	}
	
	

}
