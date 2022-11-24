package entities;

public abstract class Caminhao {

	private Integer quantEquipamento; // 

	public Caminhao(Integer quantEquipamento) {
		this.quantEquipamento = quantEquipamento;
	}	
	
	public Integer getQuantEquipamento() {
		return quantEquipamento;
	}


	public void setQuantEquipamento(Integer quantEquipamento) {
		this.quantEquipamento = quantEquipamento;
	}

	public abstract void inserePluviometro(Pluviometro pluviometro);
}
