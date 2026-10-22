import java.util.Scanner;
public class URI1158 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for (int i = 0; i < n; i++) {
   int x = sc.nextInt(), quantidade = sc.nextInt(), soma = 0;
   if (x % 2 == 0) x++;
   for (int j = 0; j < quantidade; j++) {
    soma += x;
    x += 2;
   }
   System.out.println(soma);
  }
  sc.close();
 }
}