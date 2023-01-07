package day22staticblocksconstructors;

public class StaticBlocks01 {

    // Bir variable olusturdugunuzda deger atamazsaniz o variable yi "initialize"(baslatmak, deger atamasi yapmak) etmediniz demektir
    //static variableler static blocklar icinde initialize edilirse , o class in icinde hersey den once hazir hale getirilmis olur
    //bazen main method calistirilmadan once variablelerin hazir hale getirilmesi gerekir bu yuzden static block lar kullanilir
    //main methoda koy her sey sttaic olmali
    //staticblocks : main motor çalıştırılmadan önce variable ları hazır hale getirir
    //static block larin onceligi var her zaman, siralama onemli degil
    //Note1: //Note 1; Static blocklar static variableleri initialize etmek için kullanılırlar.
             //Note 2: Static bloklar class içnide herşeyden önce calıştırılırlar.

    static   double pi;
    static  String shape ;

    static {
        pi = 3.14;
        System.out.println("Static block 1 " + pi);// Static block 1  , once
    }
    static {
        shape = "Circle";
        System.out.println(shape);// sonra
    }

    public static void main(String[] args) { //en son
        System.out.println("main method");

    }//main
}
