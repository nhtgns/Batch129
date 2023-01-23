package day24accessmodifiersinheritance;

public class Cat extends Animal { // Cat i Animal in cocugu ypptik extends sayesinde, cat animal in cocugudur dedik
    public  void meow (){  // default constructor lar nerede bulunur? Object te bulunur. herkesin atasi

        System.out.println("Cats meow..."); // genereit ile otomatik override yapalim
    }

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }
}
