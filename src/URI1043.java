import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble();

        if (A + B > C && A + C > B && B + C > A) {
            System.out.printf("Perimetro = %.1f%n", A + B + C);
        } else {
            System.out.printf("Area = %.1f%n", ((A + B) * C) / 2);
        }
        sc.close();
    }
}