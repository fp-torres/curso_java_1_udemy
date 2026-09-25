import java.util.Locale;
import java.util.Scanner;


public class URI1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
                
        System.out.println("URI 1008");
                              
        Scanner sc = new Scanner(System.in);

        
        int number = sc.nextInt();
        int hours = sc.nextInt();
        double value = sc.nextDouble();

        double salary = hours * value;


        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n ", salary);

        

        sc.close();       

    }
}