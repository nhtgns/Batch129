package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

        /*
         Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
         */
        Scanner input = new Scanner(System.in);
        System.out.println("satir (row) sayisini giriniz");
        int row = input.nextInt();

        System.out.println("sutun (column sayisini giriniz");
        int column = input.nextInt();

        for (int i = 1; i <= row ; i++) { //satirlar icin

            for ( int k=1; k <= column;  k++){  // sutun icin

                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
