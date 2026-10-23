import java.util.Scanner;
public class Exercicio02NumerosPares {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt(), qtd=0;
  int[] v=new int[n];
  for(int i=0;i<n;i++) v[i]=sc.nextInt();
  for(int x:v) if(x%2==0){System.out.print(x+" ");qtd++;}
  System.out.println();
  System.out.println(qtd);
  sc.close();
 }
}
