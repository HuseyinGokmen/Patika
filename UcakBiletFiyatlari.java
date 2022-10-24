import java.util.Scanner;

public class UcakBiletFiyatlari {
    public static void main(String[] args) {
        int yas, tip;
        double mesafe = 0;

        Scanner inp = new Scanner(System.in);

/*Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2)
olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.

Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/


        System.out.print("Lütfen mesafeyi giriniz: ");
        mesafe = inp.nextDouble();

        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini seçiniz:\n1.Tek Gidiş\n2.Gidiş - Dönüş\n--> ");
        tip = inp.nextInt();

        double firstPrice, perKm=0.10, discountedPrice;
        firstPrice = perKm * mesafe;


        if (mesafe > 0 && yas > 0) {
            if (tip == 1 || tip == 2) {
                switch (tip) {
                    case 2:
                        if (yas < 12) {
                            discountedPrice = firstPrice*0.50*0.80;
                            System.out.println("Kişi 12 yaşından küçük olduğu ve gidiş dönüş seçildiği için ücret: " + discountedPrice + " TL" );
                        }
                        break;
                    case 1: {
                        if (yas < 12) {
                            discountedPrice = firstPrice*0.50;
                            System.out.println("Kişi 12 yaşından küçük olduğu için ve tek yön seçildiği için ücret: " + discountedPrice + " TL" );
                        }
                    }
                    break;
                }
            }
        } if (mesafe > 0 && yas > 0) {
            if (tip == 1 || tip == 2) {
                switch (tip) {
                    case 2:
                        if (yas > 12 && yas < 24) {
                            discountedPrice = firstPrice*0.9*0.8;
                            System.out.println("Kişi 12 ila 24 yaş arası olduğu ve gidiş dönüş seçildiği için ücret: " + discountedPrice + " TL");
                        }
                        break;
                    case 1: {
                        if (yas > 12 && yas < 24) {
                            discountedPrice = firstPrice*0.9;
                            System.out.println("Kişi 12 ila 24 yaş arası olduğu ve tek yön seçildiği için ücret: " + discountedPrice + " TL");
                        }
                    }
                    break;
                }
            }


        } if (mesafe > 0 && yas > 0) {
            if (tip == 1 || tip == 2) {
                switch (tip) {
                    case 2:
                        if (yas > 65) {
                            discountedPrice = firstPrice*0.70*0.80;
                            System.out.println("Kişi 65 yaşından büyük olduğu ve gidiş dönüş seçildiği için ücret: " + discountedPrice + " TL");
                        }
                        break;
                    case 1: {
                        if (yas > 65) {
                            discountedPrice = firstPrice*0.70;
                            System.out.println("Kişi 65 yaşından büyük olduğu ve tek yön seçildiği için ücret: " + discountedPrice + " TL");
                        }
                    }
                    break;
                }
            }
        } if (mesafe > 0 && yas > 0) {
            if (tip == 1 || tip == 2) {
                switch (tip) {
                    case 2:
                        if (yas > 24) {
                            discountedPrice = firstPrice*0.80;
                            System.out.println("Kişi " + yas + " yaşında  olduğu ve gidiş dönüş seçildiği için ücret: " + discountedPrice + " TL");
                        }
                        break;
                    case 1: {
                        if (yas > 24) {
                            discountedPrice = firstPrice;
                            System.out.println("Kişi " + yas + " yaşında  olduğu ve tek yön seçildiği için ücret: " + discountedPrice + " TL");
                        }
                    }
                    break;
                }
            }
        } else {
            System.out.println("HATALI VERİ GİRDİNİZ!");
        }


    }
}