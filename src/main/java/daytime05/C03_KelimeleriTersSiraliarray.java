package daytime05;

import java.util.Arrays;

public class C03_KelimeleriTersSiraliarray {
    public static void main(String[] args) {
        /*
        Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
            Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
            tersine çevirmek için kod yazınız.
            Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
            Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
*/
        String str = "  Kemal Can Kuzu  ";
        String arr[] = str.split(" "); // array e donustu string
        System.out.println(Arrays.toString(arr));//[, , Kemal, Can, Kuzu]

        String tersstr = ""; //bunu sonuc icin olusturduk

        for (int i = arr.length - 1; i >= 0; i--) {
            tersstr += arr[i] + " ";

        }
        System.out.print("trim basta ise yaradi mi?");
        System.out.print(tersstr);
        System.out.println("trim sonda ise yaradi mi");

        System.out.print("trim basta ise yaradi mi");
        System.out.print(tersstr.trim());  //Kuzu Can Kemal
        System.out.println("trim sonda ise yaradi mi");
    }
}
