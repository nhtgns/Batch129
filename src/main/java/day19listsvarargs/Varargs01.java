package day19listsvarargs;

public class Varargs01 {
    public static void main(String[] args) {  // birden fazla data sayi toplanir burada
        addTwoNumbers(3,5);
        addThreeNumbers(4,7,2);//bunlar argument
        add(2,4,6,7,67);  // 86 .varargs, argument tir bunlar


    }//main
    //  iki sayiyi toplayan method olusturun
    public static  void addTwoNumbers(int a, int b){
        System.out.println(a+b); //8

    }
    //uc sayiyi toplayan method olust
    /*
    Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
    Method'un parantezleri icine yazilanlara "parametre" denir
    Method'u cagirirken kullanilan sayilara da "argument" denir.

    Bir methodda birden fazlaVarargs parametre kullanilamaz cunku ikincisi unused code olur
    note: Varargs, varargs disindaki parametrelerle kullanilabilir ama varargs her zaman son parametre olmalidir, yoksa hata verir
     */
    public static void addThreeNumbers (int a, int b, int c){ //bunlar parametre

        System.out.println(a+b+c);//13
    }
    //istediginiz sayidaki sayiyi toplamak icin bir method olusturun

    public static void add(int... a){ // array gibi calisir.byte ,boolean, char ... Integer  de olur
        int sum = 0;

        for (int  w: a){
            sum = sum + w;
        }
        System.out.println(sum);

    }
}
