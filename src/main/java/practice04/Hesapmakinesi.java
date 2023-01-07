package practice04;

public class Hesapmakinesi {
    public void toplama (double... a) { // istediğimiz kadar sayıyı toplayabilmek için varargs kullandık.

        int toplam= 0;

        for (double w : a) {

            toplam +=w;
        }
        System.out.println("Toplam : " + toplam);

    }

    public void cikarma (double... a) { // istediğimiz kadar sayıyı toplayabilmek için varargs kullandık.

        double fark= 0;

        for (double w : a) {

            fark -= w;
        }
        System.out.println("Fark : "+ fark );

    }

    public void carpma (double... a) { // istediğimiz kadar sayıyı toplayabilmek için varargs kullandık.

        int carpim= 1;

        for (double w : a) {

            carpim *=w;
        }
        System.out.println( "Carpim : "+ carpim );

    }

    public void bolme (double a, double b) { // istediğimiz kadar sayıyı toplayabilmek için varargs kullandık.

        if (b==0) {
            System.out.println("Hicbir sayi '0'a bölünemez ");
        }else{
            System.out.println("Bolum :" + (a/b));
        }



    }


}
