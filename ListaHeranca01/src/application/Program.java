package application;

import entities.Animal;
import entities.Cachorro;
import entities.Peixe;

public class Program {

	public static void main(String[] args) {

		Animal peixe = new Peixe("Pirarucu", 10.0, "agua doce");
		Animal dog = new Cachorro("Bob", 20.0,"Labradoodle");
		
		System.out.println(peixe);
		System.out.println(dog);
	}

}
