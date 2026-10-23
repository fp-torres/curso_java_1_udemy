import java.util.Scanner;
public class Exercicio04SomaAcimaDiagonal {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in); int n=sc.nextInt(); int[][] a=new int[n][n];
  for(int i=0;i<n;i++)for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
  int soma=0;
  for(int i=0;i<n;i++)for(int j=i+1;j<n;j++)soma+=a[i][j];
  System.out.println(soma); sc.close();
 }
}
