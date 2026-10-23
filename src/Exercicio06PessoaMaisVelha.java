import java.util.Scanner;
public class Exercicio06PessoaMaisVelha {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), maior=Integer.MIN_VALUE; String nomeMaior="";
  for(int i=0;i<n;i++){String nome=sc.next();int idade=sc.nextInt();if(idade>maior){maior=idade;nomeMaior=nome;}}
  System.out.println("Pessoa mais velha: "+nomeMaior);
  sc.close();
 }
}
