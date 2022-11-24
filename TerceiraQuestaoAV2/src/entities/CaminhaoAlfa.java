package entities;

import java.util.List;

public class CaminhaoAlfa extends Caminhao {

	public CaminhaoAlfa(Integer quantEquipamento) {
		super(quantEquipamento);
	}

	@Override
	public void inserePluviometro(Pluviometro pluviometro) {
		if (pluviometro.getPeso() < (5000-getQuantEquipamento()*pluviometro.getPeso())){
			setQuantEquipamento(getQuantEquipamento()+1);
		}else 
			System.out.println("Cheio");
	}

	
		
}
