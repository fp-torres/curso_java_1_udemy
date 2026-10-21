public class Exercicio06_while {
    public static void main(String[] args) {
        int x = 4;
        int y = 0;
        int i = 0;

        while (i < x) {
            i = i + 1;
            y = y + i;
            System.out.print(i);
            System.out.println(y);
        }

        System.out.println("Valores finais:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("i = " + i);
    }
}
