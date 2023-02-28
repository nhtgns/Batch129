package smallstudy.gun01;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Toplami gormek icin 0 a basiniz");

        int sayi=1;
        int toplam=0;
        int sayac=1;

//        while (sayi!=0){
//            System.out.println("lutfen bir sayi Giriniz");
//            sayi=input.nextInt();
//            toplam+=sayi;
//            sayac++;
//            System.out.println("ara toplam =" + toplam);
//
//        }
//        System.out.println( (sayac-1)   + "  sayi girdiniz  ve  Topplmai : "+ toplam);




        System.out.println();

        do {
            System.out.println("lutfen bir sayi Giriniz");
            sayi=input.nextInt();
            toplam+=sayi;
            sayac++;

        } while (sayi!=0);
        System.out.println( (sayac-1)   + "  sayi girdiniz  ve  Topplmai : "+ toplam);

        int arr[] = { 1, 3, 5 };
        int x = 0;
        for (int w : arr) {
            x = x + w * w;
        }
        System.out.print(x);

        }
    }

