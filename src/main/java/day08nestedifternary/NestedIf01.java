package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
     /*
     java nasted if leri calistirirken cok zamana ihtici var ( time Consuming) buyuzden nestedif kullanmamaya calisiriz
     Consum = emmek demek
     iyi kod = kisa  ve anlasilir koddur
      */
        //zigon sehpa gibi, nested sehpa( ic ice gecmis if ' leri gorecegiz.
        //icerdeki if einner if denir, disaridaki if eauter if denir
        //icerdeki if e"innerif" denir. disaridaki if e ise outer if denir

        //Ex1:
        /*Kullanicidan 3 tane pozitif  sayi aliniz.

        Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
        Eger ucgen ise "eskenar"
        Ucgen olma durumunu
        kontrol ediniz.

        INFO :
        Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
        herhangi iki kenar farki  kenardan kucuk olmali
        a+b>c>a-b
        a+c>b>a-c
        b+c>a>b-c
        a=b=c ise eskenar ucgen

         */
        Scanner input = new Scanner(System.in);
        System.out.println("ucgeninin kenarlari icin 3 tane uzunluk girin");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean ucgenmi =(a + b > c && c > Math.abs(a - b))  &&  (a + c > b && b > Math.abs(a - c)) && (b + c > a && a > Math.abs(b - c));
        boolean negatifMi = a <= 0 || b <= 0 || c <= 0;


        //yukaridaki boolean, and islemidir.true
        //Math ckass indan abs methodu eksiyi art yapar
        // negatif sayilar pozitife cevrilir Math.abs() ile
        //Kullanici yanlislikla negatif sayi girdi ise kod asagidaki gibi yazilabilir.


        //Kullanicinin negatif sayi girmesini affetmiyorum
        if (negatifMi) {

            System.out.println("Ucgenin kenarlari sifir ve negatif olamaz");

        } else if (ucgenmi ) {


            if (a == b && b == c && a == c) {
                System.out.println("Ucgen hem de eskenar ucgen...");
            } else {
                System.out.println("Ucgen ama eskenar degil...");
            }

        } else {
            System.out.println("Sen ucgen degilsin...");
        }


    }
}
