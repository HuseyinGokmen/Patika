import java.sql.SQLOutput;
import java.util.Scanner;

public class buyukKucuk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, number, nBuyuk = 0, nKucuk = 0;
        System.out.print("Sayı adedini girin: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Lütfen " + i + ". sayıyı giriniz: ");
            number = sc.nextInt();
            if (i == 1) {
                nBuyuk = number;
                nKucuk = number;
            } else {
                if (number > nBuyuk) {
                    nBuyuk = number;
                } else if (number < nKucuk) {
                    nKucuk = number;
                }
            }
        }

        System.out.println("En büyük sayı: " + nBuyuk);
        System.out.print("En küçük sayı: " + nKucuk);


    }
}
