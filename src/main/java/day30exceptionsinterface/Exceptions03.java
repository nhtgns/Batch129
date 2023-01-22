package day30exceptionsinterface;

public class Exceptions03 {
    public static void main(String[] args) {
//Urettigimiz exception'i compile time exception olmasini istiyorsak parent'i exception yap.
//Urettigimiz exception'i run time exception olmasini istiyorsak parent'i RunTimeException yap


getstudentGrade(888);
getTheNumberOfstudents(-344);

    }
    public static void getstudentGrade (int grade){
        if (grade <0 || grade > 100){
            try {
                throw new InvalidStudentGradeException("Student is grades cannot be less than zero or greater than 100");
            } catch (InvalidStudentGradeException e) {
                System.out.println(e.getMessage());
            }

        }else {
            System.out.println(grade);
        }
    }
    public static void getTheNumberOfstudents (int numOfStudents){
        if (numOfStudents<0){
            try {
                throw new InvalidNumberException("Student number cannot be negative");
            }catch (InvalidNumberException e){
                System.out.println(e.getMessage());
            }

        }else {
            System.out.println(numOfStudents);
        }
    }
}


