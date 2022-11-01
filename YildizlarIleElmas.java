import java.util.Scanner;

public class YildizlarIleElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını Gir: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
