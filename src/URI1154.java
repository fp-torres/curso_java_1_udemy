import java.util.Locale;
import java.util.Scanner;

public class URI1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int soma = 0;
        int quantidade = 0;

        while (idade >= 0) {
            soma += idade;
            quantidade++;
            idade = sc.nextInt();
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.printf("%.2f%n", media);
        }

        sc.close();
    }
}
