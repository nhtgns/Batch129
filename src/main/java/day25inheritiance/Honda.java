package day25inheritiance;



public class Honda extends Car {

    public  int price = 10000;
    public  void engine (){

        System.out.println("Vehicle engine");
    }

    public Honda(){


        System.out.println("Honda 1");
    }

    public Honda(String model, int year){

        System.out.println("Honda 2: " + model + " - " + year);
      //  method çağırırken constructora bakıcaz ====== variable çağırırken data type'ına bakıcaz
    }
}
