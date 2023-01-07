package day18lists;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Lists02 {
    public static void main(String[] args) {
        //Ex 1: Bir tane Integer List olusturalim sonra bu listte birbirine en yakin iki tamsayiyi yaziniz.
        // [12,23,9,11,35] ==> 11,12 en yakin

        //Interwiv sorusu
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(9);
        nums.add(11);
        nums.add(35);

        Collections.sort(nums);
        System.out.println(nums);//[9, 11, 12, 13, 35]

        int minDiff = nums.get(1) - nums.get(0);//baslangic yapilmali burda

        for (int i = 1; i < nums.size(); i++) { //farki bulmak icin 2. elemandan 1.yi cikariyoruz, o yuzden 1 le basla
            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1));

        }
        System.out.println(minDiff);//1   minimum fark bulundu

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) - nums.get(i - 1) == minDiff) {
                System.out.println(nums.get(i - 1) + "and" + nums.get(i)); //11and12  12and13
            }

        }
    }
}
