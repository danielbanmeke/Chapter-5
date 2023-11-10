import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         int max = n;
         int min = n;

         if (n >= 0) {
             while (true) {
                 n = input.nextInt();

                 if (n < 0)
                     break;

                 max = n > max ? n : max;
                 min = n < min ? n : min;
             }

             System.out.println("min = " + min + ", max = " + max);
         }
         else System.out.println(n + " is invalid");

    }
}