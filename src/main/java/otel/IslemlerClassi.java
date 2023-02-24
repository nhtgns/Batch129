package otel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class IslemlerClassi {

    Scanner input = new Scanner(System.in);
     Map<Integer, String> odalar = new HashMap<>();


    public  void musteriDepo() {
        odalar.put(111, "Ali, Can, 18, erkek");
        odalar.put(121, "Veli, Yilmaz, 30, erkek");
        odalar.put(131, "Ayse, Sari, 20, bayan");
    }
    public  void ekleme(){

        System.out.println("Musteri oda numarasi giriniz");
        int odaNo= input.nextInt();
        System.out.println("Musteri adi giriniz");
        String musteriAdi = input.nextLine();
        System.out.println("Musteri soyadi giriniz");
        String musteriSoyadi = input.nextLine();
        System.out.println("Musteri yasi giriniz");
        int yas = input.nextInt();
        System.out.println("Musteri cinsiyeti giriniz");
        String cinsiyet = input.nextLine();
        String eklenecekOlanlar = musteriAdi + ", " + musteriSoyadi+ ", "+ yas+ ", "+ cinsiyet;
        odalar.put(odaNo,eklenecekOlanlar);
    }
    public void silme(){
        System.out.println("Oda numarasini giriniz");
        int odaNo = input.nextInt();
        odalar.remove(odaNo);
    }
    public void bulma(){
        System.out.println("Musteri soyadi giriniz");
        String musteriSoyadi = input.nextLine();
     Set<Map.Entry<Integer,String>> odalarSet = odalar.entrySet();
        System.out.println("============= YILDIZ OTELI =============\n" +
                "======SOYISIM ILE MUSTERI ARAMA ========\n"+
                "ODANo   Isim       Soyisim     YAS    CINSIYET");
        for (Map.Entry<Integer, String> w : odalarSet) {
            Integer key = w.getKey();
            String value = w.getValue();
            String arr [] = value.split(", ");
            if (musteriSoyadi.equalsIgnoreCase(arr[1])){

                System.out.printf("%-8s  %-15s  %-15s  %-4s   %-9s \n" , key,arr[0],arr[1],
                        arr[2],arr[3]);
            }
        }
    }

}
