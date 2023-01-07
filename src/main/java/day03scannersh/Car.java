package day03scannersh;

public class Car {

    //variables olsturalim
    public String model = "Corolla"; //pasif ozellikler
    public int fiyat = 20000;

    //method olusturalim "2tane asagida var"
    // aktif ozellik
    // return type "void" ise method icinde "return " kelimsi kullanilmaz
    public void hareket(){

        System.out.println("Corolla hizli hareket eder..");
    }
    public void dur (){

        System.out.println("Corolla guvenli bir sekilde durur..");
    }
}
