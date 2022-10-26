import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n, r;

        System.out.print("n değerini giriniz: ");
        n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        r = input.nextInt();

        int facN = 1;
        for (int i = 1; i <= n; i++) {
            facN = i * facN;
        }

        int facR = 1;
        for (int i = 1; i <= r; i++) {
            facR = i * facR;
        }

        int facNR = 1;
        for (int i = 1; i <= (n-r); i++){
            facNR = i * facNR;
        }

        int combination = facN / (facR * facNR);

        System.out.println("sonuç: " + combination);

        //N elemanlı bir kümenin elemanları ile oluşturulacak
        // r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        // N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        //Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!)
    }
}
