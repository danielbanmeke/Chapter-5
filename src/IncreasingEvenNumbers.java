public class IncreasingEvenNumbers {
    public static void main(String[] args) {

        System.out.println("  ");
        System.out.println("INCREASING EVEN NUMBERS BETWEEN 1 AND 100");
        System.out.println("  ");

        for (int n = 2; n <= 100; n++)
            if (n % 2 == 0)
                System.out.print(n + " ");
    }
}
