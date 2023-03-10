package day30exceptionsinterface;

public interface Ac {
    //interface'lerin icine "concrete" method konulamaz, cunku "concrete" method'larda
    //body vardir ve body o method'un isi nasil yapacagini belirtir. Isin nasil yapilacagi
    //bir cok detay icerir ve bu Child Class'larda kafa karisikligina sebep olur.
    //Halbuki sadece yapilmasi gereken isi soyleyip nasil yapilacagini Child'a birakirsaniz
    //Child Class'in kafa karisikligini engellemis olursunuz.
    //interface'ler "concrete" method iceremezler, dolayisiyla interface'in icindeki hicbirsey istege
    //bagli degildir, hersey Child Class'lar icin mecburidir. Bu yuzden interface'lere
    //"to-do list" de denir.

    //interface'lerdeki tum method'lar otomatik olarak "public"dir, "abstract"dir, "static" tir

    //interface'lerdeki variabler otomatik olarak "public" dir, "static" dir, "final" dir.
    //static ne demek, olusturulan methoda ulasmak icin object olusturmaya gerek yok, class ismiyle ulasilir
    //return type i olmak zorundadir bir methodun. void, int gibi

    void cool(); // interface lerin icine concret metod koyulmaz. method body si bostur


   // coklu isteklere java musaade etmez, ye, ic uyu gibi olmali.
    void run();

    int price =2000; // interface icindeki tum variable lar static, publi ve final dir, final inizialeiz edilmek zorunda


}
