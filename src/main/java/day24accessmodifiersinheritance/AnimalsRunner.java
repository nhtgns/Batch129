package day24accessmodifiersinheritance;

import day23datetimestringbuilder.Snake;

public class AnimalsRunner {
    public static void main(String[] args) {

        Cat myCad = new Cat(); //cat object i olusturduk
        myCad.meow();   //       Cats meow...       bu cat class indan geldi
        myCad.drink();  //      Animals drink...    bu animals class tan geldi
        myCad.eat();    //      Animals eat...      bu animals class tan geldi

        Snake yourSnake = new Snake();
        yourSnake.tiss();
        yourSnake.eat(); //protected old icin calisti
    }
}
