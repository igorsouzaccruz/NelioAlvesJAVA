package entities;

public class Bebidas {
	
	private Double temperatura;
	private String nome;
	private boolean diet;

	public Bebidas() {
	}
	
	public Bebidas(Double temperatura, String nome, boolean diet) {
		this.temperatura = temperatura;
		this.nome = nome;
		this.diet = diet;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isDiet() {
		return diet;
	}

	public void setDiet(boolean diet) {
		this.diet = diet;
	}

	public void addGelo() {
		System.out.println("Com ou sem gelo");
	}
	
	public void refil() {
		System.out.println("solicitar refil");
	}
}
