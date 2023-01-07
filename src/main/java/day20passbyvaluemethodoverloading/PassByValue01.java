package day20passbyvaluemethodoverloading;

public class PassByValue01 {
    /*
    1) Java "pass-by-value" sayesinde variable'larin orjinal degerlerini koruma altina alir.
     */
    public static void main(String[] args) {


        double price = 100 ;// bu original ve bunu Passby value hicbir zaman kimseye vermez
        System.out.println(price); //100 original

       double studentShirtPrice = discount("student", price); //ogrenciye gomlek icin indirim yapacagim
        System.out.println(studentShirtPrice);//90

       double veteranShirtPrice = discount("veteran", price);
        System.out.println(veteranShirtPrice);//80

       double seniorShirtPrice = discount("senior", price);
        System.out.println(seniorShirtPrice);//95

        price = discount("veteran", price);
        System.out.println(price); //original 100 , 80 dustu, tum fiyatlari veteran degerine cevirdik

    }//main
    public static double discount(String state, double price){ //hangi durumda indirim yapacagim icin boyle yazdim methoda
        switch (state){ // switch , state gore degisiyor

            case  "student":
                price = price*0.90;
                break;

            case  "veteran":
                price = price*0.80;
                break;

            case "senior":
                price= price*0.95;
                break;

            default:
                price=price;
        }
        return price; // birkac defa degisen fiyati alacagiz

    }
}
