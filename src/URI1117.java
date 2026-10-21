import java.util.Locale;
import java.util.Scanner;

public class URI1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int notasValidas = 0;
        double soma = 0;

        while (notasValidas < 2) {
            double nota = sc.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                notasValidas++;
            } else {
                System.out.println("nota invalida");
            }
        }

        System.out.printf("media = %.2f%n", soma / 2);
        sc.close();
    }
}
