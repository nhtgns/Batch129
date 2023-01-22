package day29exceptions;

public class Exceptions02 {
    public static void main(String[] args) throws IllegalArgumentException,ArithmeticException {
        // public static void main(String[] args)  throws IllegalArgumentException{ boyle de olur.
        // buradaki "throws", throws tan sonra 2. bir hata exception da yazilabilir

         /* interviw sorusu
        "throw" ile "throws" keyword'leri arasindaki fark nedir?
        1)"throw" method body'si icinde, "throws" ise method paranetzinden hemen sonra kullanilir.
        2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir,
          "throws" ise method paranetzinden hemen sonra sadece bir kere kullanilabilir.
        3)"throw" dan sonra "new" keyword ve "constructor" kullanilarak object olusturulur.
          "throws" dan sonra sadece Exception Class ismi yazilir
        4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra durdurur.
     */

        try {                      //try catch cozum uretir, yol yardimi gibi...
            printAge(-56);         //burada try catch kullanilmazsa ya app donar ya da baska islemler yapmaya devam eder ki bunu istemeyiz
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());

        }
        //bazen biz kendi olusturdugumuz methodda exceptions atariz,
        // sonra o methodu kullanirken o exceptions u handel etmemiz gerekir,yoksa negati sayilarda eplication donar,
        // donmasini istemiyorssak bir mesaj verip calismasini saglayabiliriz

       try{                          //try catch burada hic yazilmadan direkt main methodicinde de throw yazilip app durdurulabilir sart olusursa
           getMark(-25);
       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }


    }
    // "throw" keyword bir methodun bods i icinde istedigimiz yerde,istedigimiz kadar,istedigimiz kosulda exceptions atmamizi saglar
    //"throw" keyword yazildiktan sonra bir "Exception Class object" i olusturulur
    //Exceptions Class constructor inin parantezi icine istediginiz Exception mesajini yazabilirsiniz
    public static  void printAge (int age){
        if(age < 0 ){
            throw new IllegalArgumentException("Age cannot be negative");//"kuraldisi sayiargument hatasi" aldik.
                                                                         // throw new IllegalArgumentException()bunu biz dusunup yazdik
        }else {
            System.out.println(age);
        }

    }
    // ogrenci notlari girisi yapan ve notu consola yazdiran bir method olus
    public static void getMark (double d){
        if (d<0){
            throw new IllegalArgumentException("Marks cannot be less than zero");//bu throw ile app i durduruyoruz,
                                                                                 // yukarida try catch yazarak hatayi isleme almadan digerlerine gec diyoruz
        }else if (d>100){
            throw new IllegalArgumentException("Marks cannot be greater than hundred"); // bu throw lu exception ,yoldaki bariyer gibidir
        }else
        System.out.println(d);
    }
}
