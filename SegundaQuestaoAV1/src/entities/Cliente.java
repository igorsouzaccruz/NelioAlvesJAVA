package entities;

public class Cliente {

	private String nome;
	private boolean vip;
	private double credito;
	
	public Cliente() {
	}
	
	public Cliente(String nome, boolean vip, double credito) {
		this.nome = nome;
		this.vip = vip;
		this.credito = credito;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public void renovarVip() {
		System.out.println("renovar o vip do cliente");
	}
	
	public void addCredito() {
		System.out.println("O cliente coloca credito na conta da loja");
	}
}
