package entities;

public class Relatorio {
	
	public Imprimivel dados;
	
	public Relatorio(Imprimivel dados) {
		this.dados = dados;
	}

	public void gerarRelatorio() {
		System.out.println(dados.mostrarDados());
	}
}
