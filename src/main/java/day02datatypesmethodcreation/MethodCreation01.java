package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*

        Java da method nasil olusturulur?

        1) main method un disinda olusturulur.
        2) access modifier ( yazilir) + return type (yazilir) * method Ismi * () +{]

        olusturulan metodlar nasil kullanilir
        1) main methodun icinden kullanilir
        2)method un ismini + () yazin
        3)Islem yapacaginiz sayilari parantez icine koyun
     */
    public static void main(String[] args) {

        int sonuc = add(3, 5);

        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firstTwoMultiplyThirdAdd(2, 5, 8);
        System.out.println(ucluSonuc);

        double kup = getCube(5);
        System.out.println(kup);

        long alan = dikDortgeninAlani(4, 6);
        System.out.println(alan);

        long cevre = dikDortgeninCevresi(4, 6);

        System.out.println(cevre);

        double daireCevresi = daireninCevresi(5);
        System.out.println(daireCevresi);

        double daireAlani = daireninAlani(4);
        System.out.println(daireAlani);

        int dörtSayiToplami = sayilarinToplami(3, 6, 7, 8 );
        System.out.println(dörtSayiToplami);

        int carpiminSonucu = ucluCarpim(3, 6, 8);
        System.out.println(carpiminSonucu);

        long alansonucu = toplamAlan(5, 7);
        System.out.println(alansonucu);

        float genelSayilar = toplamaIslemi(3, 6, 7);
        System.out.println(genelSayilar);

        double carpimSonucu= multiply(3.3, 6.6, 7.6);
        System.out.println(carpimSonucu);

        int ucgenIcAcilariTolami = ucgenIcAcilariTolami (55, 65 , 60);
        System.out.println(ucgenIcAcilariTolami);

        int gomlekFiyati = cikarmaIslemi (6, 5);
        System.out.println("gomlekFiyati : " + gomlekFiyati );

        double ceketFiyati = islem (4.5);
        System.out.println("ceketFiyati : " + ceketFiyati);

        double firsatindirimi = ikiIslem(5.9, 4.7);
        System.out.println("firsatindirimi : " + firsatindirimi);


    }

    public static int add(int a, int b) {

        return(a + b);
    }

    protected static long multiply(int a, int b) {

               return a * b;
    }

    // ornek 1) verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan methodu olusturunuz ve kullaniniz.
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {

         return a * b + c;
    }

    // ornek 2: verilen bir ondalik sayinin küpünu hesplayan metodu olusturup kullaniniz.
    //note, access modifoer, "default" yapilacaksa access modifier i yazilmaz.

    static double getCube(double a) {

        return a * a * a;
    }

    // 1 ödev dikdortgenin alanini hesaplayan metodu olusturunuz ve kullaniniz
    // 2 ödev dikdortgenin cevresini hesaplayan metodu olusturunuz ve kullaniniz
    // 3 ödev dairenin cevresini hesaplayan metodu olusturunu ve kullaniniz
    //  4 ödev dairenin alanini hesaplayan metodu olusturunu ve kullaniniz
    //odev 1
    private static int dikDortgeninAlani(int a, int b) {
        return a * b;
    }
     // ödev 2
    private static int dikDortgeninCevresi(int a, int b) {

        return (a + b) * 2 ;

        //ödev 3
    }
    private static double daireninCevresi(double r) {
        return 2*3.14*r;

        //odev 4
    }
    public static double daireninAlani(double r) {
        return 3.14*r*r;
        //privat
    }
    public static int sayilarinToplami(int a, int b, int c, int d) {

        return a+b+c+d;
    }
    public static int ucluCarpim(int a, int b, int c){
        return a*b*c;
    }
    private static long toplamAlan(int a, int b){

        return a*b;

    }
    private static float toplamaIslemi ( float a, float b, float c) {
        return a+b+c;
    }

    public static double multiply (double a, double b, double c){

        return a*b*c;
    }
    public static int ucgenIcAcilariTolami ( int a,  int b,  int c) {

        return a+b+c;
    }

    public static   int cikarmaIslemi (int a, int b){
        return a-b;

    }
    private static double islem (double a){
        return a;
    }
    protected static double ikiIslem (double a, double b ){
        return a*b;
    }



}
