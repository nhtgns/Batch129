package day28exceptions;

public class Exceptions03 {
    public static void main(String[] args) {
        // .StringIndexOutOfBoundsException==>String de indeks kullanırken sınırların dısın a cıkma hatası

        String s = "Java";
        getCharFromString(s, 2);  //Asagidaki method da hangi variable lar varsa burada da paranteze onlar konur

        getCharFromString(s, 4);

    }

    //String'lerde var olmayan index'ler kullanildiginda Java StringIndexOutOfBoundsException atar.
    public static void getCharFromString(String s, int idx){ // yukarida hangi variable tanimlandiysa buraya mutlaka yazilmali

        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullanma hatasi yaptiniz..." + e.getMessage()); //Index 4 out of bounds for length 4
            System.out.println(e.getCause()); // null ,sebebini izah etmedi, sadece null dedi
            e.printStackTrace(); //handel etmeden once dev ler bu code u yazarlar, hatayi gormek isterler
        }
    }
}
