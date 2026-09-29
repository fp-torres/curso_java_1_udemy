import java.util.Locale;
import java.util.Scanner;


public class URI1017 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("URI 1017");


        Scanner sc = new Scanner(System.in);
         
        int tempo = sc.nextInt();

        int velocidade = sc.nextInt();

        int distancia =  tempo * velocidade;

        double litros = distancia / 12.0;

        System.out.printf("%.3f%n", litros);


        
                              
       
        
        sc.close();       

    }
}