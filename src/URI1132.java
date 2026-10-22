import java.util.Scanner;
public class URI1132 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt(), b = sc.nextInt();
  int menor = Math.min(a, b), maior = Math.max(a, b), soma = 0;
  for (int i = menor; i <= maior; i++) if (i % 13 != 0) soma += i;
  System.out.println(soma);
  sc.close();
 }
}