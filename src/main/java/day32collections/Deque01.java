package day32collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {

        Deque<Integer> dg = new LinkedList<>();
        dg.add(12);
        dg.add(5);
        dg.add(18);
        dg.add(9);
        dg.add(1);
        System.out.println(dg);//[12, 5, 18, 9, 1]

        /*
Inheritance Faydalari (miras)
1-Tekrar tekrar ayni kodu yazmaktan kurtarir
2-Bir kodu degistirmek kolay olur
3-Kod tamiri kolay olur
4- Eger child classlara herseyi yerlestirirsek yavas olur. Ortaklari parent'a koyarsak child atomic olur, hizli calisir
 */
      /*  Polimorphism 2 oge var
        Overloading =Ayni isimli ama farkli isi yapan methodlar.
        Ovverriding =Parentlardaki her bir methodu ozellestirmek
        Parenttaki methodu degistirilerek her bir  child da kullanilirsa buna overriding denir Bu cok faydalidir, esneklik.
*/

    }

}
