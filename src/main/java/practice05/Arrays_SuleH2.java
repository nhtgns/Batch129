package practice05;

import java.util.Scanner;

public class Arrays_SuleH2 {
    public static void main(String[] args) {
//
//        int[][] x = {{-9, 0}, {0, 0, 49}};
//
//        System.out.println(m(x));
//    } //main
//    public static int m(int[][] m) {
//        int result = m[1].length;
//
//        for (int i = 0; i < m.length;               i++) {
//
//            for (int j = 0; j < m[i].length;            j++) {
//
//                result  +=    m[i][j];
//
//            }
//        }
//        return result;
//

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an inteğer");
        int a = scan.nextInt();

        if(a%2==0) {
            if(a%3==0) {
                System.out.println("Woooow!");
            }else {
                System.out.println("Hmmmm!");
            }
        }else{
            if(a%3==0) {
                System.out.println("Normal!");
            }else {
                System.out.println("Yazik!");
            }
        }
    }//method
}
