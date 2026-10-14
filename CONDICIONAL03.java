import java.util.Scanner;
import java.util.Locale;

public class CONDICIONAL03 {

    public static void main(String[] args) {

        System.out.println("CONDICIONAL03");

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

    if (a < b && a < c){
        System.out.println("MENOR = " + a);
    }

    else if (b < c){
            System.out.println("MENOR = " + b);
                }
    else {
        System.out.println("MENOR = " + c);
    }

        sc.close();



        


    }
}