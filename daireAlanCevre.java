import java.util.Scanner;
public class daireAlanCevre {
    public static void main(String[] args) {
    /* yarı çapı kullanıcıdan alıp dairenin, alan ve çevresini hesaplayacağız */
    int r;
    double cevre, alan, pi = 3.14;

    Scanner inp = new Scanner(System.in);
    System.out.print("Dairenin yarı çapını giriniz: ");
    r = inp.nextInt();

    cevre = 2 * pi * r;
    alan = pi * r * r;

        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.print("Dairenin Alanı: " + alan);

    }
}
