import java.util.Scanner;
public class Exercicio05SomaDuasMatrizes {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in); int m=sc.nextInt(), n=sc.nextInt();
  int[][] a=new int[m][n], b=new int[m][n];
  for(int i=0;i<m;i++)for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
  for(int i=0;i<m;i++)for(int j=0;j<n;j++)b[i][j]=sc.nextInt();
  for(int i=0;i<m;i++){for(int j=0;j<n;j++){if(j>0)System.out.print(" ");System.out.print(a[i][j]+b[i][j]);}System.out.println();}
  sc.close();
 }
}
