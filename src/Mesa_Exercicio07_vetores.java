public class Mesa_Exercicio07_vetores {
    public static void main(String[] args) {
        int x = 4;
        int y = x + 2;
        int[] v = new int[7];

        for (int i = 0; i < x; i++) {
            System.out.println("x = " + x + ", y = " + y);
            y = y + i;
        }

        v[4] = x + y;
        System.out.println("v[4] = " + v[4]);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
