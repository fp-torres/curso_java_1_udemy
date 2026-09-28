import java.util.Locale;
import java.util.Scanner;


public class URI1010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
                
        System.out.println("URI 1010");
                              
        Scanner sc = new Scanner(System.in);

       int code1 = sc.nextInt();
       int quantity1 = sc.nextInt();
       double price1 = sc.nextDouble();

       int code2 = sc.nextInt();
       int quantity2 = sc.nextInt();
       double price2 = sc.nextDouble();


       double valor1 = quantity1 * price1;

       double valor2 = quantity2 * price2;

       double total = valor1 + valor2;

        System.out.printf("Valor a pagar: R$ %.2f%n", total);
        

        sc.close();       

    }
}