import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        System.out.println("  ");
        System.out.println("SUM OF INTEGERS LESS THAN HUNDRED");
        System.out.println("  ");

        Scanner input = new Scanner(System.in);
        int total = 0;


         do {
            System.out.print("Enter a number: ");
            total += input.nextInt();

        } while (total <= 100);

        System.out.println("Done: " + total);
    }
}
