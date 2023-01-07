package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

        /*

        Kullanicidan bir tam sayi aliniz ,tam sayi 100 den kucuk ise kullaniciya "Kaybettiniz!" mesaji verrerek oyunu sonlandiriniz
        tamsayi 100 ve 100 den buyuk ise "kazandiniz!"  mesaji verek devam ettiriniz.

         */
        Scanner input = new Scanner(System.in);
        int num = 0; // bu konteyner , num lar sikinti olmasin diye "do" dan once olusturuldu

        do{
            System.out.println("bir sayi  giriniz"); // bu kisim kullanici dogru sayi girdikce ekranda gorunmesi gerektigi icin buraya alindi
            num = input.nextInt();  // burada 2 tane int kullanilmamali zaten yukarida int i kullandik

            if (num >= 100){ // burada 100 den kucuk sayi girilirse loop kirilir ve islem do nun disina cikar ve "kaybettiniz" yazar
                System.out.println("Kazandiniz!");
            }

        }while (num>=100); // bu kisim kullanici kazanirsa oyunun devam etmesi icin yaziliyor. burasi oyunun  devam etme sarti
                           // while do' nun suslu parantezinin disina yazilir
        System.out.println("Kaybettiniz!");

    }
}
