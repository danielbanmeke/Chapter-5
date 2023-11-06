public class DecreasingEvenNumbers {
    public static void main(String[] args) {

        System.out.println("  ");
        System.out.println("DECREASING EVEN NUMBER BETWEEN 1 AND 100");
        System.out.println("  ");
        for (int n = 100; n >= 1; n--)
            if (n % 2 == 0)
                System.out.print(n + " ");
    }
}
