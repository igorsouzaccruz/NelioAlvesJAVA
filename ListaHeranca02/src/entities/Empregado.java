package entities;

public class Empregado extends Pessoa {
	
	private Double salario;
	private String matricula;
	
	public Empregado(String nome, Integer idade, String sexo, Double salario, String matricula) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double valorInss() {
		return salario*0.11;
	}
	
	
	

}
