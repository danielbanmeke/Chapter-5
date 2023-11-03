import java.sql.SQLOutput;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("     ");
        System.out.println("M U L T I P L I C A T I O N   T A B L E");
        System.out.println("     ");
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
