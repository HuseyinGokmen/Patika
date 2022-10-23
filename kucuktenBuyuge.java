import java.util.Scanner;
public class kucuktenBuyuge {
    public static void main(String[] args) {
        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.print("a sayısını gir:");
        a = inp.nextInt();

        System.out.print("b sayısını gir:");
        b = inp.nextInt();

        System.out.print("c sayısını gir:");
        c = inp.nextInt();

        if (a < b && a < c){
            if (b < c){
                System.out.println("a < b < c");
            }else {
                System.out.println("a < c < b");
            }
        } else if (b < a && b < c) {
            if (a < c){
                System.out.println("b < a < c");
            }else {
                System.out.println("b < c < a");
            }
        } else if (c < a && c < b) {
            if (a < b){
                System.out.println("c < a < b");
            }else {
                System.out.println("c < b < a");
            }
        }else {
            System.out.println("Eşitlik var, lütfen her sayıyu birbirinden farklı girin!");
        }


    }
}
