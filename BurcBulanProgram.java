import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        byte day, month;
        String burc = "";


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen doğduğunuz ayı sadece \"sayı\" olarak giriniz: ");
        month = input.nextByte();

        System.out.print("Lütfen doğduğunuz günü sadece \"sayı\" olarak giriniz: ");
        day = input.nextByte();


        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "OĞLAK BURCU";
                    System.out.println(burc);
                } else {
                    burc = "KOVA BURCU";
                    System.out.println(burc);
                }
            } else {
                System.out.println("Hatalı giriş!");
            }
        }

        if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    burc = "OĞLAK BURCU";
                    System.out.println(burc);
                } else {
                    burc = "BALIK BURCU";
                    System.out.println(burc);
                }
            } else {
                System.out.println("Hatalı giriş!");
            }
        }

        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    System.out.println("BALIK BURCU");
                } else burc = "KOÇ BURCU";
                System.out.println(burc);
            } else {
                System.out.println("Hatalı giriş!");
            }
        }

        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    System.out.println("KOÇ BURCU");
                } else burc = "BOĞA BURCU";
                System.out.println(burc);
            } else {
                System.out.println("Hatalı giriş!");
            }
        }

        if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("BOĞA BURCU");
                } else burc = "İKİZLER BURCU";
                System.out.println(burc);
            } else {
                System.out.println("Hatalı giriş!");
            }
        }

        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    System.out.println("İKİZLER BURCU");
                } else burc = "YENGEÇ BURCU";
                System.out.println(burc);
            } else {
                System.out.println("Hatalı giriş!");
            }
        }

        if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("YENGEÇ BURCU");
                } else burc = "ASLAN BURCU";
                System.out.println(burc);
            } else {
                System.out.println("Hatalı giriş!");
            }
        }

        if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("ASLAN BURCU");
                } else burc = "BAŞAK BURCU";
                System.out.println(burc);
            } else System.out.println("Hatalı giriş!");
        }

        if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    System.out.println("BAŞAK BURCU");
                } else burc = "TERAZİ BURCU";
                System.out.println(burc);
            } else System.out.println("Hatalı giriş!");
        }

        if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    System.out.println("TERAZİ BURCU");
                } else burc = "AKREP BURCU";
                System.out.println(burc);
            } else System.out.println("Hatalı giriş!");
        }

        if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    System.out.println("AKREP BURCU");
                } else burc = "YAY BURCU";
                System.out.println(burc);
            } else System.out.println("Hatalı giriş!");
        }

        if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    System.out.println("YAY BURCU");
                } else burc = "OĞLAK BURCU";
                System.out.println(burc);
            } else System.out.println("Hatalı giriş!");
        }


    }
}