package daytime07;

public class Butce {
    // Tum aile uyelerinin birikiminin bulundugu ortak ihtiyaclar icin
    // kullanildigi bir butce ile kisisel harcamalarin yapildigi
    // harclik'larin oldugu basit bir ev bütçesi kodu yazınız.

    public static int butce;

    public int harclik;

    public void harclikAl (int alinanHarclik){

        butce -= alinanHarclik; //ortak hesaptan aliniyor harclik
        harclik += alinanHarclik;
    }

    public void Butcedenharca ( int harcanacakPara){
        butce -= harcanacakPara;
    }

    public void harclikharca (int harclikharcamasi){
        harclik -= harclikharcamasi;
    }
    public void maasAl ( int alinanMaas){
        butce += alinanMaas;

    }



}
