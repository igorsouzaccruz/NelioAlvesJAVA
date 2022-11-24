package entities;

public class Petiscos {

	private String nome;
	private Double price;
	private String sabores;
	
	public Petiscos() {
	}
	
	public Petiscos(String nome, Double price, String sabores) {
		this.nome = nome;
		this.price = price;
		this.sabores = sabores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getSabores() {
		return sabores;
	}

	public void setSabores(String sabores) {
		this.sabores = sabores;
	}

	public void porcaoExtra() {
		System.out.println("Adiconar porção extra");
	}
	
	public void tamanhoPorcao() {
		System.out.println("definir tamanho da porção");
	}
	
}
