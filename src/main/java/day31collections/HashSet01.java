package day31collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        // unik (benzersiz) data uretir Hash
        // set=tekrar yok demektir. tekrarsiz data depolamak icin kullanilir, e mail adress gibi

        /*
 1)"Hash" bir tekniktir, Java bu teknigi kullanarak benzersiz datalar uretir.
 2)"Set" tekrarsiz data depolamak icin kullanilam bir Collection'dir.
 3)Set tekrar kabul etmez. Yani;tekrarsiz verileri depolamak icin kullanilir.
   "Set" ler 3'e ayrilir;
  i)HashSet:  a)Super hizlidir,cunku HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez
                yani HashSet'lere eklenen elemanlar rastgele siralanirlar.
              b)HashSet'ler tekrarli elemana musaade etmezler
              c)HashSet'ler sadece bir tane "null" i eleman olarak kabul ederler.
  ii)LinkedHashSet: a)LinkedHashSet elemanlari "insertion order" a gore dizer.(sizin verdiginiz siraya gore dizer)
                    b)LinkedHashSet elemanlari siralamakta zaman kaybettigi icini HashSet' e gore yavastir.
  iii)TreeSet: a)TreeSet, elemanlari "natural order"(kucukten buyuge || alfabetik sıraya gore) a gore dizer.
               b)TreeSet "natural order" yaparken cok zaman harcar o yuzden en yavas "Set" dir.
 */
        HashSet<Integer> hs = new HashSet<>(); // Hashset ler non prim kullaniyor
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);//[5, 234, 12, 78] random siralama, rast gele demek,elemanlar rastgele siralandi

        int hc = hs.hashCode();
        System.out.println(hc);//329 bu sayi Hashset in kodu(hs)
    }
}
