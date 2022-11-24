package entities;

public class Pessoa {
	
	private String name;
	private String endereco;
	private String telefone;
	
	public Pessoa() {
	}
	
	public Pessoa(String name, String endereco, String telefone) {
		super();
		this.name = name;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
