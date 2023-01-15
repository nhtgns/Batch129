package practice06;

public class A {

    public static void main(String[] args) {
        B b = new B();
        b.m(); //bad
        System.out.println(b.x);//20

        C c = new B();
        c.m();//bad
        System.out.println(c.x); //10

        C d = new C();
        d.m(); // good
        System.out.println(d.x); //10

        D child = new D();
        System.out.println(child.x); //20
        System.out.println(child.sayi); //50
        child.m(); // bad
    }// main
}
