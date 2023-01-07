package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        //Ex 1: Kullanici ile beraber "bir Array" olusturun.

        //1. kullanıcıdan girilecek veri sayısını iste bu arrayın eleman sayısı olacak
        //2. kullanıcının çıkış yapmasına olanak tanı
        //3. kullanıcıya öğrenci girişini başlat.

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz"); // array de kac eleeman koyacagini onceden belirle
        int numOfElements = input.nextInt();

        System.out.println("girisi sonlandirmak icin Q tusuna basiniz");//her dafasinda gormek istemedigimiz icin bu satiri loop un disina tasidik
        String stdNamesArray [] = new String[numOfElements];

        for (int i = 1; i <= numOfElements;  i++){

            System.out.println("Lutfen" + i + ". ogrencinin adini giriniz"); // 1. 2. ,,,diye yazdirir
            String stdName = input.next();

            if ( stdName.equalsIgnoreCase("Q")){
                break;
            }

            stdNamesArray[i-1] = stdName;

        }
        System.out.println(Arrays.toString(stdNamesArray));
    }
}
