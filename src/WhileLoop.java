import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int n = input.nextInt();
        while(n >= 1 && n <= 10){
            System.out.print(n + " is between 1 and 10.");

            n = input.nextInt();
        }

        System.out.println(n + " is not between 1 and 10. Try again later");
    }
}
