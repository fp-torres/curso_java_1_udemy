import java.util.Scanner;
public class Exercicio07AlunosAprovados {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(); String[] nomes=new String[n]; double[] n1=new double[n], n2=new double[n];
  for(int i=0;i<n;i++){nomes[i]=sc.next();n1[i]=sc.nextDouble();n2[i]=sc.nextDouble();}
  System.out.println("Alunos aprovados:");
  for(int i=0;i<n;i++) if((n1[i]+n2[i])/2.0>=6.0) System.out.println(nomes[i]);
  sc.close();
 }
}
