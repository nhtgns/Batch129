package daytime10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Socrative01 {
    // Kullanıcıdan 5 sayıdan olusan
    // bir liste isteyin.
    // listeyi sirala ve tersten yazdir
    // listeyi karıştırin ve yazdırin
    // 3'er sağa kaydirin ve yazdırin
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen sayi giriniz");
            arrList.add(input.nextInt());


        }
        System.out.println("arrlist:" + arrList); //arrlist:[4, 5, 6, 7, 8]
        //listeyi sirala ve tersten yazdir
        arrList.sort(Collections.reverseOrder());
        System.out.println("Ters arrList :" + arrList); //Ters arrList :[8, 7, 6, 5, 4]

        // listeyi rast gele karistir
        Collections.shuffle(arrList);
        System.out.println("karisti;" + arrList);//[5, 6, 8, 4, 7]

        // 3 er saga kaydir elemanlari
        Collections.rotate(arrList, 3);
        System.out.println("3 er saga kaydi: " + arrList);

        Integer max = Collections.max(arrList);
        Integer min = Collections.min(arrList);
        System.out.println("max :" + max);
        System.out.println("min;" + min);

        Collections.replaceAll(arrList, max, min);

        System.out.println("max degerlere min degerler geldi :" + arrList);


    } //main
}
