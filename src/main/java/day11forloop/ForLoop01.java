package day11forloop;

public class ForLoop01 {
    public static void main(String[] args) {

//        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
//        //           "I love Java" ==> "I love J"
//        //loop kullanalim
//        String s = "Tramvay";
//
//        for(int i=0; i<s.length(); i++){
//
//            char ch = s.charAt(i); // burada ch diyerek yeni bir klasor olusturdum ,istedigim harfler bunun icine yazilacak
//
//            if(ch=='a'){
//                break;
//            }
//            System.out.print(ch);
//        }
//
//        System.out.println();
//
//        //Example 2: Verilen bir String'de son 'a' dan sonraki tum character'leri ters sirada yazdiriniz
//        //           "Germany" ==> yn
//
//        String t = "Germany";
//
//        for(int i=t.length()-1; i>=0; i--){
//            char ch = t.charAt(i);
//            if(ch=='a'){
//                break;
//            }
//            System.out.print(ch);
//        }

        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1 == str2);

        String str3 = "java";
        String str4 = "Java";
        System.out.println(str1.equals(str2));

    }

}
