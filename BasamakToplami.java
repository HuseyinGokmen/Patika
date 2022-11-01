import java.util.Scanner;
public class BasamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int say, counter = 0, sum = 0;

        System.out.print("Sayıyı gir: ");
        say = input.nextInt();

        while (say != 0) {
            sum += say % 10;
            say /= 10;
            counter++;
        }
        System.out.println("basamak sayısı: " + counter);
        System.out.println("basamak toplamı ise: " + sum);
    }
}
