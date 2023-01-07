package day20passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {

        String name = "Tom Hanks";
        System.out.println(name);//Tom Hanks original duruyor


        String updatedName = updateName(name, "Jr"); // updateName yazarsak buraya ,asagidaki methodu cagirmis olacagiz
        System.out.println(updatedName);//Tom Hanks Jr


        name = updateName(name, "Jr");
        System.out.println(name);//Tom Hanks Jr  original de degisti



    }//main


    public static String updateName(String name, String add){ //methodumuzun adi updateName
        name = name + " " + add; // name ye add eklenecek, yani Jr eklenecek. name bura da update oluyor
        return  name;

    }
}
