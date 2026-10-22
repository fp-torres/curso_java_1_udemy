import java.util.Scanner;
public class URI1153 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt(), fatorial = 1;
  for (int i = 1; i <= n; i++) fatorial *= i;
  System.out.println(fatorial);
  sc.close();
 }
}