package entities;

public class aluno {

	public String nome;
	public double a;
	public double b;
	public double c;
	
	public double media () {
		return (a + b + c);
		}
	public void pass (double media) {
		System.out.printf("nota total %.2f%n",media);
		if(media >= 60) {
			System.out.println("Aprovado!");
			
		}else
		{
			double missing = media - 60;
			System.out.println("Reprovado");
			System.out.printf("Falta %.2f%n", missing);
		}
		
	}
}
