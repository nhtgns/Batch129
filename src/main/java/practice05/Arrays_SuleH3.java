package practice05;

public class Arrays_SuleH3 {
    public static void main(String[] args) {

        String arr[][] = {{"Eser"}, {"Kenan", "Oya", "Gulsen"}, {"Yeliz", "Selim"}};
        System.out.println(m(arr));
    }//main
    public static String m(String[][] arr) {

        int r, c;   //  String arr[][] = [["Ali", "Eser"], ["Kenan", "Oya", "Gulsen"], ["Yeliz", "Selim"]]
        //r ve surekli ozellik degistirdigi icin tek bir deger atanmadi burada, ortak noktasi int olmasi

        String i, k = ""; // burada deger atandi ,"hiclik", burada string deger

        for (r = 0;   r < arr.length ;  r++) {

            for (c = 0;    c < arr[0].length; c++) {

                i = arr[r][c];

                if (i.length()> k.length())

                    k = i;
            }
        }
        return k; // kenan olur en son
    }
}
