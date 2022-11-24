package entities;

/* O que � encapsulamento? Por que devemos encapsular as informa��es de um objeto?
 * � uma forma da linguagem ocultar vari�veis de uma classe possibilitando o acesso somente
 * por meio das fun��es "get e set". Ou seja propriciando uma prote��o melhor. A exemplo
 * a fun��o sal�rio podemos apagar a fun��o set para que ningu�m altere o valor do sal�rio
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
