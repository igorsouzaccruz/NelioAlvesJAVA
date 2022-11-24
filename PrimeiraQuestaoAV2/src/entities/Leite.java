package entities;

public class Leite extends Produto{
	
	private Integer validade; // dias

	public Leite(String nome, Double preco, Integer validade) {
		super(nome, preco);
		this.validade = validade;
	}

	@Override
	public String toString() {
		return "Leite [getNome()=" + getNome() + ", getPreco()=" + getPreco() + ", validade=" + validade + "]";
	}
}
