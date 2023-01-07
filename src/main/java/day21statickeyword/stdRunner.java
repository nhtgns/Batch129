package day21statickeyword;

import java.util.List;

public class stdRunner {
    public static void main(String[] args) {

        //stdName static oldugundan ona ulasmak icin object olusturmadim
        //sadece class ismini kulllanmak yeterli.
        System.out.println(Student.stdName);//Tom Hanks. burasi static object


        //age non static oldugu icin object olusturmak zorundayiz ve olusturduk.
        //soru cozerken ,static variable lar olanlar hemen class kututsuna yapistirilir
        Student std1 = new Student();//nonstaticobject.busatir,bircode tur.java buraya non static olanlari monteeder.Student Class indan bir obje olusturduk.
        System.out.println(std1.age); //13, simdi std1 e git, age i bul dedim. std1 benim olusturdugum object imin adi.object te baska seyler de bulunur

        Student std2 = new Student();           // burada ben bir taane daha object olusturdum, java buna da non static degeri atadi.
                                                 // non static 2 kere olustu.static olan bir olarak kalir
        System.out.println(std2.age);      //13

        String initials = Student.getInitials("Tom Cruise"); //static
        System.out.println(initials); // TC

        int vowels = std1.countVowels("Nihat Gunes"); //non static
        System.out.println(vowels); //4

        //static olanlari object ile cagirmak tavsiye edilmez.
        String s = std1.getInitials("Ali Can");
        System.out.println(s);// AC  ilk harfler alindi



        //static methodlar class ismiyle cagrili

        //List olusturmada yeni bir yontem
        List<String> names = List.of("Ali", "Veli", "Can", "Kemal");//[Ali, Veli, Can, Kemal]
        System.out.println(names);

        //stattic methodlar object e ismi ile cagrilmaz





    }
}
