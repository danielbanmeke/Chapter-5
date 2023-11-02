import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            i = input.nextInt();
        } while(i < 1 || i > 10);

        System.out.println(i + " is between 1 and 10");
    }
}
