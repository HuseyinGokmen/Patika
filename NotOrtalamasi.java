import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        /* Java ile matematik, fizik, kimya, türkçe, tarih ve müzik sınavlarının puanlarını alacağız
         ortalama hesaplanacak (geçti-geçmedi), ekrana verilecek */

        // Ali'nin dersleri
        short matematik, fizik, kimya, turkce, tarih, muzik;

        /* Dahil etmediysek Scanner sınıfını en üste dahil edelim ve Scanner sınıfını tanımlayalım */

        Scanner puan = new Scanner(System.in);

        // Ali sınavlardan kaç aldı?
        System.out.print("Matematik notu:");
        matematik = puan.nextShort();

        System.out.print("Fizik notu:");
        fizik = puan.nextShort();

        System.out.print("Kimya notu:");
        kimya = puan.nextShort();

        System.out.print("Türkçe notu:");
        turkce = puan.nextShort();

        System.out.print("Tarih notu:");
        tarih = puan.nextShort();

        System.out.print("Müzik notu:");
        muzik = puan.nextShort();

        // Ali'nin ortalamsı için toplam ve sonuc adında degisken tanımlayalım
        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        float sonuc = toplam / 6f;

        System.out.println("Ali'nin ortalaması:" + sonuc + " yaptı.");
        String kosul = (sonuc >= 60) ? "Ali sınıfı geçerek telefon ödülüne layık oldu." : "Ali sınıfta kaldı, telefon için seneye daha çok çalışacakmış.";
        System.out.print(kosul);


    }
}