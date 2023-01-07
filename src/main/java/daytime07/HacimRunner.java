package daytime07;

public class HacimRunner {
    public static void main(String[] args) {
        //Küp, kare prizma ve dikdörtgen prizmanın
// hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız

        Hacim hacim = new Hacim(); //burada object olusturduk

        int karePrizma = hacim.hacimHesapla(5,6);
        System.out.println(" kprizma :" + karePrizma);

        int dikdortgenPrizma = hacim.hacimHesapla(5,6,7);
        System.out.println("dikd:" + dikdortgenPrizma);

        int kup = hacim.hacimHesapla(5);
        System.out.println("kup :" + kup);



 }// main
}
