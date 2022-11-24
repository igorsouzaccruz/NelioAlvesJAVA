package entities;

public class Biscoito extends Produto{
	
	private Integer quantCancer; // de 0 a 100

	public Biscoito(String nome, Double preco, Integer quantCancer) {
		super(nome, preco);
		this.quantCancer = quantCancer;
	}

	@Override
	public String toString() {
		return "Biscoito [getNome()=" + getNome() + ", getPreco()=" + getPreco() + ", quantCancer=" + quantCancer + "]";
	}
}
