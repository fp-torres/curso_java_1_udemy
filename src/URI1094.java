import java.util.Locale;
import java.util.Scanner;
public class URI1094 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt(), coelhos = 0, ratos = 0, sapos = 0, total = 0;
  for (int i = 0; i < n; i++) {
   int quantidade = sc.nextInt();
   char tipo = sc.next().charAt(0);
   total += quantidade;
   if (tipo == 'C') coelhos += quantidade;
   else if (tipo == 'R') ratos += quantidade;
   else if (tipo == 'S') sapos += quantidade;
  }
  System.out.println("Total: " + total + " cobaias");
  System.out.println("Total de coelhos: " + coelhos);
  System.out.println("Total de ratos: " + ratos);
  System.out.println("Total de sapos: " + sapos);
  System.out.printf(Locale.US, "Percentual de coelhos: %.2f %%\n", 100.0 * coelhos / total);
  System.out.printf(Locale.US, "Percentual de ratos: %.2f %%\n", 100.0 * ratos / total);
  System.out.printf(Locale.US, "Percentual de sapos: %.2f %%\n", 100.0 * sapos / total);
  sc.close();
 }
}