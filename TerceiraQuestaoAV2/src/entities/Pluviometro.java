package entities;

public class Pluviometro {
	
	protected String tipo;

	public Pluviometro(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getPeso() {
		if(tipo == "metalico") {
			return 10;
		}else if(tipo == "platico"){
			return 3;
		}else
		return 0;
	}

	public Integer getCapacidade() {
		if(tipo == "metalico") {
			return 1000;
		}else if(tipo == "platico"){
			return 500;
		}else
		return 0;
	}
}
