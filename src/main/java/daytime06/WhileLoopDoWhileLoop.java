package daytime06;

public class WhileLoopDoWhileLoop {
    public static void main(String[] args) {

        // ne zaman While Loop, ne zaman Do while loop kullanilir

        // 0 dan baslayip 3 e kadar birer birer artan kodu yaziniz

        int i = 0;

        while (i < 3){
            System.out.println(i); // 3 dataa icin 4 kontrol yapti

            i++;
        }

        //
        
        do {
            System.out.println(i);

            i++;

        }while (i<3);

    }//main
}
