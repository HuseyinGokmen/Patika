import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, sum = 0;
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum += i;
            }
        }

        if (number == sum) {
            System.out.println(number + " mükemmel sayıdır.");
        } else System.out.print("Bölenler toplamı " + sum + " ettiği için mükemmel sayı değildir.");

    }
}
