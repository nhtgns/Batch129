package day02datatypesmethodcreation;

public class Variables01 {

    //primitive data types --> char - boolean- byte- short int
    //float: virgullu sayilar icin kullanilir, ondalik sayilar (Decimal Numbers) fiyatlandirmalarda kul 12.99
    //double: virgullu sayilar icin kullanilir, ondalik sayilar (Decimal numbers) ( hucre agirligi ,kuyumcu gibi hassas)

    //Note 1: primitive data type lerini java olusturmustur, biz olusturamayiz
    //Note 2: primitive lerin data type lerinde  her zaman kucuk harf kullanilr
    //Note 3: primitive data lar data type lere gore memory de farkli farkli yer kaplar. memory= ram
    //Note 4: primitive data lar sadece sizin atadiginiz degeri barindirirlar


    public static void main(String[] args) {

        //Ornek 1: gömlek ve ayakkabi fiyatlari icin 2 tane variable olusturup ekrana yadiriniz
        // floau memory de 4 byte yer kaplar, double 8 byte yer kaplar
        float shirtPrice = 12.99F;

        //Note: java ondalik sayilari 8( Decimal Numbers ) otomatik olarak dooble kabul eder. siz data type' ini float yazarsaniz hata verir.
        //float olmasinda israr ediyorsaniz sonuna "F, f" koymaliisniz

        float shoesPrice = 15.89F;


        //Sytem.out.println() ekrana yazdirir ve pointer i bir sonraki satira atar

        //Sytem.out.print() ekrana yazdirir ve pointer i ayni satirda tutar
                System.out.println(shirtPrice + shoesPrice);

                //Sytem .out.println yazdirmanin kisa yolu ==> sout yaz ve enter a bas
        System.out.println();


    //Ornek 2: hucre agirligi ve amip' in agirligi icin 2 tane variabel olusturun v eagirliklari farkini eekrane yazdir

        double weightCell = 0.000000000000112;
        double weightAmip = 0.000000000000023;
        System.out.println(weightCell - weightAmip);//8.9E ==> "8.9 carpi 10 uzeri -14"  "E ==> Exponenet
    //
        double hucreninAgirligi = 0.0000000000000000112;
        double amipAgirligi =     0.0000000000000000034;

        System.out.println(hucreninAgirligi - amipAgirligi );
    }
}
