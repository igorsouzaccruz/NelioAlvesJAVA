import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        System.out.println("Enter salary: ");
        Double money = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Worker> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Worker(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> emails = list.stream()
                .filter(p -> p.getSalary() > money)
                .map(p -> p.getEmail())
                .sorted()
                .collect(Collectors.toList());
            
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", money) + ":");
            emails.forEach(System.out::println);

            double sum = list.stream()
            .filter(p -> p.getName().charAt(0) == 'M')
            .map(p -> p.getSalary())
            .reduce(0.0, (x,y) -> x + y);

            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
