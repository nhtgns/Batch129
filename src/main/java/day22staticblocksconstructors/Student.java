package day22staticblocksconstructors;

public class Student {

    String name; //ades atamsi yapmiyorum ,initialize yapmiyorum
    int age;
    int grade;
    String stdId;
    String address;

    //intelije e otmatik constructor yaptiriyouz, sag tikla generate ve constroctor
    public Student(String name, int age, int grade, String stdId, String address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stdId = stdId;
        this.address = address;
    }

    public Student(String name, int age, String stdId) { //daha az ozellik iceren constroctor
                                                            // yine otom
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }


    @Override
    public String toString() { //yaptiklarimizi yazdirmak icin de otomatik tostring ile sout olusturulur
                            //sag tikla generate ve istenilenleri sec ve sout olustu
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", stdId='" + stdId + '\'' +
                ", address='" + address + '\'' +
                '}';
    } // class olustu, simdi runner
}
