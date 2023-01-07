package day15arrays;

public class Arrays04 {
    public static void main(String[] args) {

        // e  Bir array in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gos kod yaz

        int a[]  = {0,2,3,0,12,0}; // loop kullanilmali

        int num = 0; //bu sayi kontrol edilecek

        int  counter = 0; //kac kez

        for (int  w: a){

            if ( w == num){
                counter++;
            }
        }
        System.out.println(counter); //1

    }
}
