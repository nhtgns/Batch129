package day22staticblocksconstructors;

public class StudentRunner {
    public static void main(String[] args) {

        Student std1 = new Student("Ali Can", 13, 7, "AC137", "Istanbul" );
        Student std2 = new Student("Tom Hanks", 22, "AC137" );

        System.out.println(std1);//Student{name='Ali Can', age=13, grade=7, stdId='AC137', address='Istanbul'}
        System.out.println(std2);//Student{name='Tom Hanks', age=22, grade=0, stdId='AC137', address='null'}



    }

}
