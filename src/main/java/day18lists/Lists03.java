package day18lists;

import java.util.ArrayList;

public class Lists03 {
    public static void main(String[] args) {

        //EX 2: Bir Integer Listteki 7 haric tum elemanlarin degerlerini 3 artiriniz.
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12); // elemana git 7 degilse 3 artir
        nums.add(13);
        nums.add(7);
        nums.add(11);

        //1.yol for each loop
        for ( Integer  w: nums){

            if( w == 7){
                continue;
            }
            nums.set(nums.indexOf(w),w+3);
        }
        System.out.println(nums); //[15, 16, 7, 14]

        //2.yol
        for (int i = 0; i <nums.size() ; i++) {
            int element = nums.get(i);
            if( element==7){
                continue;
            }
            nums.set(i, element+3); //alinan elemani degistirir update yapar

        }
        System.out.println(nums);//[18, 19, 7, 17]
        /*
        nums.indexOf (w) ilk gorunumun indexini verir. List tekrarli elemana sahip ise nums.indexOf(w) kullanimi risk olusturabilir.
         bu yuzden en guvenli yol forlopp tur
         */
    }
}
