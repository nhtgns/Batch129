package day26overriding;

public class Animal {
   /*
  1)Parent Class'da ki method'u Child Class icinde ozellestirerek kullanmaya "Overriding" yapmak denir.
  2)Overriding'de method'un parantezine,method'un ismine dokunulmaz, method'un body'si degistirilir.
  3)@Override ==> Override Annotation: Override kurallarinin Java tarafindan kontrol edilmesini saglar.
  4)Overriding'de Parent Class'daki method'a "Overridden Method" denir, Child Class'daki method'a ise "Overriding Method" denir.
  5)"private" method'lar "override" edilemezler.
  6)Child Class'daki override edilmis method(Overriding Method)'un access modifier'i,  Parent Class'daki override
    edilmis method(Overridden Method)'un access modifier'indan dar olamaz.
    Overridden Method ==> protected ise Overriding Method ==> protected + public
    Overridden Method ==> default ise Overriding Method ==> default + protected + public
    Overridden Method ==> private ise Overriding Method ==> override olmaz ki access modifier'i olsun. Look 5th.
  7)Child Class'da override edilen method'un(Overriding Method) return type'i method'un return ettigi data type'inin
     aynisi veya o data type'inin parent'i olarak secilir.

  8)Method'un return type'i "primitive" ise, Overriding yaparken return type degistirilemez.
    primitive'ler arasinda parent-child iliskisi olmadigindan parent'dan secmek
    mevzu olamaz. O zaman tek secenek aynisi olmalidir
  9)Method'un return type'i "Wrapper Class" ise, Overriding yaparken return type degistirilemez.
    Cunku; return type ya ayni olur veya parent'dan secilir,
    ama Java bir wrapper class'i digerinin parent'i yapmadigindan parent'dan secme ihtimali yoktur,
    geriye sadece aynisi olma ihtimali kalir.
  10)Method'un return type'i "void" ise Overriding yaparken return type degistirilemez.
   --- inheritance yoksa overriding den bahsedilemez
  11) Final kelimesini "Variable"larda kullanabilirsiniz.
                    ->final variable ise
                    i) mutlaka değer atanmalıdır
                    ii) ilk atanan değer değiştirilemez

 12)Final kelimesini "Method" larda kullanabilirsiniz.
                     ->method final ise;
                      i)methodun body'si değiştirilemez
                      ii)method body'si değiştirilemeyince override yapmak mümkün olmaz

 13)Final kelimesini "Class"larda kullanabilirsiniz.
                     ->class final ise;
                       i)o class'ın child'ı olamaz
                       14) "final" method'lar ve "static" method'lar "override"  edilemezler.
        15)"Override" yapabilmek icin "Inheritance" sarttir. Baska bir ifadeyle; Parent-Child iliskisi sarttir.
        16) Method Overloading "Compile Time Polymorphism" dir, Method Overriding "Run Time Polymorphism" dir.
        17) Method Overloading "static Polymorphism" dir, Method Overriding "dynamic Polymorphism" dir.



   OOP Principals:
      i)Inheritance +
      ii)Polymorphism: Method Overloading + Method Overriding
      iii)Encapsulation -
     iv)Abstraction -

     1) Final kelimesini Variable'larda kullanabilirsiniz.
     2)Final kelimesini Method'larda kullanabilirsiniz.
     3)Final kelimesini Class'larda kullanabilirsiniz.
       :beten::beten::hautton-2:



 */
    //methodlar uzerindeki islemlerdir ovlod  ve overrid

    public  void  eat (){ // Parent teki override edilmis eat() methoduna "Overridden method" denir
        System.out.println("Animals eat..");
    }
    public  void  drink (){
        System.out.println("Animals drink..");
    }
    public Animal create (){
        return  new Animal();
    }
    public int add (int a, int b){
        return a+b;
    }
    public Integer multiply(int a,int b){
        return a*b;
    }
}
