package day10switchloops;

public class Loops02 {
    public static void main(String[] args) {

        //Ex 1: 21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tam sayilari ekran ayazdiran kodu ya
        for (int i = 21; i < 181; i++) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
        // EEx 2 :  size verilen kucuk harfle yazilmis stringin index ini cift sayii olan character lerini  buyuk harf yapiniz
        // ankara ==>  AnKaRa
        //note: yazdiginiz kod belli senaryolar icin calisiyor tum senaryolar icin calismiyorsa bu koda haard code denir,
        // hard code yanlis yazilmis koddur, mutlaka duzeltilmelidir
        //Note: bir string te "son index = length() -1"  dir (her zaman)

        String s = "ankara";

        for (int i = 0; i < s.length(); i++) {

            String ch = s.substring(i, i + 1);


            if (i % 2 == 0) {

                System.out.println(ch.toUpperCase());
            }
        }
    }
}
