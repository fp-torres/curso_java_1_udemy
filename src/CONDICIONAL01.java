import java.util.Scanner;
import java.util.Locale;

public class CONDICIONAL01 {

    public static void main(String[] args) {

        System.out.println("CONDICIONAL01");

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;
        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        if (notaFinal < 60.0) {
            System.out.println("REPROVADO");

        }




        sc.close();



        


    }
}