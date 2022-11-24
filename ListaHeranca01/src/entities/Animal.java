package entities;

public class Animal {

	private String name;
	private Double peso;
	
	public Animal() {
	}

	public Animal(String name, Double peso) {
		this.name = name;
		this.peso = peso;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
}
