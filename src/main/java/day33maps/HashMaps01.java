package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {
    public static void main(String[] args) {

    /*
        1) Map'ler "USA = 400,000,000" seklinde data depolamamiz gerktiginde kullanilir.
        2) "USA = 400,000,000" data'sinin "USA" kismi "key" olarak adlandirilir ve "key" ler "unique" dir.
        3) "USA = 400,000,000" data'sinin "400,000,000" kismi "value" olarak adlandirilir ve "value" ler "tekrarli" olabilir.
        4) Map'lerde depoladiginiz herbir data'ya "Entry" denir, "Eleman" denmez.
        5) "Entry" ler "unique" dir cunku "key" kisimlari "unique" oldugundan herbir "Entry" digerlerinden farklidir.

        6)"HashMap" cok hizlidir cunku "HashMap" ler "entry" leri siralamak ile ugrasmazlar.
        7)"HashMap"lerde bir tane "key" i "null" yapabilirsiniz.
        8)"HashMap"lerde birden fazla  "value" u "null" yapabilirsiniz.
        9)"HashMap" ler "multi thread" icin kullanilamaz ve "synchronization" yoktur.
*/
        //Maps ,sozluk gibidir
        //HashMap nasil olustururlir
        HashMap<String, Integer> hm = new HashMap<>();

        System.out.println(hm);//{}

        //HashMap lere nasil eleman eklenir
        hm.put("USA", 400000000);
        hm.put("Germany", 85000000);
        hm.put("Albania", 30000000);
        hm.put("Albania", 28000000); // en son verilen deger yazdirilir, overrid gibi,update gibi
        //ayni key i kullarak yeni bir entry eklerseniz var olanı update etmis olursunuz
        hm.put(null, 12000000);
        hm.put(null, 18000000);
        hm.put("Myanmar", null);
        hm.put("Bhutan", null);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Btuhan=null, Germany=85000000, Albania=2800000}

        //HashMap lerde sadece" key" leri almak istiyorum
        Set<String> hmKeys = hm.keySet();  // set ,tekrarsizdir o yuzden keySet methodu kullanilir
        System.out.println(hmKeys);        //[null, Myanmar, USA, Btuhan, Germany, Albania]

        //HashMap lerde sadece" value" leri almak istiyorum
        //EX 1:  Hm Map indeki ulkelerin toplam nufusunu bulunuz.
        Collection<Integer> hmValues = hm.values();

        int sum = 0;
        for (Integer w : hmValues) {
            if (w != null) {
                sum = sum + w;
            }
        }
        System.out.println(sum);//505800000  List

        //HashMap lerde belirli bir key in value sini nasil alabiliriz.
        Integer usaPopulation = hm.get("USA");
        System.out.println(usaPopulation);//400000000

        //Hashmap lerde replace methodu varolan bir key nin value sunu degistirmek icicn kullanilir
        hm.replace("Bhutan", 35);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=85000000, Albania=2800000}

        //yoksa ekle demek, putIfabsent
        hm.putIfAbsent("India", 700000000);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=85000000, Albania=2800000}

        //Example 2: Yeni ogretmenin maasi standart(10000) ucretten 1000TL fazla, eski ogretmenin maasi standart ucretten 2000TL fazla olsun.

        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("veli", 9000);
        salaries.put("Tom", 9900);

//        String teacherName = "Kemal";
//
//        salaries.putIfAbsent(teacherName, 11000);
//        salaries.put(teacherName,12000);
//
//        System.out.println(salaries);
        //        String teacherName = "Kemal";
//        if (salaries.keySet().contains(teacherName)) {
//            salaries.put(teacherName, 12000);
//        } else {
//            salaries.putIfAbsent(teacherName, 11000);
//        }
//               System.out.println(salaries);//{Tom=9900, Veli=9000, Ayse=5000, Kemal=11000, Ali=8000}
        String teacherName = "Tom";
        if (salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);
        } else {
            salaries.putIfAbsent(teacherName, 11000);
        }
        System.out.println("Tom:" + salaries);//{Tom=12000, Veli=9000, Ayse=5000, Ali=8000}

        //replace met
        hm.replace("USA", 400000000, 500000000);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=85000000, Albania=2800000, India=700000000}
        hm.replace("Bhutan", 350000, 5000000);
        System.out.println("yeni :" + hm);

        //getOrDefault() olan key'lerin degerini verir, olmayan key'ler icin de sizin ikinci parametreye yazdiginiz degeri verir
        Integer r = hm.getOrDefault("hutan", 7);
        System.out.println("hutan :" + r);//35000000

        //Map'i Set'e çevirdiğimizde Set'in bütün özelliklerini kullanabiliriz. Mesela loop gibi.
        //entrySet() methodunu kullandığınzda elde ettiğiniz Set'in elemanları "<Map.Entry<String,Integer>" şeklinde bir Map olur. Bu yüzden
        //elemanlar için Map methodları kullanılabilir.mesela loop gibi
        //entryset methodu nu kullandiginizda elde ettiginiz Set in elemanlari "Map.Entry<String, Integer> "seklindebir Map olur.
        //Bu yuzden elemanlar icin map methodlari kullanilabilir

        Set<Map.Entry<String, Integer>> myEntries = hm.entrySet(); //Map i set e cevirdik, cunku setlerin methodlarini kullandik.
        System.out.println(myEntries);//[null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=85000000, Albania=2800000, India=700000000]

        //Ex 3: Ulke ismindeki character sayisini ulke nufusuna ekleyen ve sonucu console'a yazdiran code u yaziniz
        //Normalde map lerde loop kullanilmaz ama burada set e cevirdik map i

        Set<Map.Entry<String,Integer>> myulke = hm.entrySet();

        for (Map.Entry<String, Integer> w : myulke) {
            if (w.getValue() != null && w.getKey() != null){
                Integer toplam = w.getValue() + w.getKey().length();
                System.out.println(toplam);
            }

        }



    }
}
