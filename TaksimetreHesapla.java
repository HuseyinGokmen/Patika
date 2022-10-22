import java.util.Scanner;
public class TaksimetreHesapla {
    public static void main(String[] args) {
        double km;
        double perKm = 2.2, startPrice = 10, total;

        Scanner inp = new Scanner(System.in);
        System.out.print("KM'yi giriniz: ");
        km = inp.nextDouble();

        total = (km * perKm) + startPrice;

        total = (total < 20) ? 20 : total;

        System.out.print("Taksimetre tutarı: " + total);
    }
}
