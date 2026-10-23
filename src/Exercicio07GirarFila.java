import java.util.Scanner;
public class Exercicio07GirarFila {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in); int m=sc.nextInt(), n=sc.nextInt(); int[][] a=new int[m][n];
  for(int i=0;i<m;i++)for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
  int fila=sc.nextInt()-1;
  if(fila>=0&&fila<m){int ultimo=a[fila][n-1];for(int j=n-1;j>0;j--)a[fila][j]=a[fila][j-1];a[fila][0]=ultimo;}
  for(int i=0;i<m;i++){for(int j=0;j<n;j++){if(j>0)System.out.print(" ");System.out.print(a[i][j]);}System.out.println();}
  sc.close();
 }
}
