package entities;

public class Cargo {
	
	private Integer numCargo;
	private double valorHoraHomem;
	
	public Cargo() {
	}

	public Cargo(Integer numCargo, double valorHoraHomem) {
		this.numCargo = numCargo;
		this.valorHoraHomem = valorHoraHomem;
	}

	public Integer getNumCargo() {
		return numCargo;
	}

	public void setNumCargo(Integer numCargo) {
		this.numCargo = numCargo;
	}

	public double getvalorHoraHomem() {
		return valorHoraHomem;
	}

	public void setHoraHomem(double valorHoraHomem) {
		this.valorHoraHomem = valorHoraHomem;
	}

	@Override
	public String toString() {
		return "Cargo [numCargo=" + numCargo + ", valorHoraHomem=" + valorHoraHomem + "]";
	}
	
}
