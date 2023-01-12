package day24accessmodifiersinheritance;

public class Student {

    public String name = "Tom Hanks"; // name herkes tarafindan bilinebilir, o yuzden public yaptim

    String stdId = "TH2023HU12001"; // student Id okul yonetimindeki insanlar tarafindan bilinebilir, o yuzden default yaptik

    protected int accountNUM = 76512345;//accountNum be, esim ve cocuklarim tarafindan bilinebilir

    private int balance = 123000;// sadece benim oldu




    // myStd.stdId      //default olan variable'lar ayni "Package" adindan ulasilabilir oldugundan bu class da gorulebilir
    // myStd.accountNumber // ayni package ile bir grup ve cocuklari tarafindan gorulebilir oldugu icin gorulur
    // "balance" Private oldugundan baska class da gorulemez .Student classin icindeki balance variable a bu class dan ulasamayiz.
        // clas lar defaul ve public olabilir

    //not;  access modifair lar genisten dara
    // ac mo ne ise yarar, meta variab ve clas lara ul ic kull
    // Access Modifier :Variable lara, class lara,  method lara ulasmayi duzenler
    //Access Modifier'lari genisden dara dogru sayiniz
    //         public > protected > default > private

    //Access Modifier'lari genisden dara dogru sayiniz
   //         public > protected > default > private
     /*
Access modifierlar genisten dara dogru;
        public > protected > default > private
Class'lar protected ve private olamazlar. Sadece public ve default olabilirler.

Access Modifier'lar ne ise yarar?
    -Variablelara methodlara classlara ulasmayi duzenler.
Kac tane access modifier var ? 4. public > protected > default > private

publicler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
protected ayni packagein icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
default sadece ayni packageden ulasilabilir. Bu yuzden defaultlarin diger adi package private'dir
private

protected ile defaultun farki nedir ?
Package disina ciktigimizda childlardan protectedlara ulasabiliriz. Defaultlarda ulasamayiz.


*/

}
