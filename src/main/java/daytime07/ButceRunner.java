package daytime07;

public class ButceRunner {
    public static void main(String[] args) {

        Butce baba = new Butce();
        System.out.println("Maas oncesi:" + Butce.butce);

        baba.maasAl(3000);

        System.out.println("Maas sonrasi butce :" + Butce.butce);
        baba.harclikAl(100);
        baba.harclikharca(20);
        baba.Butcedenharca(500);
        System.out.println(baba.harclik);  // 80 kaldi
        System.out.println(Butce.butce);//2400

        Butce anne = new Butce();
        anne.maasAl(5000);
        anne.harclikAl(500);
        anne.harclikharca(450);
        System.out.println(Butce.butce); //6900  kaldi
        System.out.println(anne.harclik);  //50 kaldi

        Butce cocuk = new Butce();

        cocuk.harclikAl(200);
        cocuk.harclikharca(30);
        System.out.println(Butce.butce);//6700
        System.out.println(cocuk.harclik);//170


    }//main
}
