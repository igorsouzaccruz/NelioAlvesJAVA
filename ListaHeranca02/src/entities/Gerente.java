package entities;

public class Gerente extends Empregado {
	
	private String nomeGerencia;

	public Gerente(String nome, Integer idade, String sexo, Double salario, String matricula, String nomeGerencia) {
		super(nome, idade, sexo, salario, matricula);
		this.nomeGerencia = nomeGerencia;
	}

	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
	
	@Override
	public String toString() {
		return "Saida de dados:  [Nome = " + getNome() + ", Idade = " + getIdade() + ", Sexo = " + getSexo() +
				", matricula = " + getMatricula() + 
				", Nome de gerencia = " + nomeGerencia + ", Valor INSS = " + valorInss() + "] Gerente.";
	}
}
