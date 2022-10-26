import java.util.Scanner;
public class UsluSayiHesabi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int taban, us;

        System.out.print("Taban sayısı: ");
        taban = scn.nextInt();
        System.out.print("Üs sayısı: ");
        us = scn.nextInt();
// 3^2 --> 3 * 3
        int total=1;
        for (int i=1; i<=us; i++){
            total *= taban;
        }

        System.out.print("Cevap--> " + total);

    }
}
