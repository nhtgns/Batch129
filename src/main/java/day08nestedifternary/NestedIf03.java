package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {

        /*
        Password'un ilk harfi buyuk harf ise
            'A' olursa 'gecerli password' yazdirin degilse "gecersiz password" yazdirin
            Alemci  ==> gecerli

            Passwordun ilk harfi kucuk harf ise
            'z' olursa 'gecerli password' yazdirin degilse 'gecersiz password' yazdirin
           zehirli ==> gecerli


        */
        Scanner input = new Scanner(System.in);
        System.out.println(" passwordunuzu girin");
        String pwd = input.nextLine();

        char firstChar = pwd.charAt(0); // burada charat () methodunu bir kez kullanip java yi rahatlattik, yoksa 6 kez kullanacaktik

        if(firstChar>='A' && firstChar<='Z'){ // 1. sart

            if(firstChar=='A'){ //1.sart 1
                System.out.println("Gecerli Password");
            }else{  //1.sart 2
                System.out.println("Gecersiz Password cunku buyuk harf ama 'A' degil...");
            }

        }else if(firstChar>='a' && firstChar<='z'){  //2. sart

            if(firstChar=='z'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz password cunku kucuk harf ama 'z' degil...");
            }

        }else{  //3. sart

            System.out.println("Ilk character harf olmali");

        }


    }
}
