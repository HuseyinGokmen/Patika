import java.util.Scanner;

public class Bolunenler3ve4 {
    public static void main(String[] args) {
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        Scanner inp = new Scanner(System.in);

        int input, adet=0, toplam=0;
        System.out.print("Sayı giriniz: ");
        input = inp.nextInt();

        double ort;


        for (int x = 0; x <= input; x++) {
            if (x % 3 == 0 && x % 4 == 0){
                toplam = toplam + x;
                adet++;
            }
        }
        ort = toplam / (adet-1);
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ort);

    }
}
