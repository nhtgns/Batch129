package loginpageApp;

//5.  user objesiyle ilgili islemler

/*Meshur Regex'ler
        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==> [aeiouAEIOU]
        x, q, w harfleri ==> [xqw]

        8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
        9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    // 6.  kullanici bilgilerini tutmak icin "List"olusturalim

    List<User>  userlist = new ArrayList<>();
    //tum methodlarda kullanicidan bilgi almak icin Scanner objesi olustur
    Scanner input = new Scanner(System.in);

    //7. username veya email ile kayitli useri getirme

    private User getUser ( String userNameOrEmail){

        for (User user : userlist) {
            if (user.getUsername().equals(userNameOrEmail)){
                return user;
            }else if (user.getEmail().equals(userNameOrEmail)){
                return user;
            }
        }
        return null;
    }
    //8.  email validation

    private static boolean validateEmail(String email){
        boolean   isValid;

        boolean isExistsSpace = email.contains(" ");
        boolean isContainsAt = email.contains("@");
        if ( isExistsSpace){
            System.out.println("Email bosluk iceremez");
            isValid = false;
        }else if (!isContainsAt){
            System.out.println(" Email @ sembolu icermelidir");
            isValid = false;
        }else {    // asd@@gmail.com -> [asd,@gmail.com
            String firstPart = email.split("@")[0];
            String secondPart = email.split("@")[1];

           boolean valid =  firstPart.replaceAll("[a-zA-Z0-9_.-]", "").isEmpty();   // isempty , true ise sikinti yok
            boolean checkStart = valid && firstPart.length()>0;

            boolean checkEnd = secondPart.equals("gmail.com") ||
                    secondPart.equals("hotmail.com") ||
                    secondPart.equals("yahoo.com");
            if ( !checkStart){
                System.out.println("Mailin kullanici adi bolumu en az bir karakter icermelidir ve " +
                       "sadece kucuk - buyuk harf , rakam veya -._ icerebilir" );

            }
            isValid = checkStart && checkEnd;
        }
        if (!isValid){
            System.out.println("Tekrar deneyiniz");
        }
        return isValid;
    }
    //9 password validation

    private static boolean validatePassword(String password){
        boolean isValid;
        boolean isExistsSpace=password.contains(" ");
        boolean isLengthGtSix=password.length()>=6;
        boolean isExistUpperLetter=password.replaceAll("[^A-Z]","").length()>0;//AS
        boolean isExistLowerLetter=password.replaceAll("[^a-z]","").length()>0;//df
        boolean isExistsDigit=password.replaceAll("[\\D]","").length()>0;//12
        boolean isExistsSymbol=password.replaceAll("[\\P{Punct}]","").length()>0;
        if(isExistsSpace){
            System.out.println("Şifre boşluk içeremez.");
        }else if(!isLengthGtSix){
            System.out.println("Şifre en az 6 karakter içermelidir.");
        } else if (!isExistUpperLetter) {
            System.out.println("Şifre en az 1 tane büyük harf içermelidir.");
        } else if (!isExistLowerLetter) {
            System.out.println("Şifre en az 1 tane küçük harf içermelidir.");
        } else if(!isExistsDigit){
            System.out.println("Şifre en az 1 tane rakam içermelidir.");
        } else if (!isExistsSymbol) {
            System.out.println("Şifre en az 1 tane sembol içermelidir.");
        }
        isValid=!isExistsSpace && isLengthGtSix && isExistUpperLetter && isExistLowerLetter && isExistsDigit && isExistsSymbol;
        if (!isValid){
            System.out.println("Geçersiz şifre, tekrar deneyiniz.");
        }
        return isValid;
    }
    public void register(){
        System.out.println("Ad Soyad");
        String name= input.nextLine();

        //10  username unigue / essiz olmali
        String username=getUserName();

    }

    //11 kullanicidan username alma

    private String getUserName() {
       String username ;
       boolean existsUsername;
        do {
            System.out.println("Kullanıcı adı giriniz:");
            username = input.next();
            existsUsername=getUser(username)!=null;
            if (existsUsername){
                System.out.println("Bu username kullanılmış,farklı bir username deneyiniz.");
            }
        }while(existsUsername);
        return username;
    }
    }



