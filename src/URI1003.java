import java.util.Locale;
import java.util.Scanner;


public class URI1003 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
                
        System.out.println("URI 1003");
                              
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int B = sc.nextInt();

        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        sc.close();       

    }
}