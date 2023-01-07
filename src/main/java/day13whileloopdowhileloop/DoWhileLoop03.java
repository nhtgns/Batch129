package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

        /*

        Username = "admin" Password = "pwd123"
        Kullanicidan username ve possword u aliniz .
        bunlar dogru ise "Hesabiniza hosgeldiniz" desin yazdirin
        username veya passsword yanlis ise "Username ve Passwordunuzu" giriniz mesaji versin
        bunlar 4. kez yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererk islemi tamamlayiniz
         */
        Scanner input = new Scanner(System.in);


        int counter = 0;  // sayac

        do{  // yap demek
            if(counter == 4){
                System.out.println("Hesabiniz bloke oldu!");
                break;
            }
            System.out.println(" Username giriniz");
            String  username  = input.next();

            System.out.println(" Password giriniz");
            String  password = input.next();


            if (username.equals("admin")  &&  password.equals("pwd123")){
                System.out.println("hesabiniza hosgeldiniz");
                break;
            }
            counter++;

        } while (true);  // //burada şarta gerek yok. Şart olmaması nedeniyle bilerek sonsuz döngü yaptı.
        // Biz yukarıda kendimiz loopu kırıyoruz.
    }
}
