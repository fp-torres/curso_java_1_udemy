import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) n++;

        for (int i = 0; i < 6; i++) {
            System.out.println(n);
            n += 2;
        }
        sc.close();
    }
}