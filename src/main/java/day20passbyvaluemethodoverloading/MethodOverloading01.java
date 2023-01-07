package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {

    /*
       1) Method overloading yaparken method ismi degistirilmez.
          Method ismi degisirse o zaten baska bir method olur.
       2) Method overloading yaparken parametreler degistirilir.
            2.1) Parametre degistirirken parametrelerin data typelari degistirilebilir.
            2.2) Parametre degistirirken parametrelerin yerleri degisebilir.
             (parametrelerin data typelari farkliysa parametrelerin yerini
              degistirmek mantiklidir yoska mantiksiz olur)
            2.3) Parametre degistirirken parametrelerin sayisi degistirilebilir.
       3) Java icin "ismi" ve "parametreleri" ayni olan iki method tamamiyla aynidir.
       Bu yuzden "ismi" ve "parametre"  "method signature" olarak adlandirilir.
       4) Method Overloading olustururken return type i degistirmenin hicbir etkisi yoktur.
          Method Overloading olustururken access modofier i degistirmenin hicbir etkisi yoktur.
          Method Overloading olustururken methodu static veya non static  yapmaninhicbir etkisi yoktur.
          Method Overloading olustururken method body  i degistirmenin hicbir etkisi yoktur.

       5) "private" methodlar overload edilebilir, cunku methodlar overloading sadece bir class in icinde olur.
         private olmak ise baska classlara gidildiginde problem olusturur

       6)"static" methodlar overload edilebilirler.
     */

    public static void main(String[] args) {

        add (3, 5);

    }//main

    private static void add(int a, int b){  //java hangisini kullanacagina nasil karar verir. unik olmak neydi
        System.out.println(a+b);

    }
    private static void add(double a, double b){
        System.out.println(a+b);

    }
    private static void add(double a, int b){
        System.out.println(a+b);

    }
    private static void add(int a, double b){
        System.out.println(a+b);

    }
    private static void add(int a, int b, int c){
        System.out.println(a+b);

    }
}
