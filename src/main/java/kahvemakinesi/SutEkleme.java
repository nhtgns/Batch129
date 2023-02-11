package kahvemakinesi;

import java.util.Scanner;

public class SutEkleme {
    public static void sutSecimi() {

     do {
         Scanner input = new Scanner(System.in);

        System.out.println("sut eklememizi ister misiniz" +
                "\n Evet" +
                "\n Hayir ");
        String sutsecimi = input.next().toLowerCase().trim();

        if ( sutsecimi.equalsIgnoreCase("Evet")){
            System.out.println("Sut ekleniyor");
            break;

        }else if (sutsecimi.equalsIgnoreCase("hayir")){
            System.out.println("Sut eklenmiyor");
            break;
        }else {
            System.out.println("Hatali giris yaptiniz, tekrar deneyiniz");
    }
}while (true);


    }

}