package day10switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        //Ex : Kullanicidan 2 sayi ve yapilacak islemi alan ve toplama cikarma carpma bolme ve yuzde islemlerini yapan kodu yaz

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz"); //kullanicidan sayiyi istiyoru

        double a =input.nextDouble(); //kullanicidan gelen sayiyyi bu data type seklinde memory e kaydediyorum
        double b =input.nextDouble();

        System.out.println("yapilacak islemi giriniz.   + - * / %");  //tek karakter girecegi icin char kullandik
        char opr = input.next().charAt(0); //kullanicidan char ve ilk karakterri almak icin boyle charAt(0) kullaniyoruz

        switch (opr){  // buraya sadece 5 tanesi gir

            case '+':  // arti durumunda bunlari yap
                System.out.println(a + "+" + b + "=" + (a+b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a-b));
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + (a*b));
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + (a/b)); // a sayisi b ye bolunur
                break;
            case '%':
                System.out.println(a + "%" + b + "=" + (a*b/100)); // a nin yuzesi aliniyor, a 100 olsun ,b 10. 100 un 100 de 10 u alinir
                break;
            default:
                System.out.println("bu islem tanimlanmamistir");
        }
    }
}
