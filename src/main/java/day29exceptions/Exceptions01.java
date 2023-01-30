package day29exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

        Object obj = 78;
        String str = "";

        try {
            str = (String) obj;                           //Birbirine donusturulemeyecek data type'larini donusturmekte israr ederseniz Java "ClassCastException" atar
            System.out.println(str);                      //"Class i cast yapma hatasi" yapiliyor burada, Object class i stringe cevirerek

        }catch(ClassCastException e){
            System.out.println("Her data type'i her data type'ine cevrilmez");
        }

    }
}
