import java.util.Scanner;

public class Kuvvetleri4ve5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        int n;
        System.out.print("Sayı giriniz: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println("4'ün kuvvetleri--> " + i);
        }
        System.out.println(" * * * * * * * * * * * * * ");
        for (int j = 1; j <= n; j *= 5) {
            System.out.println("5'in kuvvetleri--> " + j);
        }
    }
}
