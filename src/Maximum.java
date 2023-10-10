import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        if (n > 10)
            System.out.println("> 10");
        else if (n == 10)
            System.out.println("= 10");
        else
            System.out.println("< 10");
    }
}