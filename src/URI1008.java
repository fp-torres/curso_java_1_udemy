import java.util.Locale;
import java.util.Scanner;


public class URI1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
                
        System.out.println("URI 1008");
                              
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int B = sc.nextInt();

        int C = sc.nextInt();

        int D = sc.nextInt();

        int DIFERENCA = A * B - C * D;


        System.out.println("DIFERENCA = " + DIFERENCA);

        sc.close();       

    }
}