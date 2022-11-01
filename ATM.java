import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int right = 3;
        double balance = 3000;
        int select, price;

        while (right > 0) {
            System.out.print("Kullanıcı Adı: ");
            userName = inp.nextLine();
            System.out.print("Şifre: ");
            password = inp.nextLine();
            if (userName.equals("Patika") && password.equals("1234")) {
                System.out.println("Merhaba, HuGo Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırılacak Para Miktarı: ");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekilecek Para Miktarı: ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.print("Yetersiz Bakiye.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Yine Bekleriz\n-HuGo Bankaları:D");
                break;
            } else {
                right--;
                System.out.println("Tekrar Deneyiniz, Hatalı Giriş!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke oldu, bankayla iletişime geçin!");
                } else {
                    System.out.println("Kalan Hak: " + right);
                }

            }

        }


    }
}
