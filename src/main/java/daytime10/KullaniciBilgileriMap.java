package daytime10;

import java.util.HashMap;
import java.util.Scanner;

public class KullaniciBilgileriMap {
    /*
      1- Kullanıcıdan bir kişinin kimlik numarasını(4 haneli),
        tam ismini, adresini , telefonunu alın.
     2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
     3- Kimlik numarasını girerek kullanıcının bilgilerini ekrana yazdırın
     4- Tüm kullanicilarin isimlerini ekrana yazdıralım
*/
    public static void main(String[] args) {

        String secim="";
        Scanner input = new Scanner(System.in);
        HashMap<Integer, HashMap<String,String>> kisiListesi = new HashMap<>();
        //       key       values


        do {
            HashMap<String, String> kisiBilgileri = new HashMap<>();
            System.out.println("Lutfen ad ve soyadinizi giriniz");
            kisiBilgileri.put("TamIsim",input.nextLine());
            System.out.println("Lutfen adresinizi giriniz");
            kisiBilgileri.put("adres",input.nextLine());
            System.out.println("Lutfen telefon numaranizi giriniz");
            kisiBilgileri.put("Telefon no ",input.nextLine());


            System.out.println("Lutfen kimlik numaranizi giriniz");
            kisiListesi.put(input.nextInt(),kisiBilgileri );

            System.out.println("kisiBilgileri "+kisiBilgileri);
            System.out.println("kisiListesi "+kisiListesi);
            System.out.println("Devam etmek istiyormusunuz E/H");
            secim= input.next();
            input.nextLine(); // bu satira dummy denir. dongunun devam edip satir atlamamasi icin


        }while (secim.equalsIgnoreCase("E"));

        System.out.println("Lutfen aradiginiz kisinin TC numarasini giriniz");
        System.out.println(kisiListesi.get(input.nextInt()));


    }
}
