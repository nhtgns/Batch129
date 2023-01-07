package day03scannersh;

import java.util.Scanner; //bu ifade sudur. javanin util kutuphanesinden Scanner class ini aldim eve getirdim, ve icindeki datalari alip kullanacagim

public class Scanner01 {
    // Kullanicidan data alip kodlarimizda kullanacagiz
    //class ismi    object ismi   atama oper       new keyword          construcktor
       Scanner        input             =                 new             Scanner(System.in); // bu yazi bir object

    //Objenin ismini input yaptim cunku bu obje kullanicidan  data alip benim kodlarimin icine koyacak,input ;icine koy demek
    //(System.in)bu parantezli ifade su demek==> sistemin icine koy demek.sistemden kastimiz ,javanin sistemibunu "scanner Class" yardimii ile yapar
    /*
    java icinde bir sürü kutuphane kutüphanelerin icnde de bir suru class lar olan dev bir yapidir.
    bu class larin isimleri var Scanner vb. bu scanner, util library nin icinde
    scanner ,kullanicidan data alip kullanmayi saglar


     */
     // Kullanicidan data alip kodlarimizda kullanacagiz
    public static void main(String[] args) {

        // 1.adim scanner classtan obje olustur
        Scanner input   =  new   Scanner(System.in);
        //2,adim kullaniciya ne istediginize dair mesaj veirn

        System.out.println("Lutfen yasinizi giriniz.");
        //3.adim uygun metodu kullanarak kullanicinin verdigi datayi memory e yerlestiriniz

       byte age = input.nextByte();
        System.out.println(age);
    }

}
