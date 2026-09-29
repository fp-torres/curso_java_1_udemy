import java.util.Locale;
import java.util.Scanner;


public class URI1016 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("URI 1016");


        Scanner sc = new Scanner(System.in);
                
        int distancia = sc.nextInt();

        int tempo = distancia * 2;

        System.out.println(tempo + " minutos");
                              
       
        
        sc.close();       

    }
}