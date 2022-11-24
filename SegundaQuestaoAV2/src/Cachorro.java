
public class Cachorro extends Animal{

	private boolean rosnou;
	
	public Cachorro(boolean rosnou) {
		this.rosnou = rosnou;
	}

	@Override
	public void falar() {
		System.out.println("Auau");
	}

	public void rosnar() {
			System.out.println("Rrrrr...");
		}
	
	public void rosnar(boolean rosnou) {
		if( rosnou == true) {
			System.out.println("Rrrrr...");
		}else
			System.out.println("Cain cain");
	}
}
