import java.sql.SQLOutput;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n1 sayısını gir: ");
        int n1 = sc.nextInt();

        System.out.print("n2 sayısını gir: ");
        int n2 = sc.nextInt();

        int i = 1;
        int ebob = 1;

        while (i <= n1) {

            if (n1 % i == 0 && n2 % i == 0) {

                ebob = i;

            }

            i++;

        }

        System.out.println("EBOB: " + ebob);
        System.out.print("EKOK: " + (n1*n2) / ebob);


    }
}
