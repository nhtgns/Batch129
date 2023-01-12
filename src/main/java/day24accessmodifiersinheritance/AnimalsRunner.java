package day24accessmodifiersinheritance;

import day23datetimestringbuilder.Snake;

public class AnimalsRunner {
    public static void main(String[] args) {

        Cat myCad = new Cat();
        myCad.meow();
        myCad.drink();
        myCad.eat();

        Snake yourSnake = new Snake();
        yourSnake.tiss();
        yourSnake.eat(); //protected old icin calisti
    }
}
