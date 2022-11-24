public class Imovel {

	private String endereco;
	private Double price;
	
	public Imovel(String endereco, Double price) {
		this.endereco = endereco;
		this.price = price;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
