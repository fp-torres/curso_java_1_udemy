public class Exercicio02_while {
    public static void main(String[] args) {
        int x = 2;
        int y = 0;

        while (x < 60) {
            System.out.println(x);
            x = x * 2;
            y = y + 10;
        }

        System.out.println("Valores finais:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
