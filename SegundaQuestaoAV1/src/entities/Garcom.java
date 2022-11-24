package entities;

public class Garcom {

	private String nome;
	private boolean terceirizado;
	private Double precoHora;
	
	public Garcom() {
	}

	public Garcom(String nome, boolean terceirizado, Double precoHora) {
		this.nome = nome;
		this.terceirizado = terceirizado;
		this.precoHora = precoHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isTerceirizado() {
		return terceirizado;
	}

	public void setTerceirizado(boolean terceirizado) {
		this.terceirizado = terceirizado;
	}

	public Double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(Double precoHora) {
		this.precoHora = precoHora;
	}

	public void ferias() {
		System.out.println("indicar férias");
	}
	
	public void demitir() {
		System.out.println("demitir funcionário");
	}
}
