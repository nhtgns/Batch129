package day04asciiwrapperclassoperatorsmemoryusagesh;

public class AsciiValuessh {

    // Java da her karakterin sayisal degeri vardir
    // bu degerler "ASCII degerler" olarak adlandirirlir
    //bu degerin tamaminin bulundugu tabloya "ASCII table" denir

    public static void main(String[] args) {
        //herhangibir karakterin ascii degerini bulmak icin o karakteri "int" data type inde bir variable in icine koyunuz
        int ch = 'A';
        System.out.println(ch);

        int unlem = '!';
        System.out.println(unlem);

        char c1 = 'K';

        char  c2 = '?';
        // java da char lari matematiksel islemlerde kullanirsaniz , Java o char larin ascii degerlerini(sayisal degerlerini) kullanir
        System.out.println(c1 + c2 + " sonuc : "); //  toplama yapilacaksa once sayilaar yazilir. carpma ve bolmede fark etmez

        /* java da + isaretinin 2 anlami var, toplama veya birlestirme. birlestirme stringlerde yapilir. ama burada string yok ki, bu char
        o yuzden burada birlestirme yapamaz, toplama yapar
        */

        int deger = 'z';
        System.out.println(deger);

    }
}
