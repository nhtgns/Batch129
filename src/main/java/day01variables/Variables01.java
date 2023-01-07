package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variables olusturmak
        //Data type yaziniz
        //Java cumlesi = statement
        //Java`da esittir demek "==". Yani Matematik' de "=", Java'da "=="
        //Java' da " = " "assigment operator" dir. Sagdaki degeri alir soldaki kutuya koyar
        //Access modifier yazmazsaniz "access modifier " "default" demektir.
        //data Type +Varaible name ==> variable Declaration
        //Assigment operator  Atama operatoru)  + Variable degeri ==>Assigment
        //Eger Variable DEclaration yapar,assigment  yapmazsaniz java kendi degerlerini (default) yapar.
        //Deffault degerler sayilar icin sifirdir.
        //data type 'ini yaziniz    Variable ismini yaziniz    Assigment Operator ( Atama motoru)    Variable degeri Ingilizcedeki nokta gibi
                      int                                 age                      =                                  13;
        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //String' lere verilen degerler cift tirnak icinde olmalidir.
        //String' ler icin " default value "   "null" dir.
        String studentName = "Ali Can";

        /*
          //Java' da temelde iki tip data vardir;
          1) primitive data type :
             char: tek karakterler icin kuullanilir . A,e,x,?,5
             boolean: boolean' lar sadece iki tip deger alabilir ; true (dogru), false ( yanlis)
             byte: -128 den +127 e kadar tam sayi degerleri icin kullanilir (1 byte)
             short: -32768 ile 32767 arasindaki tam sayilar icin kullanilir ( 2byte)
             int: -2, 147, 483, 648 ile 2,147,483,647 arasindaki sayilar icindir (4 byte)
             long: -9,223,372,036,854,775,808 ile 9,223, 372,036,854,775,807 arasindaki sayilar icindir. ( 8byte)
             float:
             double:


             2)non primitive data type

         */
        //Ornek 2: char data  type' inde ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        //Note: char data type' inde degerler tek tirnak icinde kunulmalidir.
        char isminIlkHarf = 'A';

        //Ornek 3: boolen data type' inde emeklimisin icin bir variable olusturun ve false degerini atayin.
        boolean emeklimisin = false;

        //Ornek 4: byte data type' inde ogrenci yasi icin bir variable olusturunuz ve deger atayin.
        byte studentAge = 23;

        //Ornek 5: Site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 1200;

        //Ornek 6: Ulke nufuslari icin bir variable olusturup deger atamasi yapiniz
        int countryPopulation = 1864184648;

        //Ornek 7: insan vucudundaki hucre siyisi icin bir variable atamasi olusturp deger atamasi yapiniz.
        //Note: Bir deger long ise sonuna "L"  (tercih edilir) veya "l" konur.
        long cellNumberInHumanBody = 87654321356788L;

        //Eger long' a atadiginiz deger int ' lerin araliginda ise sonuna " L " koymaya gerek yok
        long weightOfSun = 1234567;


    }
}
