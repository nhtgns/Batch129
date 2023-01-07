package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        //EX 1: Integer bir List olusturunuz sonra da liste 5 tane eleman ekleyiniz sonra da bu elemanlardan 12  yi siliniz.

        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);


        //note: siz javada tam sayi 12 yazdiginizda java o tamsayinin data type ini" primintive int "kabul eder
        //buyüzden remove () icine yazdiginiz tam sayi eleman olarak degil, index olarak kabul edilir
        //tam sayiyi eleman olarak gostermenin birkac yolu vardir

        //1.yol
        //Integer nonPrimitive = 12; //remove sadece ilk gorunumu siler.
        //ages.remove(nonPrimitive);
        //System.out.println(ages);//[10, 25, 8, 12]

        //  2.yol bu, tavsiye edilir
        ages.remove((Integer) 12); //burada  primitive den non primitive yani wrapper class a donusuyor 12.
        System.out.println(ages); //[10, 25, 8, 12]

       //3.yol
      //  ages.remove(Integer.valueOf(12));// 12 yi wrapper class a cevirdi, artik 12 javanin gozunde eleman oldu, index degil
      //  System.out.println(ages);

        //4.yol
       // ages.remove(ages.indexOf(12)); //12 nin ilk gorunumunu verir. index ini verir. burada 2 method kullanildi
       // System.out.println(ages);

        //EX 1: Integer bir List olusturunuz sonra da liste 5 tane eleman ekeleyiniz sonra da bu elemanlardan tum 12  yi siliniz.
        // note: removeAll() list ile calisir. bu method bir veya birden fazla gorunumlerini siler
        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(12);
        nums.add(8);
        nums.add(12);
        nums.add(20);

        List<Integer> silinecekler = new ArrayList<>();//silmek icin once yeni bir list olusturduk, silinecekler adi altinda

        silinecekler.add(12);
        silinecekler.add(20);

        nums.removeAll(silinecekler);
        System.out.println(nums); //[10, 20, 8]

        //Note: bir elemanin tumgorunumlerini silmek istiyorsaniz removeAll methodunu kullanin
        //Remove met List ile calisir

    }
}
