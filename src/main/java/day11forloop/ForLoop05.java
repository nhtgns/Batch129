package day11forloop;

public class ForLoop05 {
    public static void main(String[] args) {

        /* onemli bir soru

    Example 1: Asagidaki ciktiyi verecek kodu yaziniz. // bunlar tekrarli ifadeler ,o yuzden Loop olusturmaliyim. nestedloop var icice loop
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                  time consulting = zaman emici
                  // burada nested for loop var
*/
        for ( int i =1 ;  i<5 ; i++){
            System.out.println("Week: " + i);

            for (int k= 1; k<8 ; k++){
                System.out.println("Day:" +k);
            }
        }
    }
}
