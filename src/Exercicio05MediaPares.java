import java.util.Scanner;
public class Exercicio05MediaPares {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), soma=0, qtd=0;
  for(int i=0;i<n;i++){int x=sc.nextInt();if(x%2==0){soma+=x;qtd++;}}
  if(qtd>0) System.out.println((double)soma/qtd);
  else System.out.println("Nenhum numero par foi informado.");
  sc.close();
 }
}
