import java.util.Locale;
import java.util.Scanner;


public class URI1014 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
                
        System.out.println("URI 1014");
                              
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();
        double combustivel = sc.nextDouble();

        double consumo = distancia / combustivel;

        System.out.printf("%.3f km/l%n", consumo);

        
        sc.close();       

    }
}