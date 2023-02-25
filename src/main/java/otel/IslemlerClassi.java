package otel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class IslemlerClassi {



    Scanner input = new Scanner(System.in);
    Map<Integer, String> odalar = new HashMap<>();

    public void anaMenu() {
        int secim= 0;
        do {
            System.out.println("============= YILDIZ OTELE HOSGELDINIZ =============\n" +
                    "\nMusteri arama icin       1 " +
                    "\nMusteri silme icin       2" +
                    "\nMusteri ekleme icin      3" +
                    "\nHesaplama icin           4 " +
                    "\nCikis icin               0 a basiniz");

            musteriDepo();
             secim = input.nextInt();

            switch (secim) {
                case 1:
                    bulma();
                    break;
                case 2:
                    silme();
                    break;
                case 3:
                    ekleme();
                    break;
                case 4:
                    hesap();
                    break;
                case 0:
                    System.out.println("Iyi gunler, tekrar bekleriz");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz");

            }
        }while (secim !=0);

    }
    public void musteriDepo() {
        odalar.put(111, "Ali, Can, 18, erkek");
        odalar.put(121, "Veli, Yilmaz, 30, erkek");
        odalar.put(131, "Ayse, Sari, 20, bayan");
    }

    public void ekleme() {

        System.out.println("Musteri oda numarasi giriniz");
        int odaNo = input.nextInt();
        input.nextLine();
        System.out.println("Musteri adi giriniz");
        String musteriAdi = input.nextLine();
        System.out.println("Musteri soyadi giriniz");
        String musteriSoyadi = input.nextLine();
        System.out.println("Musteri yasi giriniz");
        int yas = input.nextInt();
        input.nextLine();
        System.out.println("Musteri cinsiyeti giriniz");
        String cinsiyet = input.nextLine();
        String eklenecekOlanlar = musteriAdi + ", " + musteriSoyadi + ", " + yas + ", " + cinsiyet;
        odalar.put(odaNo, eklenecekOlanlar);
        System.out.println(odalar);
    }

    public void silme() {
        System.out.println("Oda numarasini giriniz");
        int odaNo = input.nextInt();
        odalar.remove(odaNo);
        System.out.println(odalar);
    }

    public void bulma() {
        input.nextLine();
        System.out.println("Musteri soyadi giriniz");
        String musteriSoyadi = input.nextLine();
        Set<Map.Entry<Integer, String>> odalarSet = odalar.entrySet();
        System.out.println("============= YILDIZ OTELI =============\n" +
                "======SOYISIM ILE MUSTERI ARAMA ========\n" +
                "ODANo     Isim           Soyisim           YAS      CINSIYET");
        for (Map.Entry<Integer, String> w : odalarSet) {
            Integer key = w.getKey();
            String value = w.getValue();
            String arr[] = value.split(", ");
            if (musteriSoyadi.equalsIgnoreCase(arr[1])) {

                System.out.printf("%-8s  %-15s  %-15s  %-4s   %-9s \n", key, arr[0], arr[1],
                        arr[2], arr[3]);
            }
        }
    }

    public void hesap() {
        System.out.println("Hesaplama sayfasina hos geldiniz" +
                "\nKral dairesi icin      1" +
                "\nAile odasi icin        2" +
                "\nTek kisilik oda icin   3" +
                "\nAna menu icin          0 a basinit");

        int tercih = input.nextInt();
         switch (tercih){
             case 1:
                 kraldairesiHesaplama();
                 break;

             case 2:
                 aileodasiHesaplama();
                 break;

             case 3:
                 tekkisilikodaHesaplama();
                 break;
             case 0:
                 System.out.println("Ana menuye yonlendiriliyorsunuz");
                 break;
             default:
                 System.out.println("Hatali giris yaptiniz");
         }
    }

    private void tekkisilikodaHesaplama() {
        int intUcreti = 0;
        System.out.println("Kac gece kaldiniz?");
        int geceSayisi = input.nextInt()*100;
        System.out.println("Internet kullandiniz mi? ");
        boolean internet = input.nextBoolean();
        if(internet){
            intUcreti = 30;
        }else{
            intUcreti = 0;
        }
        System.out.println("Kac defa camasir servisini kullandiniz?");
        int camasirServisi = input.nextInt()*20;
        System.out.println("toplam ucret :" + (geceSayisi + intUcreti + camasirServisi));

    }

    private void aileodasiHesaplama() {
        int intUcreti = 0;
        System.out.println("Kac gece kaldiniz?");
        int geceSayisi = input.nextInt()*200;
        System.out.println("Internet kullandiniz mi? ");
        boolean internet = input.nextBoolean();
        if(internet){
            intUcreti = 50;
        }else{
            intUcreti = 0;
        }
        System.out.println("Kac defa camasir servisini kullandiniz?");
        int camasirServisi = input.nextInt()*20;
        System.out.println("toplam ucret :" + (geceSayisi + intUcreti + camasirServisi));

    }

    private void kraldairesiHesaplama() {

        int intUcreti = 0;
        System.out.println("Kac gece kaldiniz?");
        int geceSayisi = input.nextInt()*500;
        System.out.println("Internet kullandiniz mi? ");
        boolean internet = input.nextBoolean();
        if(internet){
             intUcreti = 100;
        }else{
            intUcreti = 0;
        }
        System.out.println("Kac defa camasir servisini kullandiniz?");
        int camasirServisi = input.nextInt()*50;
        System.out.println("toplam ucret :" + (geceSayisi + intUcreti + camasirServisi));




    }
}
