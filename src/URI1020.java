import java.util.Locale;
import java.util.Scanner;


public class URI1020 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("URI 1020");


        Scanner sc = new Scanner(System.in);
        
        int dias = sc.nextInt();

        int anos =  dias / 365;

        dias = dias % 365;

        int meses = dias / 30;
        dias = dias % 30;

        int diasRestantes = dias;

        System.out.println(anos + " anos(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(diasRestantes + " dia(s)");
      
        sc.close();       

    }
}