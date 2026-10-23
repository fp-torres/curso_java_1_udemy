import java.util.Locale;
import java.util.Scanner;
public class Exercicio06OperacoesMatriz {
 public static void main(String[] args) {
  Locale.setDefault(Locale.US); Scanner sc=new Scanner(System.in); int n=sc.nextInt();
  double[][] a=new double[n][n]; double soma=0;
  for(int i=0;i<n;i++)for(int j=0;j<n;j++){a[i][j]=sc.nextDouble();if(a[i][j]>0)soma+=a[i][j];}
  int linha=sc.nextInt(), coluna=sc.nextInt();
  System.out.printf("SOMA DOS POSITIVOS: %.1f%n",soma);
  System.out.print("LINHA ESCOLHIDA:");for(int j=0;j<n;j++)System.out.printf(" %.1f",a[linha][j]);System.out.println();
  System.out.print("COLUNA ESCOLHIDA:");for(int i=0;i<n;i++)System.out.printf(" %.1f",a[i][coluna]);System.out.println();
  System.out.print("DIAGONAL PRINCIPAL:");for(int i=0;i<n;i++)System.out.printf(" %.1f",a[i][i]);System.out.println();
  System.out.println("MATRIZ ALTERADA:");
  for(int i=0;i<n;i++){for(int j=0;j<n;j++){if(a[i][j]<0)a[i][j]*=a[i][j];if(j>0)System.out.print(" ");System.out.printf("%.1f",a[i][j]);}System.out.println();}
  sc.close();
 }
}
