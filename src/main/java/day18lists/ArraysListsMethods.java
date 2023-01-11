package day18lists;

public class ArraysListsMethods {
    public static void main(String[] args) {
//        .add= ekleme yapar
//        listadi.add()) şeklinde kullanılır. paranteze indeks yazılırsa o indekse ekleme yapar. yazılmazsa son indeks yapar
//
//.addAll= liste eklemesi yapar.
//        listeye çoklu ekleme yapılacaksa eklenecekler bir liste yapılır. onlar topluca eklenir.
//                listeadi.addAll() yapılır. paranteze indeks numarası konulursa o indekse listeyi ekler. olmazsa sona ekler
//
//                .toArray(): listi array'e dönüştürür.
//
//                .clear(): listeyi tamamen siler.
//
//.contains() : eleman sorgusu yapar. boolean döndürür. parantezini içine aranan eleman yazilir.
//.containsAll(): birlistede birden fazla elemanın var olup olmadığını aynı anda sorgulamak için kullanılır.
//        Boolean döndürür.
//        sorgulanacak olan elemanlar bir liste olarak oluşturulup. ContainsAll ile asıl listeden sorulacak.
//                listeAdi.containsAll(arananElemanlarınListesi);
//
//.equals() : listeadi.equals(listeadi2) şeklinde yazılır. Listelerin birebir aynı olup olmadığını test eder.
//                Collections.sort7dan sonra equals yapılırsa, farklı indekslerdeki elemanlar da sıraya gireceğinden, daha sağlıklı kontrol yapılmış olur.
//        Collections.sort(listeAdi): listeyi sort eder.
//                sort parantezi içine ilk kısma array adı yazılıp, sonra comparator'la kendimiz karşılaştırma parametreleri belirleyebiliz.
//
//
//                .size() : listenin uzunluğunu ölçer.Int verir. length'methodu gibi.
//
//                .get() : listeadi.get(indeksNumarası) şeklinde kullanılır. Verilen indeksteki elemanı getirir.
//
//.set() : listede değişiklik yapar.
//                listeAdi.set(indeksNo, "yenieleman"); verilen indeksteki elemanı verilen değerle değiştirir.
//
// .remove() : verilen indeksteki elemanı veya adı verilen elemanı kaldırır.
//        listeAdi.remove(indeksNo) = bu durumda verilen indeksteki elemanı kaldırır. Soruldğunda kaldırdığı elemanı söyler.
//        listeAdi.remove(elemanAdi) = Adı verilen elemanı kaldırır. boolean true veya fals döndürür.
//                remove'da sadece bir sayı girilirse onu otomatik olarak int index numarası olarak kabul eder.
//        List'ler int almadıkları için o sayıyı Integer olarak tanımlamak için methotlar uygulanmalıdır.(day.18.List01'de örnekler var)
//
//        remove()'da toplu silme mümkündür. addAll'da olduğu gibi toplu silinecekler bir liste yapılır. bu liste method parantezinin içine yazılır.
//        listeAdi.remove(silineceklerList);
//
//.subList() : bir listedeki bir indeksten diğerine elemanlar sorgulanır. ilk indeks dahil, ikinci dahil değil.
//        String'deki substring()'in mantığı ile aynı.
//        list döndürür. bu yüzden tanımlama yapılacaksa list olarak tanımlanmalıdır.
//
//.retainAll() : İki listenin kesişim kümesini, ortak elemanlarını verir.
//        homeGoods.retainAll(electronics) şeklinde yazılır. Bu uygulamadan sonra homeGoods'da sadece iki listenin ortak elemanları kalmış olur.
//
//        isEmpty()   : listenin boş olup olmadığını sorgulamak için kullanılır. Boolean döner.
    }
}
