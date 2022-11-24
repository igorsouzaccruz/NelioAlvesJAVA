package entities;

public class Cachorro extends Animal{
	
	private String raca;

	public Cachorro(String name, Double peso, String raca) {
		super(name, peso);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "Cachorro [Raça = " + raca + ", Nome = " + getName() + ", Peso = " + getPeso() + "]";
	}

}
