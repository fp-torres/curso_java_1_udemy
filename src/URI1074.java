import java.util.Scanner;
public class URI1074 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for (int i = 0; i < n; i++) {
   int x = sc.nextInt();
   if (x == 0) System.out.println("NULL");
   else if (x % 2 == 0) System.out.println(x > 0 ? "EVEN POSITIVE" : "EVEN NEGATIVE");
   else System.out.println(x > 0 ? "ODD POSITIVE" : "ODD NEGATIVE");
  }
  sc.close();
 }
}