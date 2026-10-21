import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double preco;
        switch (codigo) {
            case 1: preco = 4.00; break;
            case 2: preco = 4.50; break;
            case 3: preco = 5.00; break;
            case 4: preco = 2.00; break;
            default: preco = 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", preco * quantidade);
        sc.close();
    }
}