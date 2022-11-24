public class Velho extends Imovel{
	
	private Double desconto;

	public Velho(String endereco, Double price, Double desconto) {
		super(endereco, price);
		this.desconto = desconto;
	}

	@Override
	public Double getPrice() {
		return super.getPrice() - desconto;
	}

	@Override
	public String toString() {
		return "Velho --> Desconto = " + desconto + ", Preço Final = " + getPrice();
	}
	
	
	
	

}
