package entities;

public class Peixe extends Animal{
	
	private String tipoHabitat;

	public Peixe(String name, Double peso, String tipoHabitat) {
		super(name, peso);
		this.tipoHabitat = tipoHabitat;
	}

	public String getTipoHabitat() {
		return tipoHabitat;
	}

	public void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}

	@Override
	public String toString() {
		return "Peixe [Habitat = " + tipoHabitat + ", Nome = " + getName() + ", Peso = " + getPeso() + "]";
	}	

}
