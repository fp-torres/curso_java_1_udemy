import java.util.Scanner;
public class Exercicio01Negativos {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int m = sc.nextInt(), n = sc.nextInt();
  int[][] a = new int[m][n];
  for (int i=0;i<m;i++) for (int j=0;j<n;j++) a[i][j]=sc.nextInt();
  System.out.println("VALORES NEGATIVOS:");
  for (int i=0;i<m;i++) for (int j=0;j<n;j++) if (a[i][j]<0) System.out.println(a[i][j]);
  sc.close();
 }
}
