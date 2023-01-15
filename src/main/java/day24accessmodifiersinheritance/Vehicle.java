package day24accessmodifiersinheritance;

public class Vehicle {  // Vehicle = arac demek, otomobil kamyon vs
    /*
      Note: Child Class'dan bir object olusturdugunuzda constructor'lar en ustteki parent class'dan baslatilarak alta dogru calistirilir.
      -consructorlarin ismi class la ayni olur.. constructor lar yukaridan asagi calisir
      -methodlara object e lerle ulasiriz


     */
    public Vehicle(){                // bu bir constructor, return type i da ustelik, ismi de class la ayni
        System.out.println("Vehicle 1");
    }

}
