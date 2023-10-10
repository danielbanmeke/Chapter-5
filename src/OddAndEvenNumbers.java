import java.util.Scanner;
public class OddAndEvenNumbers {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner input = new Scanner(System.in);
        if ( (input.nextInt() % 2) == 0 )
            System.out.println("even");
        else
            System.out.println("odd");

        int n = 10;
        if (n > 10)
            System.out.println("> 10");
        else if (n == 10)
                System.out.println("=10");
        else
            System.out.println("<10");
    }
}
