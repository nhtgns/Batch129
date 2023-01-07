package practice05;

import java.util.Arrays;

public class Q04_MultiArray_AyniIndexTop {


    /*
      Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
      toplamını yazdıran bir program yazın.
      arr1[]={{1,2},{3,4,5}{6}}
      arr2[]={{7,8,9},{10,11},{12}}
     */
    public static void main(String[] args) {

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        int limit = arr1.length;
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < limit; j++) {

                if (arr1[i].length < arr2[i].length) {
                    limit = arr1[i].length;
                } else {
                    limit = arr2[i].length;
                }

                sum = arr1[i][j] + arr2[i][j];
                System.out.println("arr1 [" + i + "]" + "[" + j + "] + "
                        + "arr2 [" + i + "]" + "[" + j + "] = " + sum);


            }





            }



        }

    }


