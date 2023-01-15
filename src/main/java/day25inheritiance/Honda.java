package day25inheritiance;



public class Honda extends Car {
        public int price = 10000; //buraki variable  price = 10000  dir
    public void engine(){ // bu bir method
        System.out.println("Honda engine");
    }
    public Honda(){
                         //burada, super ( "Accord"); yazarak ,parent a git parametresi string olani kullan dedik,burayi sonradan yazdik
            //this.price           //burada ,yukarida hangi constructor a gitmek istiyorsak onun constructor ozelligini super() in icine yazariz
                               //ornegin parametresi "string "accord"" ise yukaridaki constructor in, biz daha asgida iken string bir deger gireriz super() a
        System.out.println("Honda 1");
    }

    public Honda(String model, int year){

      //  super();// buraya super(); yazmasak da burasi yukaridaki parametresiz constructor a gider

        System.out.println("Honda 2: " + model + " - " + year);


        //  method çağırırken constructora bakıcaz ====== variable çağırırken data type'ına bakıcaz
        // Siz bir honda object i olusturdugunuzda ,java constructor u en yukaridan calistirmaya baslar
    }
}
