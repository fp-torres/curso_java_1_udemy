import java.util.Scanner;

public class URI1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inter = 0;
        int gremio = 0;
        int empates = 0;
        int grenais = 0;
        int continuar = 1;

        while (continuar == 1) {
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();

            grenais++;

            if (golsInter > golsGremio) {
                inter++;
            } else if (golsGremio > golsInter) {
                gremio++;
            } else {
                empates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            continuar = sc.nextInt();

            while (continuar != 1 && continuar != 2) {
                System.out.println("Novo grenal (1-sim 2-nao)");
                continuar = sc.nextInt();
            }
        }

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empates);

        if (inter > gremio) {
            System.out.println("Inter venceu mais");
        } else if (gremio > inter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        sc.close();
    }
}
