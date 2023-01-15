
package day25inheritiance;



public class VehicleRunner { // constructor
   // super()= parent'da ki constructer'ı çalıştırmaya yarar. bir class ta birden fazla constructor olabilir
    // super(); == parent

    public static void main(String[] args) {

        Honda myHonda = new Honda(); //biz burada,Honda class inda paremetreli constructor i ullanacagimizi bildirmis olduk
                                                             //bir onceki soruda honda class ind aparametresiz constructor i kullanmistik
        /*
        public Honda (){
                  --burada bir tane gorunmeyen super(); constructor i var
          Honda 1
         } ==> bu ifade parent taki  constructor a git demek,(en tepeye kadar gitmeliyiz) Biz Honda dedigimiz (child dan object olusturdugumuzda) java bizi yukaridaki parent (Car constructor una) a aliyor
         orada da super(), var, o da bizi yukaridaki constroctur a alir. burada ja yularidan asagiya calismaya baslar,
         o yuzde once vehicle 1,sonra Ca1 daha sonra Honda1 goruruz
         super, parenttaki constroctor i calistirmaya yarar
         Bir classta birden fazla constructor olabilir, ve bazilari parameteli olabilir soyleki
         public Vehicle(int price){
             Price
             }

             burada ,parent tan constructor lari secmeyi ogrendik
         */


    }

}
