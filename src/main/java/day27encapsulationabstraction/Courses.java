package day27encapsulationabstraction;

public abstract class Courses {
    //body , vucut demek, vucut gidince soyut kalir, yani body si olmayan method ortaya cikar.
    // metodu olmayan child class larin hepsi kullanmak zorundadir.
    // abstrak olunca o ders mecburi olur ve icini doldurursun 6.,7,8.. sinif mufredati ile
    // child lar abs methodu override ederek kullanir
    /*
    1) Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
    Body'si olmayan method'lara "abstract method"lar denir.

    2)"abstract method"'lar child class'lar tarafindan "override" edilmek zorundadırlar.
    Bu yuzden eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseni
     o method'u  abstract yapmak gerekir.

     3) Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
     "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.

     4)"abstract method" lar siradan class'larin(concrete) icine yazilamazlar."abstract method"larin icine yazildiklari
     class'lar da abstract olmak zorundadirlar.


     5)"abstract class" larda hem "abstract method" lar hem de "concrete method" lar kullanilabilir.

     6)"concrete class" lar "abstract class" larin child'i olabilirler.
      "abstract method" larin override edilme zorunlulugu "concrete class" lar icindir.
 */
    public abstract void math(); //zorunlu ders
    //Implement, uygulamak demek

    public void art(){
        System.out.println("Painting...");//secmeli ders oldu
    }
    //final method'lar "override" edilemezler, halbuki "abstract" method'lar override edilmek icin olusturulurlar.
    //Bu celiskidir bu yuzden Java abstract method'larin final olmasina musaade etmez.
    //public final abstract void science();
    // Concrete Class'lar final oldugunda Child Class'a sahip olamazlar
    // Ama "Abstract Class" lar icin Child Class olmalidir,cunku Child Class'lar abstract parent classs'daki abstract method'lari kullanirlar.
    // Bu yuzden Java "Abstract Class"larin "final " olmasina musaade etmez.
    //"abstract method" lar "private" olamazlar cunku Child class'lar "abstract method"lari kullanirlar, private yapinca kullanima kapali olur.
    //Bu celiskidir bu yuzden Java "abstract method"larin "private" olmasina musaade etmez.
    //"abstract method" lar "static" olamazlar, cunku static method'lar override edilemez,
    // halbuki abstract method'lar override edilmek icin olusturulmustur.

}
