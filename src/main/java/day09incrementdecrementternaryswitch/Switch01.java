package day09incrementdecrementternaryswitch;

public class Switch01 {
    public static void main(String[] args) {

        // Ex 1 : gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaz

        //1.yol: if else ile
        String dayName = "Tuesday";
        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("tuesday")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        }else {
            System.out.println(" lutfen gecerli bir gun ismi giriniz");
        }

        //2.YOL:Switch : degis demek. bir duruma gore bir is yapmak, baska bir duruma gore baska bir is yapmak demek
        switch (dayName.toLowerCase()){ // hey java , dayname nin degeri ne ise ona gore degis ,diyorum

            case "sunday":              // case: durum demek.  toLowerCase ile harflerin tamami kucuk oldu
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednesday":
                System.out.println(4);
                break;
            case "thurday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Lutfen gecerli bir gun ismi giriniz");
                //note: break yazilmazsa bir sonraki gunu de yazdirir,o zaman yanlis olur. ne zaman kullanilmaz,
                // oglunuza dediniz ki pazarda sonraki 2 gunun adini soyle dediniz , o siralar ptesi sali.
        }
    }

}
