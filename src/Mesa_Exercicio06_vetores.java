public class Mesa_Exercicio06_vetores {
    public static void main(String[] args) {
        int[] v = new int[7];
        int[] w = new int[7];
        int d;

        v[0] = 2;

        for (d = 1; d < 4; d++) {
            v[d] = v[d - 1] * 2;
        }

        for (d = 0; d < 4; d++) {
            w[d] = v[d] * 10;
        }

        for (int i = 0; i < 7; i++) {
            System.out.println("v[" + i + "] = " + v[i]
                    + " | w[" + i + "] = " + w[i]);
        }
        System.out.println("d = " + d);
    }
}
