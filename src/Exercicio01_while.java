public class Exercicio01_while {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        while (x > 2) {
            System.out.print(x);
            y = y + x;
            x = x - 1;
        }

        System.out.println();

        System.out.println("Valores finais:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
