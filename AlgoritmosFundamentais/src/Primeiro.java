public class Primeiro {

	public void trocaVariaveis(int a, int b) {
		System.out.println("Valor de a: " + a + " Valor de b: " + b);
		
		int aux;

		aux = a;
		a = b;
		b = aux;
		System.out.println(a +" "+ b);
	}
}
