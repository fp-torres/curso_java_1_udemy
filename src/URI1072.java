import java.util.Scanner;
public class URI1072 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt(), dentro = 0, fora = 0;
  for (int i = 0; i < n; i++) {
   int x = sc.nextInt();
   if (x >= 10 && x <= 20) dentro++; else fora++;
  }
  System.out.println(dentro + " in");
  System.out.println(fora + " out");
  sc.close();
 }
}