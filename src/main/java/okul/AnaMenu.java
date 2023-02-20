package okul;

import java.util.Scanner;

public class AnaMenu {

    public static void anaMenu() {
        boolean isValid= false;
        do {
            System.out.println("----------------------------------");
            System.out.println("" +
                    "\tOgrenci menu icin   1\n" +
                    "\tOgretmen menu icin  2\n" +
                    "\tCikis icin          0 e tiklayiniz");

            Scanner input = new Scanner(System.in);
            int tercih = input.nextInt();
            switch (tercih) {
                case 1:
                    CalismaClassi.ogrenciMenu();
                    break;
                case 2:
                    OgretmenCalismaClassi.ogretmenMenu();
                    break;
                case 0:
                    System.out.println("Tekrar bekleriz.");
                    isValid = true;
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz");

            }
        } while (isValid == false);
        projeDurdur();
    }
    public static void projeDurdur() {
        System.out.println("Okul projesinden ciktiniz");
        System.exit(0);
    }

}