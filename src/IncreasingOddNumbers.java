
public class IncreasingOddNumbers {
    public static void main(String[] args) {
        System.out.println("  ");
        System.out.println("INCREASING ODD NUMBER BETWEEN 1 AND 100");
        System.out.println("  ");

        for (int n = 1; n <= 100; n++)
            if (n % 2 == 1)
                System.out.print(n + " ");
    }
}
