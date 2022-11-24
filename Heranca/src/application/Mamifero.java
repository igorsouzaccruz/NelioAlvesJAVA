package application;

public class Mamifero extends Animal {

	boolean hasPelos;
	float temperatura;
	int qtdDentes;
		
	public void amamentar() {
		System.out.println("Amamentou");
	}
	
	public void regulacaoTemperatura() {
		System.out.println("Temperatura regulada");
	}
	
}
