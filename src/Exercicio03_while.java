public class Exercicio03_while {
    public static void main(String[] args) {
        double x = 100;
        double y = 100;

        while (x != y) {
            System.out.print("olha");
            x = Math.sqrt(y);
        }

        System.out.println("Valores finais:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
