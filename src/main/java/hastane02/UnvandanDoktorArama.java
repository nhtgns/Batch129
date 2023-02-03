package hastane02;

import java.util.Scanner;

public class UnvandanDoktorArama {


    public static void unvandanDoktorArama() {
        Scanner input = new Scanner(System.in);

        int counter = 0;

        do{//burası

            System.out.println("" +
                    "\nBu menude uzmanlıklarına göre doktorlarin listesini göreceksiniz");


            System.out.println("" +
                    "\n Alergist'ler icin..............1 " +
                    "\n Norolog'lar....................2 " +
                    "\n Genel Cerrahlar için...........3" +
                    "\n Cocuk Doktorları icin..........4" +
                    "\n Dahiliye Doktorları icin.......5 " +
                    "\n Kardiyologlar için.............6 " +
                    "\n Ana menüye dönmek için ........7"+
                    "\n Randevu icin...................8");

            VeriBankasi obj = new VeriBankasi();

            String strKarar= input.next();

            int kararDeger= String.valueOf(strKarar).replaceAll("[\\D]","").length();

            if (kararDeger<1){
                System.out.println("Hatalı giriş yaptınız. Harf veya kelime ile giriş yapılamaz");
                continue;
            }
            int karar =0;
            try {
                karar = Integer.parseInt(strKarar);
            }catch (NumberFormatException e) {
                System.out.println("Sadece rakamla giris yapabilirsiniz.");
            }
            if (karar>0 &&karar<9 ) {

                switch (karar) {

                    case 1:
                        System.out.println("Dr. " + obj.doctorIsimleri[0] + "   " + obj.doctorSoyIsimleri[0] + "  Ünvani : " + obj.unvanlar[0]);
                        break;
                    case 2:
                        System.out.println("Dr. " + obj.doctorIsimleri[1] + "  " + obj.doctorSoyIsimleri[1] + "  Ünvani : " + obj.unvanlar[1]);
                        break;
                    case 3:
                        System.out.println("Dr. " + obj.doctorIsimleri[2] + "  " + obj.doctorSoyIsimleri[2] + "  Ünvani : " + obj.unvanlar[2]);
                        break;
                    case 4:
                        System.out.println("Dr. " + obj.doctorIsimleri[3] + "  " + obj.doctorSoyIsimleri[3] + "  Ünvani : " + obj.unvanlar[3]);
                        break;
                    case 5:
                        System.out.println("Dr. " + obj.doctorIsimleri[4] + "  " + obj.doctorSoyIsimleri[4] + "  Ünvani : " + obj.unvanlar[4]);
                        break;
                    case 6:
                        System.out.println("Dr. " + obj.doctorIsimleri[5] + "  " + obj.doctorSoyIsimleri[5] + "  Ünvani : " + obj.unvanlar[5]);
                        break;
                    case 7:
               //         Randevu.slowPrint("Ana menüye yönlendiriliyorsunuz",50);
                        System.out.println();
                        counter++;//burası
                        break;
                    case 8:
              //          Randevu.randevuOlusturma();
                        break;
                    default:
                        System.out.println("Hatalı giris. Girisinizi belirtilen sayı aralığında yapınız");//buraya seçenekler dışında bir değer girdiniz
                }
            }
            else{
                System.out.println("Hatali giris yaptiniz. Girişinizi belirtilen sayı aralığında yapınız ");//buraya seçenekler dışında bir değer girdiniz


            }

        }while (counter==0);//burası
    }
}


