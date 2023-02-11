package kahvemakinesi;

import java.util.Locale;
import java.util.Scanner;

public class KahveSecimi {

    public static void kahveSecimi() {

        Scanner input = new Scanner(System.in);

do{

    System.out.println("Hangi Kahveyi istersiniz?"+
                "\n Turk Kahvesi" +
                "\n Filtre Kahve" +
                "\n Espresso   ");
        String kahveeSecimi = input.nextLine().toLowerCase().trim();

        if (kahveeSecimi.equalsIgnoreCase("Turk Kahvesi")){
            System.out.println("Türk kahvesi hazırlanıyor.");
            break;

        }else if ( kahveeSecimi.equalsIgnoreCase("Filtre Kahve")){
            System.out.println("Filtre kahve hazırlanıyor");
          break;

        }else if (kahveeSecimi.equalsIgnoreCase("Espresso")){
            System.out.println( "Espresso hazırlanıyor");
          break;
        }else {
            System.out.println("Hatali giris. Yeniden deneyiniz");
        }


    }while (true);
}

    }
