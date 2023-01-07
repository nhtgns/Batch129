package daytime06;

//import static daytime06.MethodWoid.dikdortgeninAlani;

public class MethodReturn {
    public static void main(String[] args) {

        //bunda ekleme, yazdırma, bir tabağa koyma vs. yapabiliriz.
        //return bize gerçek bir malzeme vermiş oldu.

       int cikti =dikdortgeninAlani(5, 10);
        System.out.println(cikti); //50
        dikdortgenincevresi (4, 5);

    }

    private static void dikdortgenincevresi(int c, int d) {
        System.out.println(c+d);//9
    }

    private static int dikdortgeninAlani(int a, int b) {

        return a*b;


    }//main


}
