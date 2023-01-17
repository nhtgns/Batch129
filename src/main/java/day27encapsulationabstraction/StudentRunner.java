package day27encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {
        //Normalde object leri kullanarak variable lera ulasabiliririz

        Student mystd = new Student(); //tek object olustur surekli kullan

        String stdId = mystd.getStdId();
        System.out.println(stdId);//AC123

        mystd.setGpa(4.0); //burada data degistirildi, 3.99 idi , 4.0 oldu, sonra getGpa ile data cagrildi, ve yeni data 4,0 goruldu
        System.out.println(mystd.getGpa()); //4.0, biz burada object deki datayi degistirdik, asil 3.99 duruyor

        Student yourstd = new Student();// burada 3,99 aliriz cunku bu yeni object, bu object de deger eski ozellikten gelir
        System.out.println(yourstd.getGpa()); //3.99#

        //Encapsulation faydalarindan biri de tek bir obje olusturup set methodu ile istedigimiz objeye cevirebiliriz.


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
