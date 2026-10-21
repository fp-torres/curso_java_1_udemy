import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = 0;
        double soma = 0;

        for (int i = 0; i < 6; i++) {
            double n = sc.nextDouble();
            if (n > 0) {
                quantidade++;
                soma += n;
            }
        }

        System.out.println(quantidade + " valores positivos");
        System.out.printf("%.1f%n", soma / quantidade);
        sc.close();
    }
}