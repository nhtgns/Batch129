package day05typecastinstringmanipulations;

public class SwapValues {

    public static void main(String[] args) {

        // Swap , yer degistirme demek  //onemli
        // 1. kapta patates, 2. kapta domates var swap==> tersi olacak
        //onemli, bu soru interviw lerde soraralar

        int a = 12;
        int b  = 5;   // swapten sonra a=5, b= 12 olacak
        int temp = 0; // 3. variable //temporari ( temp) ,gecici demek

        System.out.println("a:" + a);//12
        System.out.println("b:" + b);//5

        //1.yol

        temp = a;    // 1.adim, temp in icine a yi koydum
        a    = b;    // 2.adim, a nin icine b yi koydum
        b    = temp; //3.adim, b nin icine temp i koydum( tempte a vardi)
                     // yukarida swap yaptik

        System.out.println("a : " +  a);//5
        System.out.println("b : " +  b);//12   bitti

        //2.yol: interviw de sorulur (annemiz bize 3. bir tabak vermezse swap nasil ypiliri gorecegiz)
        int x = 12;
        int y = 5;

        x = x + b; //x17

        y = x - y;// y = 12 oldu

        x = x - y;// x = 5 oldu

    }
}
