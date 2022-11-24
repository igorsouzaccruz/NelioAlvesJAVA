import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Veterinario {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);		
		List<Animal> list = new ArrayList<>();
		Animal cachorro = new Cachorro("Bob",true);
		Animal vaca = new Vaca("Gleice");
		Animal bemTeVi = new BemTeVi("Flower");
		Animal papagaio = new Papagaio("Ze","Fora Bolsonaro!");
		
		list.add(cachorro);
		list.add(vaca);
		list.add(bemTeVi);
		list.add(papagaio);		
		
		for(Animal animais: list) {
			animais.talk();
		}
		

	}

}
