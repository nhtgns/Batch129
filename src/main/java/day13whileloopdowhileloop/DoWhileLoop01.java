package day13whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        // 1 while -loop
        int i=1 ;

        while (i<1){

            System.out.println("sen bir while loop sun"); // while booy  hic calismadi, das ist moglich.  while loop ta , zero Execution mumkun
            i++;
        }

        //2  do -while- loop  do while loop ta sart yazdir dedikten sonra koyulur, o yuzden herhalukarda yazdirir
        // ozellikle oyunlarda kullanilir bu yonte,

      int k = 1;

        do{             // do nun sinteks i icin suslu parantez acilir
            System.out.println("Sen bir do while loop sun");//do while calisti, en az 1 kere calisir. do while loop ta zero execution mumkun degil

            k++;

        }while (k<1);
    }
}
