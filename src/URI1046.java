import java.util.Scanner;

public class URI1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt(), fim = sc.nextInt();

        int duracao = fim - inicio;
        if (duracao <= 0) duracao += 24;

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        sc.close();
    }
}