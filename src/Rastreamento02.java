public class Rastreamento02 {
 public static void main(String[] args) {
  int x = 0, y = 0;
  for (int i = 1; i < 5; i++) {
   y = i - 1;
   x = i * 10;
   System.out.print(i);
  }
  System.out.println();
  System.out.println("x = " + x + ", y = " + y + ", i = 5");
 }
}