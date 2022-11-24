package entities;

/* O que é encapsulamento? Por que devemos encapsular as informações de um objeto?
 * É uma forma da linguagem ocultar variáveis de uma classe possibilitando o acesso somente
 * por meio das funções "get e set". Ou seja propriciando uma proteção melhor. A exemplo
 * a função salário podemos apagar a função set para que ninguém altere o valor do salário
 * de forma indevida.
 */

public class Encapsulamento {

	private String name;
	private Double money;
	private Integer number;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getMoney() {
		return money;
	}
	
	public void setMoney(Double money) {
		this.money = money;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
}
