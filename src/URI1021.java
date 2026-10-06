import java.util.Locale;
import java.util.Scanner;


public class URI1021 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("URI 1021");


        Scanner sc = new Scanner(System.in);
        
        double valor = sc.nextDouble();
        int centavos = (int) Math.round(valor * 100);

        System.out.println("NOTAS:");

        int notas100 = centavos / 10000;
        centavos %= 10000;
      int notas50 = centavos / 5000;
        centavos %= 5000;
        int notas20 = centavos / 2000;
        centavos %= 2000;

        int notas10 = centavos / 1000;
        centavos %= 1000;

        int notas5 = centavos / 500;
        centavos %= 500;

        int notas2 = centavos / 200;
            centavos %= 200;


        System.out.printf("%d nota(s) de R$ 100.00%n", notas100);
        System.out.printf("%d nota(s) de R$ 50.00%n", notas50);
        System.out.printf("%d nota(s) de R$ 20.00%n", notas20);
        System.out.printf("%d nota(s) de R$ 10.00%n", notas10);
        System.out.printf("%d nota(s) de R$ 5.00%n", notas5);
        System.out.printf("%d nota(s) de R$ 2.00%n", notas2);

        System.out.println("MOEDAS:");

        int moedas1 = centavos / 100;
        centavos %= 100;

        int moedas50 = centavos / 50;
        centavos %= 50;

        int moedas25 = centavos / 25;
        centavos %= 25;

        int moedas10 = centavos / 10;
        centavos %= 10;

        int moedas5 = centavos / 5;
        centavos %= 5;

    
        int moedas01 = centavos;

        System.out.printf("%d moeda(s) de R$ 1.00%n", moedas1);
        System.out.printf("%d moeda(s) de R$ 0.50%n", moedas50);
        System.out.printf("%d moeda(s) de R$ 0.25%n", moedas25);
        System.out.printf("%d moeda(s) de R$ 0.10%n", moedas10);
        System.out.printf("%d moeda(s) de R$ 0.05%n", moedas5);
        System.out.printf("%d moeda(s) de R$ 0.01%n", moedas01);

        sc.close();       

    }
}