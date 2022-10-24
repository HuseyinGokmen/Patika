import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil;
        boolean durum = true;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl griniz: ");
        yil = inp.nextInt();



        if (yil%4==0){
            if (yil%100==0 && yil%400!=0){
                durum = false;
            }else {
                durum = true;
            }
        }else {
            durum = false;
        }

        if (durum==true){
            System.out.println(yil + " bir artık yıldır !");
        }else {
            System.out.println(yil + " bir artık yıl değildir !");
        }

//        if (kalan1==0){
//            System.out.println(yil + " artık yıldır.");
//        } else if (kalan2==0) {
//            System.out.println(yil + " artık yıldır.");
//        }else System.out.println(yil + " artık yıl değildir !");

    }
}
