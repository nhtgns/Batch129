package day09incrementdecrementternaryswitch;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
        Ex 1: verilen yilin artik yil(Leap Year) olup olmadigini kontrol eden kodu yazin
        1) yil 100 e bolunurse 400 e  de tam  bolunmelidir  1600==> leap   1800==> leap degil
        2) yil 100 e tam bolunmuyorsa 4 e tam bolunmelidir 2004 ==> leap   2005 ==> leap degil
         */ // sertifika sorusu bu


        int year = 1800;
        String result = year % 100 == 0 ? (year % 400 == 0 ? "leap" : "Not leap") : (year % 4 == 0 ? "leap" : "Not leap");
        System.out.println(result);

    }
}
