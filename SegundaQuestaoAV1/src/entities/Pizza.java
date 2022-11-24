package entities;

public class Pizza {

	private String nome;
	private String sabor;
	private Integer fatias;
	
	public Pizza() {
	}

	public Pizza(String nome, String sabor, Integer fatias) {
		this.nome = nome;
		this.sabor = sabor;
		this.fatias = fatias;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Integer getFatias() {
		return fatias;
	}

	public void setFatias(Integer fatias) {
		this.fatias = fatias;
	}

	public void saborDaMetade() {
		System.out.println("Implementaria os sabores de ambas as metades");
	}
	
	public void terBroda() {
		System.out.println("Tem borda ou não seria um boolean");
	}
	
}
