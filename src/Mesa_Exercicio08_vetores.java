public class Mesa_Exercicio08_vetores {
    public static void main(String[] args) {
        int x = 4;
        int y = 0;
        int[] v = new int[7];

        for (int i = 0; i < x; i++) {
            v[i] = i;
            y = y + 10;
        }

        for (int i = 0; i < 7; i++) {
            System.out.println("v[" + i + "] = " + v[i]);
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
