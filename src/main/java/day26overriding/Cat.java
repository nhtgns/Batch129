package day26overriding;

public class Cat extends Mammal{
    // override yapip eat methodunu kedilere uyarlamazsak Animals eat yazar.
    // Override ettik Cats eat yazdi. Daha guzel ve duzenli oldu.
    // Override edilen methodlarin orjinalleri artik obje olusturulan classlar tarafindan kullanilamaz.
    // Ama diger classlar orjinal methodu kendi classlarinda override edilmedikleri surece kullanmaya devam eder.

    // @ ile baslayan override Annotation'i denir.Ne ise yarar method tepesine koyarsaniz Java override kurallarini kontrol eder.
    // Eger kurallar ihlal edilmis ise hata verir.

    public  void meow(){
        System.out.println("Cats meow");
    }

    @Override  // Override Annotation: Override kurallarinin java tafindan kontrol edilmesini saglar
    public void eat() {  //Child daki override edilmis eat() methoduna "Overriding method" denir
        System.out.println("Cats eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    // new Cat() ==> Cat olusturduk. Cat bir Animal oldugu icin olusturdugumuz Cat'i Animal,Mammal ve car data type'ina koyabiliriz.
    @Override
    public Animal create() {
        return new  Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a+b;
    }
}

