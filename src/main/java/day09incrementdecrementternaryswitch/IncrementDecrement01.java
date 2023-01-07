package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {

    public static void main(String[] args) {

        int a = 5;  //bazen sayilar artirilabilir
        System.out.println(a); // 5

        //increment= artirma  increce= artirmak
        a= a +2;  //  a 7 oldu.  veya a  += 2; // islemle isaret arasinda bosluk olmamali, a ile isaretler arasinda bosluk olabilir
        System.out.println(a);

        // Ex 2:  birtane int variable olusturun ve onu 2 sekilde 5 artirin

        int b = 10;
        System.out.println(b); // b 10

        b = b+5;
        System.out.println(b); //b 15

        b += 5;
        System.out.println(b); //b20

        // decrement: azaltma
        int c = 8;
        System.out.println(c);  //8

        c = c-3;
        System.out.println(c); //5

        c -= 3;
        System.out.println(c); //2

        // increment 2 , carma islemi ile
        int d = 6;
        System.out.println(d); //6

        d = d*2;
        System.out.println(d); //12

        d *= 2;
        System.out.println(d); // 24

        //Decrement 2, bolme islemi ile

        int e = 24;
        System.out.println(e); //24

        e = e/2;
        System.out.println(e); //12

       e /= 2;
        System.out.println(e); //6

        // "1" ile increment ve decrement

        int f = 12;
        System.out.println(f);

        f++;
        System.out.println(f);//f in degeri 1 artar, 13 olur (increment)

        // 1 ile decrement
        int h = 10;

        h--;
        System.out.println(h); // 9 0lr (dencrement)

        // post-increment(sonra artirma) ve pre-increment(once artma)

        int i = 10;  //post increment
        int k = i++;           // post increment cunku increment variable dan sonra yazildi (i : variable) (++ lar ise increment)
        System.out.println(k); // 10 ==> "i" artirilmadan "k" ya konuldugu icin "k" nin degeri 10 olur.
        System.out.println(i); // 11 ==> "i" satir sonunda artirildigi icin "i" nin degeri 11 olur.

        int m = 15;  //pre increment
        System.out.println(m); // m 15

        int n = ++m; // pre increment cunku inc ,variableden once yazildi
        System.out.println(n); // 16 ==> "m" artirildiktan sonra "n" ye konuldugu icin "n" nin degeri 16 olur.
        System.out.println(m);// 16 ==> "m" satir sonunda artirildigi icin "m" in degeri 16 olur

        //post decrement, pre decrement
        int p = 17;
        int r = p--;  // r 17 olur cunku post decrement var, islem yapilmadan once atama yapiliyor
                      // ama p 16 olur, cunku 2 tane eksi ile isleme ugruyor
        System.out.println(p); //16
        System.out.println(r); // 17

        int s = 20;
        int t = --s; // t 19 olur
        System.out.println(s); // 19
        System.out.println(t); //19




    }
}
