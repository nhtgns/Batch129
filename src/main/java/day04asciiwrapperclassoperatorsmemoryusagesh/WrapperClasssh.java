package day04asciiwrapperclassoperatorsmemoryusagesh;

public class WrapperClasssh {

    public static void main(String[] args) {


        //java bir urun ,satip para kazanir                Autoboxing= otomatik kutulama demek. Unboxing= kutudan cikarmak
        //Primitive ler : char,     boolean,    byte     short    int      long      float        double
        //wrapper Class: Character  Boolean     Byte     Short    Integer  Long      Float        Double

        //Parantez varsa isaretin sonunda method tur (n. koydun, yaninda () yoksa o method degildir
        // variable leri , class lari ve methodlari isimlendiririrz
        //Wrapper classs lar non primitive dir,o yuzden memory de cok yer kaplar. deger ve method var. oyuzden sart degilse kullanma
        int n = 12;       //"n" yazip nokta koyarsaniz hic method goremezsiniz cunku primitive ler method icermez

        Integer m= 12;   //"m" yazip nokta koyarsaniz bircok method gorursunuz cunku wrapperler method icerir

        byte p= 23;

        Byte r = 43;

        //Example 1. short data type inin mimum ve maksimum degerini kod olarak yaz
        short maxShort = Short.MAX_VALUE ; //32767
        System.out.println(maxShort);      //-32768

        short minShort= Short.MIN_VALUE;
        System.out.println(minShort);

        //Example 2: int data type'inin minimum degeri ile byte data type'inin maximum degerinin toplamini bulunuz.

        int intMin = Integer.MIN_VALUE; //-2147483648
        System.out.println(intMin);

        byte byteMax= Byte.MAX_VALUE;
        System.out.println("Toplam :" + (intMin + byteMax));  //-2147483521

        //EX 3. i) primitive int i Wrapper Integer a cevir ( autoboxing)
        int num = 22;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);

        //    wrapper byte i primitive byte a cevirelim (unboxing)

        Byte k = 43;
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Ex 4: primitive char "wrapper Character" e ceviriniz

        char initial = 'T';
        Character initialWrapper = initial;


        // Wrapper boolean i "primitive boolean" a cevirirniz
        // isOld yasli mi
        Boolean isOld = true;
        boolean isOldWrapper = isOld;


        //EX 5: size string olarak verilen iki fiyatin toplamini ekrana yazdir

        String shirt = "2300";
        String shoes = "5200";

        //javada + sembolu 2 sayi arasinda kullanilirsa toplama islemi olur. 3+5 = 8  gibi
        //javada + sembolu 2 string arasinda veya bir string ve  bir sayi arasinda kullanilirsa concotenation olur, birlestirme
        //note: concotenation islemlerinde matematigin islem onceligi kurallarini isletir
        //mat islem onceligi, once uslu sayilar, parantez ici islemler yapilir, carpma ve bölme, toplama ckarma
        //carpma bolme varsa sol tarafta hangisi varsa o islemle baslar

        System.out.println(shirt + shoes);// 23005200  //Concotenation yapti burada java ,birlestirme cunku shirt ve shoes hala string

        //  "A" + 7 = "A7" concotnation
        //  8+3+ "K" = "11K" con...
        // "H" + 5 ("H5"+12)  +12 = "H512"
        //  "K" + 3 * 5= "K15" burada mat islem onceligi var 3*5=15 yapar sonra concotinatio yapar
        //stringler toplanmaz sadece concotenetion yapilir
        // valueOf, stringleri Integer e cevirir
        // valueOf'un ilk isi shirt ve shoes 'in tum karakterlerinin sayi olup olmadigidir. sayi olmayani sayiya nasil cevirsin.
       int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
          //                  burasi sayi, 2300       // burasi sayi 5300
        System.out.println(toplamFiyat); //7500

        //Ex 6: size string olarak verilen iki fiyatin toplamini ekrana yazdir
        // note: valueOf tum karakterleri rakam olan stringleri sayiya cevirir,
        //eger valueof methodu kullanirken string in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz, sonra ogrenilecek

        String tv = "$11000";
        String radio = "$3000";
        System.out.println(tv + radio); //$11000$3000

        int toplamPrice  = Integer.valueOf(tv)+ Integer.valueOf(radio);
        System.out.println(toplamPrice);
        // burada valueOf methodu tv yi 11000 e ceviremez cunku sayinin basinda $ isareti var ,bu isaret sayi degil,burdaa hata verir





    }
}
