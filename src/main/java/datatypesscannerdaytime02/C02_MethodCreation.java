package datatypesscannerdaytime02;

import java.util.Scanner;

public class C02_MethodCreation {

    // dikdortgenin alanini hesaplayan methodu olusturunu ve kullaniniz
    public static void main(String[] args) {

        //Protokol. static: sadece kendisi gibi static olanlari alir-
        //sout u otomatik yazdirmak icin 1. parantezden hemen sonra. koyup sout atiklayinca tum yazi sout icine girer.

        System.out.println(dikdortgenAlani(5, 10));


    } //main in body si

    /*

    Access modifier  static    data type   method adi sonrada parante ve icine parametreler yazilir
    Method ismi CamelCase e gore yazilir
     */

    public static int dikdortgenAlani (int a, int b){

        return a*b;
    }
}
