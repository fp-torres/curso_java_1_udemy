public class Mesa_Exercicio01_vetores {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = (a + b) / 2;
        c = c - 40;

        int[] v = new int[7];
        v[4] = a + b + c;

        System.out.println("v[4] = " + v[4]);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
