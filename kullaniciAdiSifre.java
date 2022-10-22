import java.util.Scanner;

public class kullaniciAdiSifre {
    public static void main(String[] args) {
        String userName, psw;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        userName = inp.nextLine();

        System.out.print("Şire: ");
        psw = inp.nextLine();

        if (userName.equals("hugo") && psw.equals("123")) {
            System.out.println("Giriş Yapıldı.");
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış!");

            String newPsw;
            int select;

            System.out.println("Şifrenizi sıfırlamak için 1' e basın, çıkmak için 2'ye basın.");
            select = inp.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Yeni şifre giriniz: ");
                    Scanner inp2 = new Scanner(System.in);
                    newPsw = inp2.nextLine();
                    if (newPsw.equals("123")) {
                        System.out.println("Yeni şifre eskisiyle aynı olamaz!");
                    } else {
                        System.out.println("Yeni şifre başarıyla oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Çıkış yapıldı.");
                    break;
            }
        }
    }
}
