import java.util.Scanner;
public class URI1142 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int numero = 1;
  for (int i = 0; i < n; i++) {
   System.out.println(numero + " " + (numero + 1) + " " + (numero + 2) + " PUM");
   numero += 4;
  }
  sc.close();
 }
}