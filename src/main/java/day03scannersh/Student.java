package day03scannersh;
//asagidakiler bir kalip olusturuyor.iyi bir ornek
//bu kalipta class ta main method yok, burasi kalip cunku

public class Student {


    public String name     = "Tom Hanks"; //pasif ozellik, yani variable
    public byte grade      = 8;           //pasif ozellik, yani variable
    public  String adresse = "Miami";    //pasif ozellik, yani variable


    public void study (){  // void yeni data type uretmez
        System.out.println(" Gunu gunune ders calisir.");//aktif ozellik

    }public void feed(){  // void yeni data type uretmez

        System.out.println("Saglikli beslenir.");//aktif ozellik

    }

}
