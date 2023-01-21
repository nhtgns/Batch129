package day29exceptionssh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) throws IOException {
        /*
        "FileNotFoundExceptions"

        --Javada bir dataya ulasmak istedigimizde kullaniriz, bir object olustururuz. cesitli methodlari vardir
        --read() methodu Tas teki datalari getirp okuyor, okuyacak bir sey yoksa -1 gosterir.
        --skip() methodu da bir kismi atlayip kaalan datalarii döndurur
        --available() methodu
        //6/FilenotFoundExceptions oluşturulmamış yada olusmus bir
       // dosyaya erişim istendiğinde aldığımız hata

       **neden java adrese gidemez?
       __dosya silinmis olabilir
       --dosya yolu yanlistir

*/
        FileInputStream fis = new FileInputStream("src/main/java/day29exceptionssh/TaskExceptions");

        int i;

        try{
            while ((i = fis.read()) != -1){                //okunacak dosya kalmamasidir -1,  fis.read () methodu ,herseyi getirir, gosterir
                System.out.print((char) i);  //burada bize char i , harfleri resim olarak verdi sayi olarak degil
            }
        }catch (FileNotFoundException e){
            System.out.println("Dosya yolu yanlis ya da dasya silinmis");
            e.printStackTrace();
        }catch ( IOException e){ // IOException babadir, parent. digerleri cocuk
            System.out.println("Dosya okurken problem olustu : " + e.getMessage());

        }
        System.out.println("yola devam ediyoruz");
    }
}
