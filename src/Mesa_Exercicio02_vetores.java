public class Mesa_Exercicio02_vetores {
    public static void main(String[] args) {
        int a = 2;
        int[] v = new int[7];

        while (a < 6) {
            v[a] = 10 * a;
            a = a + 1;
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println("v[" + i + "] = " + v[i]);
        }
        System.out.println("a = " + a);
    }
}
