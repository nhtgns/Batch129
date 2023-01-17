package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {

    /* methodoverloading ne demek?
    -Ayni isimde farkli isler yapan methodlar olusturmak demektir. overloading, asiri yukleme demek.
    Ornegin replace,sort methodlarinin birden fazla methodu var, ayni isim ama birbirinden farkli isler yapiyor.
     bunlar Java nin methodlari, biz simdi kendimiz method overloading yapacagiz

        -Method Overloading nasil yapilir?

       1) Method overloading yaparken method ismi degistirilmez.
          Method ismi degisirse o zaten baska bir method olur.
       2) Method overloading yaparken parametreler degistirilir.
            --) Parametre degistirirken parametrelerin data typelari degistirilebilir.
            --) Parametre degistirirken parametrelerin yerleri degisebilir.
                (parametrelerin data typelari farkliysa parametrelerin yerini
                degistirmek mantiklidir yoska mantiksiz olur)
            --) Parametre degistirirken parametrelerin sayisi degistirilebilir.
       3) Java icin "ismi" ve "parametreleri" ayni olan iki method tamamiyla aynidir.
          Bu yuzden "ismi" ve "parametre"  "method signature" olarak adlandirilir.
       4) Method Overloading olustururken return type i degistirmenin hicbir etkisi yoktur.
          Method Overloading olustururken access modofier i degistirmenin hicbir etkisi yoktur.
          Method Overloading olustururken methodu static veya non static  yapmaninhicbir etkisi yoktur.
          Method Overloading olustururken method body  i degistirmenin hicbir etkisi yoktur.
       5) "private" methodlar overload edilebilir, cunku methodlar overloading sadece bir class in icinde olur.
          private olmak ise baska classlara gidildiginde problem olusturur
       6) "static" methodlar overload edilebilirler.
     */

    public static void main(String[] args) {


        // java hangi methodu kullanacagina nasil karar verir?
        // Biz add methodunu cagirinca, Java parametresi en uygun olan methodu secer.
        add (3, 5);


    }//main


    public static void add(int a, int b){  //java hangisini kullanacagina nasil karar verir. unik olmak neydi
        System.out.println(a+b);

    }    // public static int, int demek bir data donduruyorsunuz demek
         //private static int add(int a, int b){  //java hangisini kullanacagina nasil karar verir. unik olmak neydi
         //return a+b;

    public static void add(double a, double b){
        System.out.println(a+b);

    }
    public static void add(double a, int b){
        System.out.println(a+b);

    }
    public static void add(int a, double b){
        System.out.println(a+b);

    }
   public static void add(int a, int b, int c){
        System.out.println(a+b);

    }
}//class
