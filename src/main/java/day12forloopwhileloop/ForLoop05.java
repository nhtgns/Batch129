package day12forloopwhileloop;

public class ForLoop05 {
    public static void main(String[] args) {
        // hic sayi kullanmadan 1 den 100 e kadar olan sayilari ekrana yazdirin.

        for (int i = 'd'/'d'; i <= 'd' ; i++) {
            System.out.print(i + " ");

        }
        // note 1; bazi loop lar hic calismayabilir. zero execution
        for (int i = 1; i < 0 ; i--) {
            System.out.println("*");

        }
        // note 2: bazi loop lar sonsuz defa  calisabilir
        //en cok yapilan hata bu tarz looplara infinite ( sonsuz)
        // infinite loop daha cok increment decrement kisminda yapilan hatadan kaynaklanir
        //for (int i = 1; i < 10; i--) {
         //   System.out.println("Java is money..");

       // }
        //note 3; baska bir infinite loop

                        // sart yok          //increment
        //Loop olusturdugunuzda 2. kismi yazmazsaniz infinite loop olur
       // for ( int i=1;                 ;      i++      ){
        //    System.out.println("Hi");
       // }
    }
}
