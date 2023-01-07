package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {

        //Ex 1:  bir  md array olusturunuz ve bir dimensional li array e donusturunuz.
        // [ [ 2,5] ,[3] [ 4,7,11] ] bu arrayi soyle yapacagiz ==> [ 2,5 ,3 ,4,7,11]

        int a [][] = { {2,5},{3},{4,7,11}   }; //
        System.out.println(Arrays.deepToString(a)); //[[2, 5], [3], [4, 7, 11]]

        int totalElement =0;

        // a array'indeki toplam eleman sayisini bulunuz
        for (int[]  w  :   a){

            totalElement = totalElement + w.length;
        }
                                                                                   // b isimli tek daimentli bir array olussturuyorum
        int b[] = new int[totalElement];
        System.out.println(Arrays.toString(b)); //[0, 0, 0, 0, 0, 0]


        //a array' indeki elemanlari b array ine tranfer ediniz
        int idx = 0;

                         // burada a ,[[2, 5], [3], [4, 7, 11]]
        for (int []  w  :  a){ //burada 1.array(2,5) w ye gidiyor, sonra 2. array w ye gidiyor, daha sonra 3. array w ye gidiyor

            for (int k :  w){ // buraya yukaridaki w den elemanlar 2,5 sirasiyla geliyor, int int tekte geliyor

                b [idx] = k; // b array ine git index "0" a  sirasiyla 2, 1. indexe 5, 2. indexe 4, 3, indexe 7, 4.indexe 11 koy dememk

                idx++;
            }
        }
        System.out.println(Arrays.toString(b)); //[2, 5, 3, 4, 7, 11]
    }
}
