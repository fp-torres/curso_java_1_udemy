import java.util.Scanner;
public class Exercicio03SomaVetores {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] a=new int[n], b=new int[n], c=new int[n];
  for(int i=0;i<n;i++) a[i]=sc.nextInt();
  for(int i=0;i<n;i++) b[i]=sc.nextInt();
  for(int i=0;i<n;i++) c[i]=a[i]+b[i];
  for(int i=0;i<n;i++){if(i>0)System.out.print(" ");System.out.print(c[i]);}
  System.out.println();
  sc.close();
 }
}
