public class Mesa_Exercicio04_vetores {
    public static void main(String[] args) {
        int[] v = new int[7];
        int[] w = new int[7];
        int a;

        for (a = 0; a < 3; a++) {
            v[a] = 5;
            w[a] = a;
        }

        for (int i = 0; i < 7; i++) {
            System.out.println("v[" + i + "] = " + v[i]
                    + " | w[" + i + "] = " + w[i]);
        }
        System.out.println("a = " + a);
    }
}
