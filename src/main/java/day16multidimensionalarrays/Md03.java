package day16multidimensionalarrays;

public class Md03 {
    public static void main(String[] args) {

        //Example 2: Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.
        // multidimensional arrayde ic elemanlara tek tek ulasmak istiyorsaniz nested loop kullanmalisiniz

        int a[][] = { {2,62,82},{3,13} };  // nested loop kullanilir. bu satir distaki kirmizi parantez icindi

        int sum= 0;

        for (int []  w  :  a) { //nested loop kullandik. bu kisim ic arrayleri aliyor, tek tek asagidaki loop a gonederiyor

                           // [2 ,62,82]
            for (int k :         w ){ // burada da ic array lerdeki elemanlar tek tek k ya gidiyor isleme girip toplaniyor sayi degeri ile

                sum = sum + k;  //burada sirasiyla ic array in elemanlari toplaniyor

            }

        }
        System.out.println(sum);  //162
    }
}
