package entities;

public class Funcionario {
	
	private String nome;
	private char sexo;
	private String cargo;
	private Integer idade;
	private double precoHora;
	private boolean terceirizado;
	
	public Funcionario() {
	}

	public Funcionario(String nome, char sexo, String cargo, Integer idade, double precoHora, boolean terceirizado) {
		this.nome = nome;
		this.sexo = sexo;
		this.cargo = cargo;
		this.idade = idade;
		this.precoHora = precoHora;
		this.terceirizado = terceirizado;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}

	public boolean isTerceirizado() {
		return terceirizado;
	}

	public void setTerceirizado(boolean terceirizado) {
		this.terceirizado = terceirizado;
	}

	public void demitir() {
		System.out.println("Demitir funciário");
	}
	
	public void totalHorasTrabalhadas() {
		System.out.println("total de horas trabalhadas");
	}
	
	public void totalPagamentoMes() {
		System.out.println("Total a pagar somando horas trabalhas");
	}

	@Override
	public String toString() {
		return "\nFuncionario [nome= " + nome + ", sexo= " + sexo + ", cargo= " + cargo + ", idade= " + idade + ", precoHora= "
				+ precoHora + ", terceirizado= " + terceirizado + "]";
	}
	
	
}
