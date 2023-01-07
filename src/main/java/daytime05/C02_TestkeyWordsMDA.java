package daytime05;

public class C02_TestkeyWordsMDA {
    public static void main(String[] args) {
        /*
Interwiew Sorusu
Ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz
//10 sorumuz var
//ogrencilerin cevaplari
char[][] answers = {
{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
{'E' , 'B','E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}}; // mustafa
*
* // cevap anahtari
char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

output:
1 nolu ogrencinin dogru cevap sayisi :7
2 nolu ogrencinin dogru cevap sayisi :6
3 nolu ogrencinin dogru cevap sayisi :5
4 nolu ogrencinin dogru cevap sayisi :4
5 nolu ogrencinin dogru cevap sayisi :8
6 nolu ogrencinin dogru cevap sayisi :7
7 nolu ogrencinin dogru cevap sayisi :7
8 nolu ogrencinin dogru cevap sayisi :7*/
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E' , 'B','E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        //cevap anahtari
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        testSonucu(answers,keys);


    }//main
    private static void testSonucu(char[][]  answers, char[] keys){

        for (int i = 0; i < answers.length ; i++) {//outer loop. sifirinci ogrencinin

            int sayac= 0;
            for (int j = 0; j < answers[i].length ; j++) { //cevaplar icin

                if (answers[i][j]== keys[j]){
                    sayac++;
                }



            }//if
            System.out.println(i+1+ "nolu ogrencinin dogru cevap sayisi " + sayac);
        }//outor for

    }
}
