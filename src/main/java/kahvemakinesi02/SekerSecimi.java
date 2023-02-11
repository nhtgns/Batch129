package kahvemakinesi02;

import java.util.Scanner;

public class SekerSecimi {
    public static void sekerSecimi() {

        do {
            Scanner input = new Scanner(System.in);

        System.out.println("Şeker ister misiniz ? " +
                "\n Evet" +
                "\n Hayir");
        String sekersecimi = input.next().toLowerCase().trim();


        if (sekersecimi.equalsIgnoreCase("Evet")) {
            System.out.println("Kac seker istersiniz?");
            int sekerSayisi = input.nextInt();
            System.out.println(sekerSayisi + " seker ekleniyor ");
            break;


        } else if (sekersecimi.equalsIgnoreCase("Hayir")) {
            System.out.println("Seker eklenmiyor");
            break;

        } else {
            System.out.println("Hatali giris yaptiniz");
        }
    }while (true);

    }
}
