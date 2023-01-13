package day25inheritiance;

public class Vehicle {
    /*
        1)Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
          parent class'dan baslatilarak alta dogru calistirilir.
        2)Child Class'daki constractor'dan Parent Class'daki constractor'a gidebilmek icin "super()" kullanilir.
        3)Parent Class' da birden fazla constractor varsa istenilen constractor, super() ifadesinin parantezi icine yazilan
          parametreler yardimi ile secilebilir.
        4)Ayni class icindeki constructor'lari secmek icin "this()" kullanilir.
          Ayni Class'da birden fazla constructor varsa istenilen constructor,"this()" ifadesinin icine yazilan
         parametreler yardimi ile secilebilir.
         5)"super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir.
       Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
    6)"super()" ve "this()" ifadeleri constructor icinde her zaman ilk satirda olmalidir.
      7)Bir constructor'in icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir. Bakiniz 6.kural..
      9) Inheritance'da Object kullanarak variable cagirirsanizi, Object'in data tipini temsil eden class'dan variable'i
      aramaya baslayiniz. O class da yoksa parent'lara bakiniz
     10) Inheritace'da Object kullanarak method cagirirsaniz Object'in constructor'ini temsil eden class'dan methodu aramaya baslayiniz
       o class'da yoksa parent'lara bakiniz.

       OOP Pricipals:
      i)Inheritance +
      ii)Polymorphism -
      iii)Encapsulation -
      iv)Abstraction -



      --Method cagirirken constructora bakilir.
      Methodu'i ararken belirtilen constructordan aramaya baslayip bulanan kadar super'a dogru gideriz.
     --Variable cagirirken data type'a bakilir.
    Variable'i ararken data typedaki classtan aramaya baslayip bulanan kadar super'a dogru gideriz.


     */
    public  int price = 12000;
    public  void engine (){

        System.out.println("Vehicle engine");
    }
    public Vehicle(){
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price){
        System.out.println("Vehicle 2: " + price);
    }
}
