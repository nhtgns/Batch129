package day27encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {

        Student mystd = new Student(); //tek object olustur surekli kullan

        String stdId = mystd.getStdId();
        System.out.println(stdId);//AC123

        mystd.setGpa(4.0);
        System.out.println(mystd.getGpa()); //4.0

        Student yourstd = new Student();
        System.out.println(yourstd.getGpa()); //3.99#

        //Encapsulation faydalarindan biri de tek bir obje olusturup set methodu ile istedigimiz objeye cevirebiliriz

        /*Student 1
        System.out.println(myStd.getStdId());
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());

        //Student 2
        myStd.setStdId("TH123");
        myStd.setGpa(4.0);
        myStd.setPoor(false);*/
      //  Hocam getter encapsule edilmiş datayı getiriyor, setter bu veride değişiklik imkanı veriyor doğru mu
        //getter ve setter'larin ikisine birden "java beans" denir

    }
}
