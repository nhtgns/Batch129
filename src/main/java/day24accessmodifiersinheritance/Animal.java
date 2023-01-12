package day24accessmodifiersinheritance;

public class Animal {
  /*  Interiw sorusu

  Inheritance'in faydalari;
            1) Code standardında tekrar iyi değildir.
            2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
            3) Gelişime update'e açık olmalıdır
            4) Code atomic yapıda olmalı.
    Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
    Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
    Note 4: "protected" method'lar "inherit edilebilir".
                Cunku "protected" olan method ve variable'lar child'lar tarafindan kullanilir.
    Note 5:  "default" method'lar object'in uretildigi class ile ayni package'de olduklari surece "inherit edilebilir".
                Ama default method ile object'in uretildigi class farkli package'lerde ise inherit edilemezler
               Note 6: "private" method'lar "inherit edilemezler".
Note 7: Java "birden fazla parent"i(multiple inheritance Java tarafindan desteklenmez) onaylamaz.
Note 8: Child --> Parent --> Grand Parent --> Grand Grand Parent ... seklinde ilerleyen inheritance'lara "Multi Level Inheritance" denir.
Note 9: Java'da "Object Class" tum Java Class'larinin ortak parent'idir.
Note 10: Java'da Object Class haric tum class'larin parent'i vardir.
Note 12: Javada her classın bir tane default constructor'u vardır.
Bu default Constructor class'ın içinde görünmez. Çünkü default constructor "Object Class'tadıri
Bizim class'ımız default constructora ihtiyac duyduğunda parent olan "Object Class"a gider ve oradaki constructır'ı kullanır.

    */



    protected   void eat (){
        System.out.println("Animals eat...");
    }
    public void drink (){
        System.out.println("Animals eat...");
    }


}
