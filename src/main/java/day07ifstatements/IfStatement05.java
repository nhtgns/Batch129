package day07ifstatements;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

        // Ex 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ay ismi giriniz");
        String montName = input.next(); // stringler icin equals kullanilir ama buyuk kucuk harfleri duzelten equalsIgnorecase daha iyi
        //Ignore : gormezden gelmek demek

        if (montName.equalsIgnoreCase("Januar")){
            System.out.println(1);
        }else if (montName.equalsIgnoreCase("February")){
            System.out.println(2);
        }else if (montName.equalsIgnoreCase("March")){
            System.out.println(3);
        }else if (montName.equalsIgnoreCase("April")){
            System.out.println(4);
        }else if (montName.equalsIgnoreCase("May")){
            System.out.println(5);
        }else if (montName.equalsIgnoreCase("June")){
            System.out.println(6);
        }else if (montName.equalsIgnoreCase("July")){
            System.out.println(7);
        }else if (montName.equalsIgnoreCase("august")){
            System.out.println(8);
        }else if (montName.equalsIgnoreCase("September")){
            System.out.println(9);
        }else if (montName.equalsIgnoreCase("October")){
            System.out.println(10);
        }else if (montName.equalsIgnoreCase("November")){
            System.out.println(11);
        }else if (montName.equalsIgnoreCase("December")){
            System.out.println(12);

        }else {
            System.out.println("Invalid month name...");
        }
        /*

        Note:Stringlerin esitliklerini kontrol ederken  "==" yerine "equals()" kullaniriz,
         niye? cunku  "==" sembolu hem adrese hem de degerlere bakar, ikisi de ayni ise esittir der.
          buyuzden string karsilastirmalarinda bunu kullanmayiz,
         equals () sadece degerlere bakar ,degerler ayni ise bu iki string esittir der
        Note: Stack memory de primitive datalar depolanir ve non primitive lerin adresleri depolanir
        Note: heap memory de non primitive ler depolanir
         */
        // interviw sorusu, mantigi anla
        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom"); // bu yepyeni bir Tom
        String m =  "Tom";
        System.out.println(s==t);  //false cunku adresler ve degerler farkli
        System.out.println(s.equals(t)); // false cunku degerler farkli

        System.out.println(s==r); //false cunku adresler farkli, degerler ayni olsa da
        System.out.println(s.equals(r)); //true cunku degerler ayni

        System.out.println(s==m); // true
        System.out.println(s.equals(m));  // true
    }
}
