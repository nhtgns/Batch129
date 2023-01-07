package day05typecastinstringmanipulations;

public class TypeCasting01 {

    public static void main(String[] args) {
         /*
         Numering primitive data type lerinin birbirine donusturulmesine " Type Casting" denir
         Numering data type ler ( sayisal tada typeler ):  byte, short, int ,long ,float, double
           casting = baskasi gibi davranmak demek
         Note: kucuk data tiplerini buyuk data typrenine cevirmeyi java otomatik olarak yapabilir
         Bu isleme " Autowidening" denir. otomatik genisletme demek

         Note 2: buyuk data type lerini kucuk data type lerine cevirmek riskli bir istir, java bu riskli isi otomatik olarak yapmaz,
         bu isi kod yazanlar yapar.
         Bu isleme " ExplicitNarrowing" (aciktan daraltma)  denir
          */

        //E 1 : byte data type ini, int data type ne cevir.

        byte age    = 13;   // bu autowidening
        int ageInt  = age;  //bu islem icin int kutusunun hazir olmasi lazim, ki var "ageInt" artik int dir.

        // long u short a cevir.
        long  weight     = 234;
        short weightShort  = (short) weight; // burada short olmasi icin acikca yazdik, ( short ) diye

        //int i float a cevir.

        int population = 700000;  //autowidening
        System.out.println(population);

        float populationFloat = population; // float hazir
        System.out.println(populationFloat);

        // 3: dooble data type ini short data type ine ceviriniz


        double number = 12.234;
        System.out.println(number);  //12,34

        short numberShort =(short)number;
        System.out.println(numberShort); //12  short olursa virgullu kisim duser

        // Dikkat
        //donusum yaptiginiz sayi, donuseceginiz data type inin sinirlari disinda ise java kullandiginiz sayi ile mod islemi yapar ve
        // mod isleminin sonucu sizin yeni degeriniz olur
        //Ex 1
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte) num;
        System.out.println(numByte);//4  , burada 4 nereden geldi, acikliyoruz byte -128 de 127 kadar gider.
                                    // java onceden  belirlene sayiyi 260 i byte in degerine 256 a boler ve oraya kalani 4 yazar

        //EX 2:
        short n = 1023;
        System.out.println(n);  //1023

        byte nByte = (byte)n;
        System.out.println(nByte);//-1
        // normalde 253 kalir 1023 u 256 ya bolunce,java buyuk sayi yazmaktansa sayiyi 4 tane byte bolmus gibi bolum gosterip -1 yazar, kucuk sayiyi kullanir



    }
}
