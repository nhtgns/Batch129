package day37lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>(); // burada kurslari list e eklemis olduk
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //1) tum averageScore  larin 91 den buyuk olup olmadigini kontol eden kodu yaziniz

      boolean result1 =  coursesList.stream().allMatch(t->t.getAverageScore()>91);
        System.out.println(result1);  //true

        // Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz
       boolean result2 =  coursesList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result2); //true

        //3 .Average score ' u en yuksek olan kursun ismini konsola yazdiran kodu yaziniz
       String name1 = coursesList.stream().
               sorted(Comparator.comparing(Course::getAverageScore).reversed()). // reversed, elemanlari teers siralar
               findFirst().  // ilk elemani aldi
               get().
               getCourseName(); // kurs ismini getirme methodu

        System.out.println(name1);   //Turkish Night

        //4 Tum course object lerini average score a  gore kucukten buyuge diziniz ve ilk ikisi haric liste halinde console a yazdiriniz

       List<Course> myList =  coursesList.stream().
                                sorted(Comparator.comparing(Course::getAverageScore)).
                                skip(2). // ilk iki elemani gormezden geldi, consola yazdirmadi
                                 collect(Collectors.toList());
        System.out.println(myList);//[Course: Season=Summer, courseName=Turkish Day, averageScore=97, numberOfStudents=128,
                                   // Course: Season=Winter, courseName=Turkish Night, averageScore=98, numberOfStudents=154]

        //5 Tum course object lerini average score a  gore kucukten buyuge diziniz ve ilk ucunu  liste halinde console a yazdiriniz
        List<Course> yourList = coursesList.stream().
                sorted(Comparator.comparing(Course::getAverageScore)). // sayilari kucukten buyuge siraladi
                limit(3).  //Ilk uc elemani aldi
                collect(Collectors.toList());  // List e cevirdi, ilk uc kursu verdi

        //6 Tum course object lerini average score a  gore kucukten buyuge diziniz ve ucuncuyu console a yazdiriniz
        Course result5 = coursesList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).limit(1).findFirst().get();
        System.out.println(result5); //3. elemani verdi. Course: Season=Summer, courseName=Turkish Day, averageScore=97, numberOfStudents=128
    }
}
