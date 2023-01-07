package daytime06;

public class Varargs02 {
    //verilen sayilardan ilki haric tum sayilari toplayip ilk sayi ile carpan bir method olusturun
    public static void main(String[] args) {

        int sayi1=5;
        int sayi2=7;
        int sayi3=2;
        int sayi4=4;
        int sayi5=9;

        sonuc(sayi1,sayi2,sayi3,sayi4,sayi5);
    }

    private static void sonuc(int carpilacakSayi, int... toplanacakSayi) {

        int toplam = 0;

        for (int  w: toplanacakSayi){
            toplam += w;
        }
        System.out.println(toplam);//22


        int sonuc =toplam*carpilacakSayi;
        System.out.println("toplam :" + sonuc);//toplam :110
    }
}
