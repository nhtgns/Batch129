package day02datatypesmethodcreation;

public class Variables02 {


    /*
     Non -Primitive Data Types : String bir non-primitive  data type'dir
                                1 Uretilen herbir class ayni zamanda bir " non-primitive data type" dir.
                                2 bu yuzden  "non primitive data typeler sinirsiz sayidadir denebilir
                                3 Non primitive da type lerin isimleri buyuk harfle baslar
                                4 Non -primitive data type lerin tamami icin java, memory de ayni miktarda yer ayirir.


          Interview Sorusu: primitive ve non primitive arasindaki farklar
                           1) primitive ler sadece bizim atadigimiz degeri icerir,
                           " non primitive" leer bizim atadigimiz deger ve method lar icerir.
                          2) primitive ler kucuk harfle baslar, non primitive buyuk harfle baslar
                          3) primitive leri java uretti
                     non privit leri java ve devoloperler uretebilir ve sinirsiz sayidadir

                 4)primitive ler memory de data type ne göre yer kaplar,
                  Non pri  ler icin java memory de hep ayni buyuklukte yer ayirir.
     */
    public static void main(String[] args) {

        //Ornek 1: sehir ismi icin bir variabel olusturun ve bir deger atayip onu ekrana yazdirin
        String cityName = "Miami";

        System.out.println(cityName);

        String sehirAdi = "Adana";
        System.out.println(sehirAdi);

        String arabaMarkasi = "Audi";
        System.out.println("arabaMarkasi : " + arabaMarkasi);

        String kahvaltida = "kahvaltidaBorekYiyelim";
        System.out.println("kahvaltida ");

        int enKucukIkiBasamakliSayi = (10);
        System.out.println(enKucukIkiBasamakliSayi);

        double indirimMiktari = ( 5.9);
        System.out.println("indirimMiktari : " + indirimMiktari);

        byte sinifSayisi = ( 27);
        System.out.println("sinifSayisi : " + sinifSayisi);


        int a = 5;
        int b = 10;
        int c = a*b;
        System.out.println("a*b : " + c);
        System.out.println(a*b);




    }


}
