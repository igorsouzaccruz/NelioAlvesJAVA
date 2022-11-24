public class PoliMain {

	public static void main(String[] args) {

		
		/*O polimorfismo dinamico acontece quando estamos tentando fazer herança, ou seja, quando uma classe
		 * herda um método de uma superclasse sobreponto o da classe "mae"  Normalmente é utilizando quando o
		 * mesmo método é utilizado várias vezes em diferentes classes, porém com resultados diferentes.
		
		 *Observamos no exemplo abaixo uma aplicação do polimorfismo dinamico:
		 */
		
		Animal gato = new Gato();
		Animal cachorro = new Cachorro(true);
		
		gato.falar();
		cachorro.falar();
		
			
		/*Primeiro temos o Polimorfismo estático, ou seja, quando a mesma operação é implemenatda mais de 
		 * uma vez na mesma classe. O que muda é a assinatura do método ou os valores de entrada do metado.
		 * Observamso na classe Cachorro o método falar repetido duas vezes a primeira foi utilizada no polimorfimos 
		 * dinamico e a segunda caracteriza o polimorfimos estático. Ao solicitar a entrada da variável boolean
		 * temos uma outra resposta do mesmo método.
		 * 
		 * Observamos no exemplo abaixo o polimorfismo estático para o método rosnar, usando sem receber variáveis
		 * e posteriormente recebendo uma boolean. Observamos diferentes resultados mesmo o metodo sendo implementado
		 * na mesma classe.
		 * */

		Cachorro dog = new Cachorro(false);
		dog.rosnar();
		dog.rosnar(false);
	}

}
