package day09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {
        // Ex 1:
        int a = 10;
        int b = 20;

        int r1 = a<b  ? a++ : ++b ; // buradaki ++ lari biz sayiyi bir artirmak istedigimiz icin yazdik, formul olusturduk
                                    // b yi artirmak istiyorsan ++ lar b den once yazilir, b yi artirmak istemiyorsan b once yazilir

        System.out.println(r1); //10  "kod okuma isi yapildi burada"
        System.out.println(a);  //11
        System.out.println(b); //20 cunku ++b isleme girmedi

        // Ex 2:
        // verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        // mutlak deger ==>   -4 ==> -1*-4= 4  olur,       4 ==> 4      0==>0
        // eksi ifadeler  -1 ile carpilir ve arti yapilir, sifir ve buyuk sayilar kendisiyle carpilr

        int c = -4 ;

        int r2 = c<0 ? -1*c  : c; // c<0 ifedesi mutlak degerin bir kurali, sayinin eksi mi arti mi oldugunu gosterir
                                    // -1*c bir formul, -1 i yukarida belirtilen -4 ile carp demek

        System.out.println(r2);  //4

       // E 3: 2 sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise "farkli isaretli sayilari carpamiyorum" yazdirin
        // object butun non primitive data type lerinin ortak parent (baba) idir
        //  object in parent i yoktur
        // ayni anda farkli data type lari kullanilirken object kullanilir
        // hz adem e benzer ,object. her data type in parent i object tir

        int m =  5;  //object bir data type tir. string ve int leri object olarak kullanabilirsiniz
        int n = 6;

        //soruda ayni isaretli ise sayilar diyor, crpin diyor, o yuzden formulu carpma seklinde oluturmaliyim
        Object r3 = (m>0 && n>0) || ( m<0  && n<0)  ? m*n  :  "farkli isaretli sayilari carpamiyorum";
        System.out.println(r3); //30


        //e 4:  size verilen sayinin 3 basamakli olup olmadigini gosteren kodu yaziniz

        int p = -436;  // burada film p de . 436 nin pozi hali dde var

        int r = Math.abs(p);//verilen sayi negativ ise onu pozitife cevirip isleme sokmak ve islem sayisini azaltmak icin Math.abs() methodu kullanilir
        String r4 = (r>99 && r<1000) ? p +  " uc basamakli"  : p + " uc basamakli degildir"; // dinamil cikti verir
                        //true
        // burada sarti kontrol ederken r kullanildi, ciktilar icin p kullanildi, cunku girilen sayi -436 idi

        System.out.println(r4); // -436
    }
}
