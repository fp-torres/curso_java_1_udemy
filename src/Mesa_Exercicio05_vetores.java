public class Mesa_Exercicio05_vetores {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int[] v = new int[7];
        int[] w = new int[7];
        int c;

        for (c = 0; c < 3; c++) {
            v[c] = a;
            w[c] = c * v[c];
        }

        for (int i = 0; i < 7; i++) {
            System.out.println("v[" + i + "] = " + v[i]
                    + " | w[" + i + "] = " + w[i]);
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
