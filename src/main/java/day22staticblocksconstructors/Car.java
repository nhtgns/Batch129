package day22staticblocksconstructors;
   /*
    Constructor nedir?
    Class tan object uretmemize yarayan code block laridir.

    Class olusturdugumuzda java bize otomatik olarak bir "constructor" verir
    ama bu constructor gozle gorunmez

    Java tarafindan verilen constructor lara default "constructor" lar denir

    "default constractor" lar "Car(){}" seklindedir.
    Siz kendi constructor olusturdugunuzda java default olani siler.

    - Bir class ta farkli parametreler kullanarak istediginiz kadar "constructor" olusturabilirsiniz
    - Farkli "constructor" ler sayesinde bir class tan farkli farkli object ler olusturabiliriz
    constructorlarda return type yok. yani void, int vs yok.

    Interview sorusu :  Method ile constructor'in farki varmidir? varsa nedir?
    Cevap:              Method ile constructor farkli yapilardir.
                      i)Method'larda return type vardir ama constructor'larda return type yoktur
                      ii)Method'larin ismi yaptiklari ise gore developer'lar tarafindan belirlenir.
                      Constructor'larin ismi ise her zaman Class ismi ile ayni olmalidir.

 */

public class Car {  //car class i  kalibi acayip esnek bir kalip, cunku ayni  anda honda , mercedes, bmw uretilebiliyor

    String make = "Honda";
    String model = " Accord";
    int year = 2023;
    boolean hybrid = true;

   public Car (String make,String model, int year, boolean hybrid){//constructor
        this.make = make;
        this.model =model;
        this.year = year;
        this.hybrid = hybrid;
    }
    Car (String make,String model){
        this.make = make;
        this.model =model;
        if(year==2023){
            this.year =0;
        }
        if (hybrid==true){
            this.hybrid=false;
        }
    }

     public Car(String make, int year) {  // otomatik geldi constr
         this.make = make;
         this.year = year;
     }

     @Override
    public String toString() { // otomatik geldi, obje leri ekrana yazdirmak icin bu gerekli ,zorunlu
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}

