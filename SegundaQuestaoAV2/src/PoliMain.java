public class PoliMain {

	public static void main(String[] args) {

		
		/*O polimorfismo dinamico acontece quando estamos tentando fazer heran�a, ou seja, quando uma classe
		 * herda um m�todo de uma superclasse sobreponto o da classe "mae"  Normalmente � utilizando quando o
		 * mesmo m�todo � utilizado v�rias vezes em diferentes classes, por�m com resultados diferentes.
		
		 *Observamos no exemplo abaixo uma aplica��o do polimorfismo dinamico:
		 */
		
		Animal gato = new Gato();
		Animal cachorro = new Cachorro(true);
		
		gato.falar();
		cachorro.falar();
		
			
		/*Primeiro temos o Polimorfismo est�tico, ou seja, quando a mesma opera��o � implemenatda mais de 
		 * uma vez na mesma classe. O que muda � a assinatura do m�todo ou os valores de entrada do metado.
		 * Observamso na classe Cachorro o m�todo falar repetido duas vezes a primeira foi utilizada no polimorfimos 
		 * dinamico e a segunda caracteriza o polimorfimos est�tico. Ao solicitar a entrada da vari�vel boolean
		 * temos uma outra resposta do mesmo m�todo.
		 * 
		 * Observamos no exemplo abaixo o polimorfismo est�tico para o m�todo rosnar, usando sem receber vari�veis
		 * e posteriormente recebendo uma boolean. Observamos diferentes resultados mesmo o metodo sendo implementado
		 * na mesma classe.
		 * */

		Cachorro dog = new Cachorro(false);
		dog.rosnar();
		dog.rosnar(false);
	}

}
