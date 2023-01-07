package day06stringmanipulationsifstatement;

public class StringManipulations01 {


    public static void main(String[] args) {
        //Example 1: bir stringin bas ve sonunda "Space" karakteri varsa siliniz.
        //   "  Ali Can  "  ==> "Ali Can"  olacak
        // trim() : kiriklari almak demek. bas ve sondaki space leri siler aradaki space lere dokunmaz.

        String s = "   Ali Can   ";
        System.out.println(s);

        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //   string tv = "$456.99";    string laptop = "$875.99";  = 1332.98
        //virgullu sayilar dooble dir

        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$", ""); // replace , belirtilen harfi ,karakteri siler.
        System.out.println(tv2);   //456.99             // burada dolar isaretini sildi
        // Silmelerde "String" kullanilir, burada string kullandik.

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2);  //875.99
        //note : burada laptop2 ile tv2 yi bu haliyle toplayamam,cunku bunlar string. bunlari sayiya cevirmek icin "valueOf()"
        //methodunu kullanmaliyim ve kullandim
        //Bir ve birden fazla  karakteri sayiya cevirirken kullanilan data type indan sonra valueOf kullanilir
        //burada hangi Wrapper Class kullanilmali,tabiki double.
        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);   //1332.98

        //Example 3:  verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdir
        // initials : (bas harfler)  isimerin ve soyisimlerin ilk harfini alma islemidir.  "Ali Can"  ==>AC

        String name = "  alI Can "; // kullanici ismini yanlis girebilir ==> ornek , ali CAn gibi.oncelikle bas ve sondaki spaceler silinir
        //sonra yazim hatasi duzeltilir

        //Asagida once space ler silindi,sonra hepsi buyuk harf oldu sonra ilk ismin ilk harfi alindi. tabi ki char cinsinden
        char first = name.trim().toUpperCase().charAt(0); //charAt(0), su demek==> belirtilen ifededeki 0 indexi al(ilk karakteri al)
        System.out.println(first);                        //A yi aldik (ALI CAN) icinden

                                                             // index      index
        char second = name.trim().toUpperCase().split(" ") [1].charAt (0);

        // split, herhangibir karakterden parcalamak demek. parcalanacak karakter tirnak icinde yazilir. ve string 2 parca olur "0 ve 1 index olak uzere"
        //CAN ise 1. index te yer alir. koseli paranteze alinir istenen index

        System.out.println(second);  //C
        System.out.println("" + first + second); //AC

        //char lar toplanirsa harflerin ascii degerlerini toplar
        // ama parante icine parantezin basina ikitane cift tirnak koyulursa bu kelimelerin kelime ya da harf halini yazdirirdeger
        // split, herhangibir karakterden parcalamak demek. bosluktan kesince bosluk yok olur
        // split ten sonra index ler koseli parantez kullanilir

        //EX 4:  bir stringin hic karakter icermedigini  ( bos string) kontrol eden kodu yaziniz

        String str = ""; //string bos, length de 0 gorunuyor, yani karakter yok diyor, o zaman true verir
        //1. yol: length() kullan. length metodu karakter sayisini verir. 0 sa sonu 0 cikar. bosluk sifir demektir
        boolean result1 = str.length() == 0;
        System.out.println(" string bos mu? " + result1);  //true.

        // 2.yol:
        boolean resault2 = str.isEmpty();
        System.out.println("String bos mu? " + resault2); //true
        // isEmpty() bos mu diye soruyor. java bir method olusturmus ,direk soruyor bos mu diye


        //E 5:  bir stringin space haric hicbir character icermedigini kontrol edin.
        // 1.yol
        String t = "      ";
        boolean resault3 = t.replace(" ", "").length() == 0; //burada replace tum space leri siliyor ve
        System.out.println("Sadece space mi var? " + resault3);                    // baska bir karakter olup olmadigi ortaya cikiyor,
                                                                        // baska karakter yokmus, length 0 ve baskabir seyde yok, ozaman true


        // 2.yol
        boolean t4 =t.replace(" ", "").isEmpty();
        System.out.println(t4); //true

        // 3.yol
        // isBlank methodu ,tirnak icinde stringde space olup olmadigini kontrol eder, isi bu.
        // sadece space varsa true verir, space disi karakter varsa false verir
        // isBlank methodu hicbir sey ("") icin de true verir
        boolean result5 = t.isBlank();
        System.out.println("sadece space va rmi ?" + result5); //true

        // E 6 :  bir string 'de "a e i" karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdir
        // " Java is easy to learn"    //ilk gorunum dedigi icin cumledeki ilk a,e,i nin indexi alinir
        String r = "Java is easy to learn"; //14 olur index toplami

        //indexOf() methodu bir karakterin ilk gorunumunun indexini verir. burada a karakterinin indexini veriyor
        int idxA = r.indexOf('a');     //of nin demektir

        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI); // 5 verir

        int idxE = r.indexOf('e');

        System.out.println("Indexler toplami :" + (idxE + idxA + idxI)); //14

        //E 7:  bir string 'de java kelimesinin ilk olarak kacinci indexte kullanildigini gosteren kodu yaziniz
        //  "Ah Java vah Java sensiz olmuyor Java"

        String u = "Ah Java vah Java sensiz olmuyor Java";  //java burada 3. indexle basliyor
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);
        // indexOf("Java")  kullaniminda siz "java" kelimesinin ilk gorunumundeki ilk harfin ( yani J nin ) index ini alirsiniz

        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);  //-1
        // indexOf()  methodu, olmayan karakterler icin kullanilirsa her zaman -1 verir

        // Ex 8:  bir string 'de  " a,i, e" character lerinin son gorunumlerinin index inin toplamini ek ya

        String v = "Java is easy to learn";  // lastIndexOf ,karakterin son index ini alir

        int idxOFA = v.lastIndexOf('a'); //18
        System.out.println(idxOFA);

        int idxOfI = v.lastIndexOf('i'); //5
        System.out.println(idxOfI);

        int idxOfE = v.lastIndexOf('e'); //17
        System.out.println(idxOfE);

        int idxS = v.lastIndexOf('s'); //10
        System.out.println(idxS);

        System.out.println(idxOfE + idxOfI + idxOFA);
        //note lastIndexOf() stringede olmayan bir karakter icin kulanilirsa her zaman -1 verir

        // 9:    bir string 'deki tekrarsiz karakterleri ekrana yazdirin
        //  abbccdc   ==>

        String y = "abbccdc";
        char ch1 = y.charAt(0); //if()burada sart cumlesi parantezin icine yailir,sonuc cumlesi parantezden sonraki suslu parantezin icine yazilir
        if (y.indexOf(ch1) == y.lastIndexOf(ch1)) {
            System.out.println(ch1); // a

        }
        char ch2 = y.charAt(1);
        if (y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2); //burada harf cikmaz
        }


        //note : Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir
        //       bazi kodlari bazi sartlara gore aktiv etmek icin "if statement" kullanilir
        //       if you study hard, you will learn Java

        //10 :
        int num = 12;

        if (num > 0) {
            System.out.println("Pozitif");
        }
        // 11   sayi -1 ile 10 arasindaysa ekrana "rakam" yazdirir
        int number = 3;
        if (number > -1 && number < 10) {
            System.out.println("Rakam");

        }
        // sayi 3 basamakli ise "Wooow" yazdirin ek

        int n = -123;
        n = Math.abs(n);
        if (n > 99 && n < 1000) ;
        System.out.println("Wooow");


    }
}