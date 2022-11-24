package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> eleicao = new HashMap<>();
			
			String line = br.readLine();
			while(line != null) {
				
				String[] campo = line.split(",");
				String eleitor = campo[0];
				Integer votos =  Integer.parseInt(campo[1]);
				
				
				if(eleicao.containsKey(eleitor)) {
					int votosAteAgora = eleicao.get(eleitor);				
					eleicao.put(eleitor, votosAteAgora + votos);
				}
				else {
					eleicao.put(eleitor, votos);
				}
				
				line = br.readLine();
		
				
			}
			for (String key : eleicao.keySet()) {
				System.out.println(key + ": " + eleicao.get(key));
			}
			
		}catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());;
		}

	}

}
