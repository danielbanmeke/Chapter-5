public class ForCounter {
    public static void main(String[] args) {
        for (int counter =1; counter <= 10; counter++)
            System.out.printf("%d  ", counter);
        System.out.println();
        for (int i = 99; i >= 0; i -= 11)
            System.out.printf("%d  ", i);
    }
}
