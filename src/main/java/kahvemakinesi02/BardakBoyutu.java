package kahvemakinesi02;

import java.util.Scanner;

public class BardakBoyutu {
    public static void bardakSecimi() {

        do {
            Scanner input = new Scanner(System.in);

        System.out.println("Bardak secimi yapiniz" +
                "\n Buyuk boy" +
                "\n Orta boy" +
                "\n Kucuk boy");
        String bardakSecimi = input.nextLine().toLowerCase().trim();

        if (bardakSecimi.equalsIgnoreCase("Buyuk boy")) {
            System.out.println("Buyuk boy kahve hazirlaniyor");
            System.out.println("Afiyet olsun...");
            break;

        } else if (bardakSecimi.equalsIgnoreCase("Orta boy")) {
            System.out.println("Orta boy kahve hazirlaniyor ");
            System.out.println("Afiyet olsun...");
            break;


        } else if (bardakSecimi.equalsIgnoreCase("Kucuk boy")) {
            System.out.println("Kucuk boy kahve hazirlaniyor ");
            System.out.println("Afiyet olsun...");
            break;

        } else {
            System.out.println("Hatali giris yaptiniz");
        }
    }while (true);
    }
}
