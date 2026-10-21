import java.util.Arrays;
import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] original = v.clone();
        Arrays.sort(v);

        for (int n : v) System.out.println(n);
        System.out.println();
        for (int n : original) System.out.println(n);

        sc.close();
    }
}