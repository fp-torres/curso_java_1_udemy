public class Exercicio05_while {
    public static void main(String[] args) {
        int x = 2;
        int y = 10;

        System.out.println("ola");

        while (x < y) {
            System.out.println(x + " " + y);
            x = x * 2;
            y = y + 1;
        }

        System.out.println("Valores finais:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
