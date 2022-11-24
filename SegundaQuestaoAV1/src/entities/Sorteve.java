package entities;

public class Sorteve {
	
	private String nome;
	private boolean diet;
	private Double price;
	
	public Sorteve() {
	}
	
	public Sorteve(String nome, boolean diet, Double price) {
		this.nome = nome;
		this.diet = diet;
		this.price = price;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void addBolaDeSorte() {
		System.out.println("adicionar bola");
	}
	
	public void addCalda() {
		System.out.println("Adicionar calda");
	}
}
