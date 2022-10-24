import java.util.Scanner;
public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int born,chineZ;
        System.out.print("Çin Zodyağınızı hesaplamak için lütfen doğum tarihinizi girin: ");
        born = input.nextInt();

        chineZ = born % 12;
            if (chineZ==0){
                System.out.println("MAYMUN");
            } else if (chineZ==1) {
                System.out.println("HOROZ");
            }else if (chineZ==2) {
                System.out.println("KÖPEK");
            }else if (chineZ==3) {
                System.out.println("DOMUZ");
            }else if (chineZ==4) {
                System.out.println("FARE");
            }else if (chineZ==5) {
                System.out.println("ÖKÜZ");
            }else if (chineZ==7) {
                System.out.println("TAVŞAN");
            }else if (chineZ==8) {
                System.out.println("EJDERHA");
            }else if (chineZ==9) {
                System.out.println("YILAN");
            }else if (chineZ==10) {
                System.out.println("AT");
            }else if (chineZ==11) {
                System.out.println("KOYUN");
            }else System.out.println("Hatalı bir değer girdiniz !");
    }
}
