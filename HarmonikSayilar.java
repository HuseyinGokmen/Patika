import java.util.Scanner;
public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını gir: ");
        int n = input.nextInt();
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += (1.0/i);
        }
        System.out.println("Harmonik toplam: " + sum);
    }
}

