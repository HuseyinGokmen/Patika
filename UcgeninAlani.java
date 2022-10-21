import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {
        double kenar1, kenar2, kenar3;
        double alan, cevre, u;
        Scanner input = new Scanner(System.in);

        System.out.print("Kenar 1: ");
        kenar1 = input.nextInt();
        System.out.print("Kenar 2: ");
        kenar2 = input.nextInt();
        System.out.print("Kenar 3: ");
        kenar3 = input.nextInt();



        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = Math.sqrt(u * (u-kenar1) * (u-kenar2) * (u-kenar3));
        System.out.println("Üçgenin alanı: " + alan);

        cevre = kenar1 + kenar2 + kenar3;
        System.out.println("Üçgenin çevresi: " + cevre);
    }

}
