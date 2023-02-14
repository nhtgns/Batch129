package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {

        List <Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);
        System.out.println(getSumOfAllElements(myList));        //60
        System.out.println(getsumFromsevenToseventy());         //2464
        System.out.println(getMultiplicationFromThreeToNine1()); //7181440
        System.out.println(getFactorial(5));                  //120
        System.out.println(getSumOfEvensBetweenTwoInt(15, 4)); //36
        System.out.println(getSumOfEvensBetweenTwoInt(12, 18));
        System.out.println(getSumOfDigitsBetweenTwoInts(120, 18));

    }
    // Ex 1: verilen list teki tum sayilarin toplamini veren methodu olusturunuz
    //elemanlari toplayip,carpip tek bir sonuc eleman ortaya cikacaksa reduce() methodu kullanilir
    //reduce () methodunda baslangic degeri kullanilmayinca sonuc abschinel integer verir. o yuzden sonda get() methodu kullanilir

    public static int getSumOfAllElements (List <Integer> myList){
        return     myList.stream().reduce(Math::addExact).get();

    }

    //Ex 2 : 7 den 70 e kadar tum tam sayilarin toplamini veren kodu yaziniz.
    //bize list verilmezse IntStream() methoduyla baslangic ve bitis degerleri alinabiliyor

    public static int getsumFromsevenToseventy (){
        return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
    }

   //3:  Ex 3 ten 9 a kadar tum tam sayilarin carpimini veren kodu yaziniz

    //Note: Her zaman bize verilen list ile islem yapamayabiliriz
//      Bunun icin IntStream methodunu kullaniriz.
//      rangeClosed(startInclusive, endInclusive) methodu bize
//      baslangıc ve bitis degeri kapsayan degiskenlerle islem yapmamızı saglar

   public static int getMultiplicationFromThreeToNine1 (){  //ranceClosed() methodu sayilarin sinirini belirler
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
       //Integer class'i Math class'i kadar zengin degil ornegin multiply method'u yok, o yuzden genellikle Math class'in method'larini kullaniyoruz.

   }
    public static int getMultiplicationFromThreeToNine2 (){  //ranceClosed() methodu sayilarin sinirini belirler
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();

    }
    // Ex 4: size verilen sayinin faktoriyel ini hesaplayan kodu yaziniz
    public static int getFactorial (int x){

        if (x == 0){
            return 1;
        }else if (x <0 ){
            System.out.println("Negativ sayilarla faktorial yapilamaz");
            return -1;
        }else {
            return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
        }


    }
    // 5 : Size verilen iki tam sayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz
    public static int getSumOfEvensBetweenTwoInt (int a, int b){

        if ( a >b ){
            int temp = a;
             a = b;
             b = temp;
        }

        return IntStream.range(a+1, b).filter(Utils::isNumberEven).sum();
    }
    //** 6 : Size verilen 2 tamsayi arasindaki tum tamsayilarin rakamlari toplamini veren kodu yaziniz
    // 12 ve 18 verildi.  13,14,15,16,17 ==>  4 + 5+ 6+ 7+ 8 ==30
    public static int getSumOfDigitsBetweenTwoInts (int a, int b){

        if ( a >b ){
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream.range(a+1 , b).map(Utils::getSumOfDigits).sum();
        //range() methodu burada 1. elemani aliyor, 2. elemani almiyor
        //map() met  elemanlari degistirir ve tek tek elalir
    }

    }
