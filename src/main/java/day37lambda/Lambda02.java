package day37lambda;

import day36lambda.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) throws IOException {

    /*
            AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
                     herhangi bir elemanla eşleşme durumunda true dönecektir.


            AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
                      bu şarta uyması durumunda true dönecektir.


            NoneMatch: Sarta göre Stream içindeki hiç bir
                       elemanın şartı sağlamaması durumunda true dönecektir.
     */


        //1 Lambdatextfile dosyasi icindeki metni konsola yazdiran kodu yaziniz
                                                                                //forEach, herbir demek
        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);

        //2 Lambdatextfile dosyasi icindeki her karakteri "uppercase" yapiniz
        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).map(String::toUpperCase).forEach(Utils::printInTheSameLineWithSpace);

        //3  Lambdatextfile dosyasi icinde herhangi bir kelimenin var olup olmadigini gosteren kodu yaziniz
        boolean result1 = Files.
             lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
             map(t -> t.split(" ")).
             flatMap(Arrays::stream). // array leri parcaladi ,herseyi dumduz yapti. flatMap , stream lerde calisir, colletion larda degil
             anyMatch(t->t.contains("Java")); //herhangi "java "ise sonuc "true" olur
        System.out.println(result1);


        //4 Lambdatextfile dosyasi icinde herhangi her kelimenin a harrfini icerip icermedigini gosteren kodu yaziniz
        boolean result2 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream). // array leri parcaladi ,herseyi dumduz yapti. flatMap , stream lerde calisir, colletion larda degil
                        allMatch(t->t.contains("a")); //her kelime "a" harfini icerirse sonuc "true", aksi halde "false" olur
        System.out.println(result2);

        //5 Lambdatextfile dosyasi icindeki hicher kelimenin x harrfini icermedigini gosteren kodu yaziniz
        boolean result3 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                noneMatch(t->t.contains("x")); //noneMatch , belirtilen karakter hic yoksa sonucu "true" verir
        System.out.println(result3);

        //6 : Lambdatextfile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz
        long result4 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.endsWith("r")).count();
        System.out.println(result4);   //3 tane var

        // 2. yol
        long result5 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.endsWith("r")).
               collect(Collectors.toList()).size();
        System.out.println(result5);   //3 tane var
    }
}
