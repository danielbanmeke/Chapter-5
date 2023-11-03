public class DecreasingOddNumber {
    public static void main(String[] args) {
        System.out.println("  ");
        System.out.println("");
        System.out.println("DECREASING ODD NUMBER BETWEEN 1 AND 100");

        for(int n = 100; n >= 1; n--)
            if (n % 2 == 1)
                System.out.print(n + " ");
    }
}
