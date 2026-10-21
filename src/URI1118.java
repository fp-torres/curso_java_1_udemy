import java.util.Locale;
import java.util.Scanner;

public class URI1118 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        while (opcao == 1) {
            int quantidade = 0;
            double soma = 0;

            while (quantidade < 2) {
                double nota = sc.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    soma += nota;
                    quantidade++;
                } else {
                    System.out.println("nota invalida");
                }
            }

            System.out.printf("media = %.2f%n", soma / 2);

            System.out.println("novo calculo (1-sim 2-nao)");
            opcao = sc.nextInt();

            while (opcao != 1 && opcao != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = sc.nextInt();
            }
        }

        sc.close();
    }
}
