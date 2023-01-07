package day10switchloops;

public class Loops01 {
    public static void main(String[] args) {

        // Ex 1: Ekrana 5 kere "Hi" yazdirin. bir isi nasil yaptiginiz da onemlidir. tekrardan (repetition) kacinin. dinamik olmalidir kod.
        // tamir( fix) ve update(gelistirme) kolay yapilabilmelidir

        //1.yol , tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.yol
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde Loops lar kullanilir
        //4 tane var; for loop, while loop, do while loop , for each loop


        // for loop  //sayi kactan baslanacaksa o sayi baslangic degeri olarak kabul edilir ve ilk once yazilir
        // baslangic degeri       Loop un calisma sarti         Increment/Decrement
        for (int i = 1        ;           i < 6            ;          i++) {
            System.out.println("Hi!");

        }
        //  Ex 2:   11 den 44 e kadar tum sayilari  ekrana yazdirin
        for (int i = 11;   i <45;    i++) {
            System.out.print(i);
        }

        //E 3:  40 dan 23 e kadar cift tam sayilari ekrana  yazdiran kodu yaziniz.
        // eger belli sarta bagliyorsa if kullan, daha iyi
        for (int i = 40; i > 22; i--) {

            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
        //Ex4   18 den 56 ya kadar tum tek sayi ek yaz kod

        for (int i = 18; i < 57; i++) { // burada neden 57 yazdik cunku yukarida 56 ya kadar dedi,
            // 57 yazinca 56 ya kadar dikkate alir,57. sayi calistirilmaz
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
