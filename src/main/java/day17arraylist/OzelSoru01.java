package day17arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OzelSoru01 {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner input= new Scanner(System.in);

        ArrayList<Integer> ogrenciNotlari = new ArrayList<>();
        int toplam = 0;
        int ortalama;
        int index = 1;
        String sayi;

        System.out.println("ogrencilerin notlarini giriniz ve cik mak icin q ya basiniz");
        int counter =0;

        do {
            System.out.println(index + ". ogrencinin notunu giriniz");
             sayi = input.next();

             if( sayi.equalsIgnoreCase("q")){
                 break;
             }else {
                 ogrenciNotlari.add(Integer.valueOf(sayi));
                 index++;
             }
        }while (true);
        System.out.println(ogrenciNotlari);
        for (Integer w: ogrenciNotlari) {
            toplam = toplam+w;

        }
        ortalama = toplam/ogrenciNotlari.size();
        for (Integer w : ogrenciNotlari) {
            if (w>ortalama){
                counter++;
            }

        }
        System.out.println("sinifin ortalamasi=" + ortalama + "   ortalamayi gecen ogrenci sayisi:" + counter);


    }//Main
    }

