package lambdaintstream;

import java.util.stream.IntStream;

public class Lambda04 {

    public static void main(String[] args) {
        System.out.println(birdenXeKadar(10)); //55
        System.out.println("\n.................");
        System.out.println(birdenXeKadarTekSayilariTopla(10)); //25
        System.out.println("\n.................");
        System.out.println(birdenSonsuzaKadarGidenTekSayilardanIlkXtanesiniTopla(3));  //9  ilk uc elemanin toplami
        System.out.println("\n.................");
        System.out.println(ikidenSonsuzaKadarGidenSaytop(10)); //110
        System.out.println("\n.................");
        System.out.println(bestenSonsuzaKadarIlkUcKuvTop(3));  //155
        System.out.println("\n.................");
    }
    //SORU1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.
    public static int birdenXeKadar(int x){
        int sonuc = IntStream.range(1,x+1).sum();

        return sonuc;
    }
    //SORU2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)
    public static int birdenXeKadarTekSayilariTopla(int x){
      int sonuc =  IntStream.rangeClosed(1,x).filter(t->t%2!=0).sum();
        return sonuc;
    }
    //SORU3: 1'den sonsuza kadar giden Tek sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız

    public static int birdenSonsuzaKadarGidenTekSayilardanIlkXtanesiniTopla(int x){
     int sonuc =    IntStream.iterate(1,t->t+2).limit(x).sum();
        return sonuc;
    }
    //SORU4: 2'den sonsuza kadar giden Çift sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static int ikidenSonsuzaKadarGidenSaytop (int x){
                                //artisdegeri
    int sonuc=    IntStream.iterate(2,t->t+2).limit(x).sum();
        return sonuc;
    }
//SORU5: 5'den sonsuza kadar giden kuvvetlerinden
    // ilk x kuvvetinin toplamını return ederek yazdırınız
    public static int bestenSonsuzaKadarIlkUcKuvTop (int x){
     int sonuc =    IntStream.iterate(5,t->t*5).limit(x).sum();

     return sonuc;
    }












}
