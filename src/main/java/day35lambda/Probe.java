package day35lambda;

import java.util.ArrayList;
import java.util.List;

public class Probe {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(131);
        nums.add(9);
        nums.add(12);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);


        Integer max =  nums.stream().distinct().sorted().reduce((t,u)-> u).get();
        System.out.println(max);

    }

}
