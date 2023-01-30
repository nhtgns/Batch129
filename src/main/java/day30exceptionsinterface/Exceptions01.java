package day30exceptionsinterface;

public class Exceptions01 {
    // Her app in database'i vardir varil seklinde gosterilir genellikle kisaca DB yazarlar
// App ile DB ile surekli iletisim vardir, username ve pwd orda cunku
// App in database e ulasma hamlesine hit denir. DB ile connection kurulur
// App in DB ile bglanti kurduktan sonra cloud saniye basina para keser bundan dolayi islem sonrasi connection kesilmeli
// Giris bilgileri yanlissa yahut her halukarda islem bitiminde connection kesilmelidir yoksa fatura agir gelir clouddan
// Gunluk hayatta oldugu gibi IT de de her halukarda yapilmasi geereken isler vardir java bunun icin bir yapi olusturmustur;
    // exception alinsa da alinmasa da finally block her zaman calisir.
    //Eger bir kodun her halukarda calismasini istiyorsak onu finally block icine yazmaliyiz.
    /*
    1)Exception olsa da, olmasa da calistirmamiz gereken kod'lari "finally block" icine yazariz.
2)DB ile baglantiyi kesme isini yapan kod'lar gibi kod'lar her halukarda calistirilmalidir, bu tarz
  ko'lari finally block icine koyariz.
3)"try block" yalniz kullanilamaz
  "try block" + 1 "catch block" mumkundur
  "try block" + 1 "catch block" + 1 "finally block" mumkundur
  "try block" + coklu "catch block" mumkundur
  "try block" + coklu "catch block" + 1 finally block mumkundur
  "try block" + 1 "finally block" mumkundur
4)Coklu "finally block" kullanilamaz.
     */

    public static void main(String[] args) {

        int a = 12;
        int b = 4;
        int c[] = {3, 6, 9, 12 };

        m(c, a, b); //burada sayi yazmadik, cunku sayilari yukarida tanimladik.

    }

    public static void m(int[] c, int a, int b){

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally { //herhalukarda calismasi istenen kodlar finally icine yazilir
            System.out.println("Cut the connection with the DB");
        }

    }

}

