package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {

        // Ex 1: 3 ten 6 a kadar tam sayilari ekrana yaz
        // kac defa donecegi kesin ise for loop kullan ama ne kadar donecegi net degilse while loop kullan
        for (int i = 3; i < 7; i++) {
            System.out.println(i + " ");

        }

        // 2.yol  while ile //while 'iken' demek

        int i = 3;  // baslangic

        while (i < 7) {   // bitis deger, yani sart. // burada i 7 den kucuk iken yazdir, yap

            System.out.print(i + " ");  // calistir

            i++;  // increment decrement // bu sona yazilir(duruma gore artir ya da azalt

        }
        System.out.println("hhhhh");

        //EX 2: 23 ten 12 ye kadar cift tam sayilari konsola yazdiriniz
        int k = 23;

        while (k > 11) {

            if (k % 2 == 0) {

                System.out.print(k + " "); //

                k--;
            }
        }
        System.out.println("fggh");


        for (int j = 25; j > 11; j--) {
            if (j % 2 == 0) {
                System.out.println(j + " ");
            }

        }
        // intewiv sorusu
        //Ex 3: verilen bir tam sayinin rakamlari toplamini kon yazdiran kodu yaz
        // sayi %10 her zaman sayinin son rakamini verir // kac basamak varsa o kadar loop var. 0 i gor

        // 1.yol
        int num = 578;

        int sum = 0;  // bu yeni deger icin atilacak konteyner

        while (num > 0) { // nicin num > 0 akadar calisiyor cunku sifiri gorunce dongu bitecek.num <0 olsa sonsuza kadar calisir

            sum = sum + num % 10;  // 0 ile 8 i topla  ,sirayla 7 ve 5 ile topla

            num /= 10; // decrement// i--  i++ // burada 578 bolundu 10a ve sonucta 57 kladi, sonra 5
        }
        System.out.println(sum); //20

        System.out.println("kkkk" );

        // 2.yol (for loop).  sayinin rakamlari toplamini bulunuz

        int a = 6841; // burada for loop a baslangic degeri ile baslanir. o da a  ( 6841)

        int toplam = 0;  // yeni data icin olusturuldu

        // buradaki m, esasinda 'i'              //decrement
        for (int m = a ;              m > 0 ;     m/=10) {     // burada verilen sayi 0 dan buyuk oldugu surece calismali diyoruz

       toplam = toplam+ m%10;


        }System.out.println(toplam);
         //19

    }
}
