import java.util.Scanner;
public class Exercicio01MaiorVetor {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  double[] v = new double[n];
  for (int i=0;i<n;i++) v[i]=sc.nextDouble();
  int pos=0;
  for (int i=1;i<n;i++) if (v[i]>v[pos]) pos=i;
  System.out.println(v[pos]);
  System.out.println(pos);
  sc.close();
 }
}
