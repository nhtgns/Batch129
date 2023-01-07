package daytime06;

public class Varargs03 {

    public static void main(String[] args) {

        // kac tane string verilirse verilsin iclerinden en uzun olani veren code yaziniz ( varargs kullanilir)



        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Okan";
        String str4 = "Adnan";
        String str5 = "Sahsanem";

        uzunisim (str1,str2,str3,str4,str5);
    }

    private static void uzunisim(String... str ) {

        String enUzunStr = "";
        for (String w : str) {
            if (w.length() > enUzunStr.length()) {
                enUzunStr = w;
            }
        }
        System.out.println("enUzunStr = " + enUzunStr);//Sahsanem
    }
}
