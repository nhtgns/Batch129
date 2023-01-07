package day03scannersh;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Kullanicidan adresini aliniz ve ekrana yazdirirniz
        //Scanner class i kullanabilmek icin scanner class tan bir tane object olusturmalisiniz
        Scanner input = new Scanner(System.in);

        System.out.println(" lutfen adresinizi giriniz.");

        //Object nin ismini input yaptim cunku bu object kullanicidan alinan datayi benim kodlarimin icine koyacak
        // nextLine metodu kullanicidan cok kelime li string almak icin kullanilir


        String adresse = input.nextLine();
        System.out.println(adresse);
    }
}
