package hastane02;

import java.util.Arrays;
import java.util.Scanner;

public class UnvandanDoktorArama {

    public static void unvandanDoktora() {
        VeriBankasi veribankasi = new VeriBankasi();


        Scanner input = new Scanner(System.in);



int counter = 0;


        do{
            System.out.println(" " +
                    "\n Norolog icin        1" +
                    "\n Allergist icin      2" +
                    "\n Genel Cerrah icin   3" +
                    "\n Cocuk Doktoru icin  4" +
                    "\n Dahiliye icin       5" +
                    "\n Kardiyolog icin     6" +
                    "\n Cikmak icin         7  a basiniz");

            String unvan = input.nextLine();


            switch (unvan) {
            case "1":
                System.out.println("Norolog");  //String
                System.out.println("doktoradi :" + " " + veribankasi.doctorIsimleri[Arrays.asList(veribankasi.unvanlar).indexOf("Norolog")]);
                System.out.println("doktorsoyadi :" + " " + veribankasi.doctorSoyIsimleri[Arrays.asList(veribankasi.unvanlar).indexOf("Norolog")]);
                break;
            case "2":
                System.out.println("Allergist");  //String
                System.out.println("doktoradi :" + " " + veribankasi.doctorIsimleri[Arrays.asList(veribankasi.unvanlar).indexOf("Allergist")]);
                System.out.println("doktorsoyadi :" + " " + veribankasi.doctorSoyIsimleri[Arrays.asList(veribankasi.unvanlar).indexOf("Allergist")]);
                break;
            case "3":
                System.out.println("Genel Cerrah");  //String
                System.out.println("doktoradi :" + " " + veribankasi.doctorIsimleri[Arrays.asList(veribankasi.unvanlar).indexOf("Genel Cerrah")]);
                System.out.println("doktorsoyadi :" + " " + veribankasi.doctorSoyIsimleri[Arrays.asList(veribankasi.unvanlar).indexOf("Genel Cerrah")]);
                break;

                case "7":
                    System.out.println("Cikisi siz istediniz");
                    break;

            default:
                System.out.println("Hatali giris yaptiniz");

            }

            counter++;
    }while (counter == 0);


        }




        }





