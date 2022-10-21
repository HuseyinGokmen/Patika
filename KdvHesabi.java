import java.sql.SQLOutput;
import java.util.Scanner;
public class KdvHesabi {
    public static void main(String[] args) {
        /* Girilen tutarın %18 KDV'sini hesaplayacağız*/

        double tutar, kdvOrani1 = 0.18, kdvOrani2 = 0.08, kdvliTutar;   // ondalıklı olması için double veya float tanımlarız
        Scanner inp = new Scanner(System.in);  // Scanner fonksiyonu (metodu) için import etmeyi unutmayalım.
        System.out.print("Lütfen tutarı giriniz:");
        tutar = inp.nextDouble();

         kdvliTutar = tutar < 1000 ? (tutar * kdvOrani1 + tutar) : (tutar * kdvOrani2 + tutar);

        System.out.println("Tutar: " + tutar);
        System.out.println("1000 TL'ye kadar KDV Oranı: " + kdvOrani1);
        System.out.println("1000 TL ve sonrası için KDV Oranı: " + kdvOrani2);


        System.out.println("Girilen tutar için KDV'li fiyat: " + kdvliTutar);



    }
}
