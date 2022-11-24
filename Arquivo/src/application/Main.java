package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Entre com o caminho: ");
		String caminho = sc.nextLine();
		
		File caminhoin = new File(caminho);
		String caminhoVizinho = caminhoin.getParent();
		
		boolean sucesso = new File(caminhoVizinho + "\\out").mkdir();
		
		String caminhoout = caminhoVizinho + "\\out\\summary.csv";		
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
			
				 String linhas = br.readLine();
			
				while(linhas != null){
					
					System.out.println(linhas);
					
					String[] partes = linhas.split(",");
					String name = partes[0];
					double price = Double.parseDouble(partes[1]);
					int quantity = Integer.parseInt(partes[2]);
					
					list.add(new Product(name, price, quantity));
					
					linhas = br.readLine();	
					
				}
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoout))){
					
					for(Product item:list) {
						bw.write(item.getName() + "," + String.format("%.2f", item.total()));
						bw.newLine();
					}
					
					System.out.println(caminhoout + "\n Deu certo");
					
				}
				catch(IOException e){
					System.out.println("Erro escrevendo os arquivos: " + e.getMessage());					
				}
		}
		catch(IOException e) {
			System.out.println("Error lendo arquivos: " + e.getMessage());
		}
		finally {
		sc.close();}
	}

}
