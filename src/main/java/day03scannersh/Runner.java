package day03scannersh;
//bu "Runner Class" eger diger class lari calistirmak icinse adini "Runner " koymak mantikli,cunku calistiri demek  Runner
public class Runner {

    public static void main(String[] args) {

        //Object nasil olusturulur?
        //Hangi Class i kullanacaginizi java ya soylemeniz lazim
        //asagidaki object "Car " classindan olusturuluyor
                                                                    //sifirdan  obje olusturur
        //class ismi        object ismi           atama oporatöru    "new" keyword              Constructor
          Car                myCar                      =             new                         Car(); // object 5 parcadan olusuyor

        //Heyjava! Car classindan myCar isimli yepyeni bir obje olustur Car() constructor ile
    // class in ismi ve parantez construktor u verir
        //Object 'de ne varsa class tan gelir


        System.out.println(myCar.fiyat);//Object(mycar dan) den fiyat model gorunur
        System.out.println(myCar.model);
        myCar.hareket();//object den hareket etme fonksiyonuna ulasabilirsiniz
        myCar.dur(); //hareket ve dur metodu ekrana yazi yazdirabilme kabiliyetine sahip,o yuzden sout un icine yazmaya gerek yok
        //burada üst yapi olusturuyoruz. yoksa her class a main method yazdirmak zorundayiz
        //asagida Student class indan bir object olusturuluyor


        //2. ornek
        Student tomHanks = new Student(); // bu bir object

        System.out.println(tomHanks.name);    // pasif ozellikler
        System.out.println(tomHanks.grade);   // pasif ozellikler
        System.out.println(tomHanks.adresse); // pasif ozellikler

        tomHanks.study();//bu study methodu
        tomHanks.feed();//bu feed methodu

    }
}
