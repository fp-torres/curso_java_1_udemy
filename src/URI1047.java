import java.util.Scanner;

public class URI1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hi = sc.nextInt(), mi = sc.nextInt();
        int hf = sc.nextInt(), mf = sc.nextInt();

        int inicio = hi * 60 + mi;
        int fim = hf * 60 + mf;
        int duracao = fim - inicio;

        if (duracao <= 0) duracao += 24 * 60;

        System.out.println("O JOGO DUROU " + (duracao / 60)
                + " HORA(S) E " + (duracao % 60) + " MINUTO(S)");
        sc.close();
    }
}