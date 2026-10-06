import java.util.Locale;
import java.util.Scanner;

public class URI1061 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("URI 1061");

        Scanner sc = new Scanner(System.in);

        sc.next();
        int diaInicial = sc.nextInt();

        int horaInicial = sc.nextInt();
        sc.next();
        int minutoInicial = sc.nextInt();
        sc.next();
        int segundoInicial = sc.nextInt();

        sc.next();
        int diaFinal = sc.nextInt();

        int horaFinal = sc.nextInt();
        sc.next();
        int minutoFinal = sc.nextInt();
        sc.next();
        int segundoFinal = sc.nextInt();

        int inicio = diaInicial * 86400
                + horaInicial * 3600
                + minutoInicial * 60
                + segundoInicial;

        int fim = diaFinal * 86400
                + horaFinal * 3600
                + minutoFinal * 60
                + segundoFinal;

        int duracao = fim - inicio;

        int dias = duracao / 86400;
        duracao %= 86400;

        int horas = duracao / 3600;
        duracao %= 3600;

        int minutos = duracao / 60;
        int segundos = duracao % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        sc.close();
    }
}