package entities;

public class CaminhaoBeta extends Caminhao {

	public CaminhaoBeta(Integer quantEquipamento) {
		super(quantEquipamento);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void inserePluviometro(Pluviometro pluviometro) {
		// realizar teste na Main para verificar no Arraylist se o pluviometro � diferente do contigo na lista at� ent�o.
			setQuantEquipamento(getQuantEquipamento()+1);			
	}
}
