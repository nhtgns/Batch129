package day19listsvarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lists03 {
    public static void main(String[] args) {
        /*
                SAYI TAHMIN OYUNU
    Oyuncudan 1-10 arasi bir sayi isteyiniz
    Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
    Yoksa verdigi sayiyi listenize ekleyiniz. bu cumle nedeniyle aslist ile list olusturulamaz
    Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
    [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
    [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
    [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Oyunumuza hos geldiniz");
        System.out.println("Oyunu sonlandirmak icin Q ya basiniz");


        //Arrays.asList ile list olusturulabilir ama listlerdeki eleman sayiysini degistiren remove gibi method lar burada kullanilamaz
        //dolayisiyla bu sorunun cozumunde ihtiyaciniz olan Listi Arrays.asList() kullanarak olusturmamaliyiz
        List<String> numList = new ArrayList<>();//burada list e benzeyen arraydir.burada eleman sayisini degistiren methotlar kullanilmaz
        numList.add("5");
        numList.add("8");
        numList.add("2");
        numList.add("9");

        int counter = 0;
        String num = "";
        do{                                    //int ten string e donduk burada
            System.out.println("Lutfen 1 ila 10 arasinda bir tam sayi giriniz");
            num = input.next();

            if(num.equalsIgnoreCase("Q")){
                break;
            }
            else if(numList.contains(num)){
                numList.set(numList.indexOf(num), " Bingo");
                counter++;

            }else {
                numList.add(num);
            }

        }while (counter!= numList.size());
        if (!num.equalsIgnoreCase("Q")){
            System.out.println("Kazandiniz");
        }else{
            System.out.println("Oyundan isteyerek ayrildiniz");
        }
        System.out.println("Final report : " + numList);
    }
}
