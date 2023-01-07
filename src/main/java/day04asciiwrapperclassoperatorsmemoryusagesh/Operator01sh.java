package day04asciiwrapperclassoperatorsmemoryusagesh;

public class Operator01sh {

    public static void main(String[] args) {


        /*

        1) +, - ,* , / islemleri javada matematikte kullanildigi gibi kullanilir
        Note : int / int ==> sonuc int olur
        Note2  double / +  int ==> double olur.
        cunku javada matematiksel islemlerde farkli data type leri kullanilirsa sonuc buyuk data type inde olur,(double)

        2) javada "Logical operator" (mantik operatorleri) lar vardir.

        AND VE OR islemleri "Logical operator" lardir.
        i) AND isleminden true alabilmek icin hersey true olmalidir
          -AND islemi "perfectionist" tir
          -AND isleminde bir tane false sonucu false yapar

          // cay  && (AND)    kahve      sonuc
            +       -         false
            -       +         false
            -       -         false
            +       +         true
          ii)OR isleminde bir tane true ,sonucu true yapmaya yeter
          - OR isleminde sonucun false olmasi icin herseyin false olmasi gerekir
          -or islemi "polyanna" gibidir

           cay   ||(OR)    kahve      sonuc
            +                -        +
            -                +        +
            +                +        +
            -                -        -

            OR = boru anlami var

        iii) "NOT Operatoru (!) " true olani false, false olani true yapar.
                !true  ==> false ( dogru degil)
                !false ==> true
                !!true ==> true

        3) Karsilastirma (comparison) operatorleri
           < , > , <= , >= ,  == ( esittir),    != (esit degildir)  i%2!=0

        Note : karsilastirma operatorlerini kullandiginizda sadece boolean( true, false )alirsiniz
         Note: biz AND islemi icin && kullaniriz ama & tek de olur
               Farklari nedir?
               &&' li  kullanim ilk ifade false oldugunda digerlerini kontrol etmez hizli calisir
               & ' li kullanim ilk ifade ne olursa olsun digerlerini kontrol eder ve yavas calisir
         */
        //sonucu memoryde saklamak istiyorsan boolean a atamalisin sonucu
        boolean first = 3<5;
        boolean second = 2+3 != 5;  // soldaki 5 sagdaki 5 e esit degil, dogru mu?
        boolean third = 2+3*5 >= 19;

        System.out.println(first+ " - " + second + " - " + third);
        System.out.println(first && second );
        System.out.println(first || second || third);

        // Note : tek and isareti & yavas calisir, o yuzden pek kullanilmaz

    }
}
