import java.util.Scanner;

public class havayaGoreAktivite {
    public static void main(String[] args) {
        byte heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Hava kaç derece? : ");
        heat = inp.nextByte();


        if (heat < 5) {
            System.out.print("Bu havada kayak yapılır!");
        } else if (heat >= 5 && heat < 15) {
            System.out.print("Bu havada sinemaya gidilir!");
        } else if (heat >= 15 && heat < 25) {
            System.out.print("Bu havada pikniğe gidilir!");
        } else if (heat >= 25) {
            System.out.print("Bu havada yüzmeye gidilir!");
        } else {
            System.out.print("Lütfen geçerli bir değer giriniz!");
        }
    }
}