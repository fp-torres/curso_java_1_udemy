public class Rastreamento06 {
 public static void main(String[] args) {
  int x = 8, y = 3;
  int i = 0;
  for (; y < x; i++) {
   x = x - 2;
   y = y + 1;
   System.out.println(i);
  }
  System.out.println("x = " + x + ", y = " + y + ", i = " + i);
 }
}