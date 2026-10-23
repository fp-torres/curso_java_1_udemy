import java.util.Locale;
import java.util.Scanner;
public class Exercicio04MediaEAbaixo {
 public static void main(String[] args) {
  Locale.setDefault(Locale.US);
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(); double[] v=new double[n]; double soma=0;
  for(int i=0;i<n;i++){v[i]=sc.nextDouble();soma+=v[i];}
  double media=soma/n;
  System.out.printf("%.3f%n",media);
  for(double x:v) if(x<media) System.out.println(x);
  sc.close();
 }
}
