package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {

        //Ex 1_  verilen bir list teki elemanlari tekrarsiz yazdirin
        //[2,3,2,2,5] ==> [2,3,5]
        List <Integer> myList = new ArrayList<>();

        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List<Integer> newList = new ArrayList<>();
                              //[2,3,2,2,5]
        for (Integer w  : myList) {

            if (!newList.contains(w)) {  // burada newlist in icinde sayilar yoksa ,olmayani yazdir. if in sarti true ise yazdirir

                newList.add(w);// array olmadığı için indeks numarası vs. oluşturmadık.
            }

        }
        System.out.println(newList);


        //Ex 2: musteriden urun ismini aliniz,
        // musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz,
        // urun listede yoksa "Out of Stock"

        Scanner input = new Scanner(System.in);

        System.out.println("urun arama sitemize hosgeldiniz");
        System.out.println("urun aramayi sonlandirmak icin Q ya basiniz");

        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("ipad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");
        /*
        for loop kurunuz , product listindeki herbir elemanin tum characterlerini set method kullarak kucuk harfe ceviriniz
        kullanicidan gelen urun ismini de kucuk harf cevirin

        */
        do{
            System.out.println("aradiginiz urunun ismini giriniz");

            String p = input.nextLine();

            if (p.equalsIgnoreCase("Q")){
                break;
            }else if (products.contains(p)){
                System.out.println(p + " is in stock");

            }else if (!products.contains(p)){
                System.out.println(p + " is out of stock!..");
            }

        }while (true);
        System.out.println("Sitemizi kullandiginiz icin tesekkur eder, tekrar bekleriz");


    }
}
