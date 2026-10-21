import java.util.Scanner;

public class URI1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next(), c = sc.next();

        if (a.equals("vertebrado")) {
            if (b.equals("ave")) {
                System.out.println(c.equals("carnivoro") ? "aguia" : "pomba");
            } else {
                System.out.println(c.equals("onivoro") ? "homem" : "vaca");
            }
        } else {
            if (b.equals("inseto")) {
                System.out.println(c.equals("hematofago") ? "pulga" : "lagarta");
            } else {
                System.out.println(c.equals("hematofago") ? "sanguessuga" : "minhoca");
            }
        }
        sc.close();
    }
}