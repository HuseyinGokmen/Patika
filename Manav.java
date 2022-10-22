import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        double
        armut = 2.14,
        elma = 3.67,
        domates = 1.11,
        muz = 0.95,
        patlican = 5,
        armutMiktari, elmaMiktari, domatesMiktari, muzMiktari, patlicanMiktari;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutMiktari = input.nextDouble();


        System.out.print("Elma Kaç Kilo ? : ");
        elmaMiktari = input.nextDouble();


        System.out.print("Domates Kaç Kilo ? : ");
        domatesMiktari = input.nextDouble();


        System.out.print("MUz Kaç Kilo ? : ");
        muzMiktari = input.nextDouble();


        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanMiktari = input.nextDouble();




        double toplamTutar;
        toplamTutar
        = ((armut * armutMiktari) + (elma * elmaMiktari) + (domates * domatesMiktari) + (muz * muzMiktari) + (patlican * patlicanMiktari));

        System.out.print("Toplam tutar: " + toplamTutar + " TL");

    }
}
