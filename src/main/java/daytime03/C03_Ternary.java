package daytime03;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        /*
TASK :
 Kullanicidan bir character girmesini isteyiniz
 Character harf ise kucuk harf olup olmadigini kontrol ediniz
 Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
 Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
 Harf degilse ekrana "Harf degil" yazdiriniz
 97:a  122:z ascii değeri
 */

    /*
    Ascii degerler verilmeseydi
    char a='a';
    System.out.println(a+0);
     */  //ternary
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char ch = input.next().charAt(0);

        boolean harfMi = (ch<='z' && ch>='a')  || (ch <='Z'  && ch >='A');
        boolean kucukHarf = (ch<='z'  && ch>='a');

        String result = (harfMi)  ? (kucukHarf ? "Kucuk harf" : "Buyuk harf")        :  "Harf degil";
        System.out.println("result :" + result);

        if(harfMi){

            if(kucukHarf){
                System.out.println("Kucuk harf");
            }
            else{
                System.out.println("buyuk harf");
            }
        }else{
            System.out.println("harf degil");
        }


    }
}
