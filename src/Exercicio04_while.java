public class Exercicio04_while {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x < 5) {
            y = x * 3;
            System.out.print(y);
            x = x + 1;
        }

        System.out.println("Fim");

        System.out.println("Valores finais:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
