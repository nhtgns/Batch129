package day30exceptionsinterface;

public class  Accord implements Ac,Engine,Security{

    @Override
    public void cool() {
        System.out.println("Accord cools super...");
    }

    @Override
    public void run() {
        System.out.println("Engine runs super...");

    }

    @Override
    public void guvenlik() {
        System.out.println("Guvenlik onceligimiz");
    }

    @Override
    public void saglamlik() {

    }
}
