package entities;

public class Shampoo extends Produto{
	
	private Integer irritabilidade; // irritabilidade vai de 0 a 4

	public Shampoo(String nome, Double preco, Integer irritabilidade) {
		super(nome, preco);
		this.irritabilidade = irritabilidade;
	}

	@Override
	public String toString() {
		return "Shampoo [getNome()=" + getNome() + ", getPreco()=" + getPreco() + ", irritabilidade=" + irritabilidade
				+ "]";
	}
}
