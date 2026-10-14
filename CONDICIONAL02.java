import java.util.Scanner;
import java.util.Locale;

public class CONDICIONAL02 {

    public static void main(String[] args) {

        System.out.println("CONDICIONAL02");

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b * b - 4.0 * a * c;

        if (a == 0 || delta < 0.0) {
            System.out.println("impossivel calcular");
        }
        else {
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }


        sc.close();



        


    }
}