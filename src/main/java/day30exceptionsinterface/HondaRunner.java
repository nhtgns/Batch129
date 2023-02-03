package day30exceptionsinterface;

public class HondaRunner {
    public static void main(String[] args) {


        Civic myCivic = new Civic();
        myCivic.cool();

        Accord myAccord = new Accord();
        myAccord.cool();
        //Methodlar object ismi ile cagrilir
        //static variable lar direkt interface  ismi ile cagrilir

        System.out.println(Ac.price);


    }
}
