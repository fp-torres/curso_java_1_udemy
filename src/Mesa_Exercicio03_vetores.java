public class Mesa_Exercicio03_vetores {
    public static void main(String[] args) {
        int a = 7;
        int b = a - 6;
        int[] v = new int[7];

        while (b < a) {
            v[b] = b * a;
            b = b + 2;
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println("v[" + i + "] = " + v[i]);
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
