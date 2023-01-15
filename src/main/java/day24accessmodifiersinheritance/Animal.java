package day24accessmodifiersinheritance;

public class Animal {
  /*  Interiw sorusu

  Inheritance'in faydalari;
            1) Code standardında tekrar iyi değildir.
            2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
            3) Gelişime update'e açık olmalıdır
            4) Code atomic yapıda olmalı.

    Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
    Note 2:  Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
    Note 3:  "public methodlar", "child class" lar tarafindan kullanilabilir
             "child class" lar tarafindan kullanilabilir, demek "inherit edilebilir" demek
    Note 4:  "protected" method'lar "inherit edilebilir".
              Cunku "protected" olan method ve variable'lar child'lar tarafindan kullanilir.
    Note 5:  "default" method'lar object ile ayni package'de olduklari surece "inherit edilebilir".
              Ama default method ile object'in uretildigi class farkli package'lerde ise inherit edilemezler
    Note 6:  "private" method'lar "inherit edilemezler".
    Note 7:  Java "birden fazla parent"i (birden fazla emir veren var ayni anda)(multiple inheritance ) desteklemez, onaylamaz.
    Note 8:  Child --> Parent --> Grand Parent --> Grand Grand Parent ... seklinde ilerleyen inheritance'lara "Multi Level Inheritance" denir.
    Note 9:  Java'da "Object Class" tum Java Class'larinin ortak parent'idir.
    Note 10: Java'da Object Class haric tum class'larin parent'i vardir.
    note 11: Java da parent dan child a olan iliskilere HAS a Relationship denir
             Java da child da parent e olan ilskilere IS A Relationship denir
    Note 12: Javada her classın bir tane default constructor'u vardır.
             Bu default Constructor class'ın içinde görünmez. Çünkü default constructor "Object Class' icindedir
             Bizim class'ımız default constructora ihtiyac duyduğunda, parent olan "Object Class"a gider ve oradaki constructır'ı kullanır.


        bu animal class i ,ortak ozellikleri  kapsayan bir class, kolaylik saglar, esasinda Animal class bir parent class tir(baba)
        alt class lara Chil class ya da sub class denir, sub == alt demek.
        extends baba cocuk ilskisini saglayan kelime

        butun data type leri class tir ayni zamanda, int degil ama Integer wrapper class tir usw.
        --asagidan yukari giderken her zaman IS -A kalibi kullanilir
        Mammal is a Animal
        Cat is a mammal
        Cat is a Animal.  burada IS A Relationship, iliskisi vardir

        --yukaridan asagi giderken her zaman HAS A kalibi kullanilir. Has a Relationship. has == sahip demek
        Animal Has A mammal
        Mammal has a Cat
        Animal has a Cat
    */


    public void eat() {
        System.out.println("Animals eat...");
    }

    public void drink() {
        System.out.println("Animals drink...");
    }


}
