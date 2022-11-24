public class Novo extends Imovel {
	
	private Double adicional;

	public Novo(String endereco, Double price, Double adicional) {
		super(endereco, price);
		this.adicional = adicional;
	}

	@Override
	public Double getPrice() {
		return super.getPrice() + adicional;
	}

	@Override
	public String toString() {
		return "Novo ---> Valor adicional = " + adicional +" Preço Final = " + getPrice();
	}
	
	
}
