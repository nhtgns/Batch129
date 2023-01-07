package daytime03;

public class C0_IncremenDecrement {
    public static void main(String[] args) {

        int a = 12;
        int b = ++a;
        System.out.println("b=" + b); //12
        System.out.println("a:"+ a); //13

        int x = 15;
        int y= x--;
        System.out.println(  "x :" + x); //14
        System.out.println("y : " +y);//15

        int m = 21;
        int n = ++m; // ++ ya da --  lar once ise sayilar esitleniyor

        System.out.println(m); //22
        System.out.println(n); //22

        int f = 39;
        int s = ++f;
        System.out.println(f);
        System.out.println(s);

        int t = 32;
        int u = --t;
        System.out.println(t);
        System.out.println(u);



    }
}
