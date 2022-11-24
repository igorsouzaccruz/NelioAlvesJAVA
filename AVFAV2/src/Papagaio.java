public class Papagaio extends Passaro{

	private String vocabulario;

	public Papagaio(String name, String vocabulario) {
		super(name);
		this.vocabulario = vocabulario;
	}
	
	public void setVocabulario(String vocabulario) { //void setVoc(String v)
		this.vocabulario = vocabulario;
	}

	@Override
	public void talk() {
		System.out.println(vocabulario);
	}
	
	
}
