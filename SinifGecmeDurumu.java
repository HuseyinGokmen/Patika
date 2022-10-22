import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int fizik, kimya, mat, tur, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Fizik notunu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Matematik notunu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        tur = inp.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = inp.nextInt();

        double avarage;
        avarage = (fizik + kimya + mat + tur + muzik) / 5;

        if (avarage <= 55) {
            System.out.println("Ne yazık ki" + "oralama " + avarage + " ile sınıfta kaldınız!");
        } else if (avarage < 0 || avarage > 100) {
            System.out.print("Lütfen ders değerlerini 0 ile 100 arasında giriniz!");
        }else {
            System.out.print("Tebrikler! " + avarage + " ortalama ile sınıfı geçtiniz ( :");
        }

    }
}