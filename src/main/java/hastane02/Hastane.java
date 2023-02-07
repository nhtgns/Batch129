package hastane02;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hastane extends VeriBankasi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println( " " +
                "\n Hastaya ulasmak icin              1 " +
                "\n Unvandan doktora ulasmak  icin    2 " +
                "\n Hastaliktan doktora ulasmak icin  3 e tiklayiniz");
        int secim = input.nextInt();


        switch (secim){
            case 1:
                hastaBul();
                break;
            case 2:
                UnvandanDoktorArama.unvandanDoktora();
                break;
            case 3:

                break;
            default:
                System.out.println("Yanlis secimde bulundunuz");


        }
    }



    public static void hastaBul() {

        VeriBankasi veriBankasi = new VeriBankasi();
        Scanner input = new Scanner(System.in);

        // int bir arraydeki elemanin index numarasina nasil ulasirim ?
        //int bir Arraydeki elemanin index numarasini binarySearch() methoduyla buldum  "Arrays.binarySearch(hastane.hastaIDleri, hastaId);"
        // hastanin aciliyet durumuna nasil ulasir ve degistirebilirim?
        // hastalik adinda degisken olusturup belirledik

        Hastane hastane = new Hastane();
        Durum durum = new Durum();


        int hastaId = 0;
        int index = 0;
        String hastalik = "";
        String unvan = "";

        do { // hastabulma
            System.out.println(" Hasta Id sini giriniz");

            hastaId = input.nextInt();

            index = Arrays.binarySearch(hastane.hastaIDleri, hastaId); //elemanin index i bulundu
            hastalik = hastane.durumlar[index];

            System.out.println(  " hasta adi :" + hastane.hastaIsimleri[index] +
                                 " " + " Soyadi :" + hastane.hastaSoyIsimleri[index] +
                                 " " + "Hastalik durumu :" + hastane.durumlar[index]);

//  int unvanindex = Arrays.asList(hastane.unvanlar).indexOf("Norolog");

            aciliyetDurumuGoster(hastalik);
            doktorBul(hastalik);



        } while (true);

    }//main
public static void doktorBul(String hastalik){

    Hastane hastane = new Hastane();

 switch (hastalik){ // hastaliktan doktora ulasma
        case "Alerji":
            System.out.println("Allergist");  //String
            System.out.println("doktoradi :"+ " " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Allergist")]);
            System.out.println("doktorsoyadi :" + " " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Allergist")]);
            break;

        case "Bas agrisi":
            System.out.println("Norolog");
            System.out.println("doktoradi :"+     " " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Norolog")]);
            System.out.println("doktorsoyadi :" + " " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Norolog")]);
            break;
}
    }
    public static void aciliyetDurumuGoster(String hastalik){


        if (hastalik.equalsIgnoreCase("Çocuk hastalıklari") || hastalik.equalsIgnoreCase("Kalp hastaliklari")) {

            System.out.println("Hastanin durumu riskli");
        } else {
            System.out.println("Acil bir durum yoktur.");
        }
    }



}


