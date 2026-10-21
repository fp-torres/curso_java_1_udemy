import java.util.Arrays;
import java.util.Scanner;

public class URI1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] lados = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
        Arrays.sort(lados);

        double C = lados[0], B = lados[1], A = lados[2];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) System.out.println("TRIANGULO RETANGULO");
            else if (A * A > B * B + C * C) System.out.println("TRIANGULO OBTUSANGULO");
            else System.out.println("TRIANGULO ACUTANGULO");

            if (A == B && B == C) System.out.println("TRIANGULO EQUILATERO");
            else if (A == B || A == C || B == C) System.out.println("TRIANGULO ISOSCELES");
        }
        sc.close();
    }
}