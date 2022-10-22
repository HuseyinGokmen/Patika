import java.sql.SQLOutput;
import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int t1, t2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı gririniz: ");
        t1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        t2 = input.nextInt();

        System.out.println("İşlem Seçiniz:");
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("-->");
        select = input.nextInt();


        switch (select) {
            case 1:  // toplama
                System.out.print("Toplarsak: " + t1 + t2);
                break;
            case 2: // çıkarma
                System.out.print("Çıkartırsak: " + (t1 - t2));
                break;
            case 3: // çarpma
                System.out.print("Çarparsak: " + t1 * t2);
                break;
            case 4: // bölme
                if (t2 == 0)
                    System.out.print("Bir sayı 0'a bölünemez!");
                System.out.print("Bölersek: " + t1 / t2);
                break;

            default:
                System.out.println("Lütfen geçerli bir değer giriniz!");
        }
    }
}
