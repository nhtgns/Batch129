package day16multidimensionalarrays;

public class Md05 {
    public static void main(String[] args) {



        // Ex : bir int md olusturunuz ve array deki tum elemanlarin carpimini konsola yaz kodu yaz

        int a [][] = { {2,5} ,{4,7,11}   };
        int carpim= 1;

        for (int[]  w  :  a){

            for (int  k : w){

                carpim = carpim *k;
            }
        }
        System.out.println(carpim);//3080

    }
}
