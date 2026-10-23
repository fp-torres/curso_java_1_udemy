import java.util.Locale;
import java.util.Scanner;
public class Exercicio08AlturasESexo {
 public static void main(String[] args) {
  Locale.setDefault(Locale.US);
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), homens=0, mulheres=0;
  double menor=Double.MAX_VALUE, maior=Double.MIN_VALUE, somaMulheres=0;
  for(int i=0;i<n;i++){
   double altura=sc.nextDouble(); String sexo=sc.next();
   if(altura<menor) menor=altura;
   if(altura>maior) maior=altura;
   if(sexo.equalsIgnoreCase("F")){somaMulheres+=altura;mulheres++;}
   else if(sexo.equalsIgnoreCase("M")) homens++;
  }
  System.out.printf("Menor altura = %.2f%n",menor);
  System.out.printf("Maior altura = %.2f%n",maior);
  if(mulheres>0) System.out.printf("Media das alturas das mulheres = %.2f%n",somaMulheres/mulheres);
  else System.out.println("Media das alturas das mulheres = nao ha mulheres");
  System.out.println("Numero de homens = "+homens);
  sc.close();
 }
}
