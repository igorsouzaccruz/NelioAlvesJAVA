import java.util.Scanner;

public class Segundo {

    public void contagem(){

        Scanner prompt = new Scanner(System.in);
        System.out.println("Número de notas");
        int n = prompt.nextInt();
        int nota;
        int cont = 0;
        int i = 0;
        while (i < n) {
            i = i + 1; // ou i++
            System.out.println("Nota do aluno:");
            nota = prompt.nextInt();
            if (nota >= 50) {
                cont = cont + 1; // ou cont++
           
 }
        }
        System.out.println("Número de aprovações: "+cont);


    }



}