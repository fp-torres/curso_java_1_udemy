import java.util.Scanner;
public class URI1080 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int maior = Integer.MIN_VALUE, posicao = 0;
  for (int i = 1; i <= 100; i++) {
   int n = sc.nextInt();
   if (n > maior) { maior = n; posicao = i; }
  }
  System.out.println(maior);
  System.out.println(posicao);
  sc.close();
 }
}