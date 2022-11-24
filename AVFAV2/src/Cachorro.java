public class Cachorro extends Mamifero {

	private boolean lateMuito;

	public Cachorro(String name, boolean lateMuito) {
		super(name);
		this.lateMuito = lateMuito;
	}

	public void setLateAlto() {
	}
	public void setLateBaixo() {
	}
	
	@Override
	public void talk() {
		System.out.println("AU! AU!");
	}
	
	
	
}
