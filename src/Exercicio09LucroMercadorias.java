import java.util.Locale;
import java.util.Scanner;
public class Exercicio09LucroMercadorias {
 public static void main(String[] args) {
  Locale.setDefault(Locale.US);
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(), abaixo=0, entre=0, acima=0;
  double totalCompra=0, totalVenda=0;
  for(int i=0;i<n;i++){
   String nome=sc.next(); double compra=sc.nextDouble(), venda=sc.nextDouble();
   double lucroPercentual=(venda-compra)/compra*100.0;
   if(lucroPercentual<10) abaixo++;
   else if(lucroPercentual<=20) entre++;
   else acima++;
   totalCompra+=compra; totalVenda+=venda;
  }
  System.out.println("Lucro abaixo de 10%: "+abaixo);
  System.out.println("Lucro entre 10% e 20%: "+entre);
  System.out.println("Lucro acima de 20%: "+acima);
  System.out.printf("Valor total de compra: %.2f%n",totalCompra);
  System.out.printf("Valor total de venda: %.2f%n",totalVenda);
  System.out.printf("Lucro total: %.2f%n",totalVenda-totalCompra);
  sc.close();
 }
}
