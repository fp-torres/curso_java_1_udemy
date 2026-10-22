public class Rastreamento03 {
 public static void main(String[] args) {
  int y = 10;
  for (int i = 0; i < 4; i++) {
   System.out.print(i);
   y = y + i;
   System.out.println(y);
  }
  System.out.println("y = " + y + ", i = 4; x não é declarado neste trecho");
 }
}