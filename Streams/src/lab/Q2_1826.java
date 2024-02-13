package lab;

import java.util.Optional;

public class Q2_1826 {

    public static Optional<String> getGrade(int marks){
        Optional<String> grade = Optional.empty();
        if(marks>50){
            grade = Optional.of("PASS");
        }
        else {
            grade.of("FAIL");// Optionals are immutable!
        }
        return grade;
    }
    public static void main(String[] args) {

        /*
        Code a method public static Optional<String> getGrade(int marks) (QID 2.1826)
    a. in the method getGrade:
        i. declare an empty optional, typed for String called grade
        ii. insert the following code:
            if (marks > 50) {grade = Optional.of(“PASS”);} else {grade.of(“FAIL”);}
    b. in main():
        i. declare an Optional, typed for String named grade1 which is initialised to the return value of calling getGrade(50)
        ii. declare an Optional, typed for String named grade2 which is initialised to the return value of calling getGrade(55)
        iii. using orElse() on grade1, output the value of grade1 or “UNKNOWN”
        iv. if(grade2.isPresent()) is true: use ifPresent(Consumer) to output the contents of grade2; if false, use orElse() to output the contents of grade2 or “Empty”
        v. Notes:
            1. Optional’s are immutable.
            2. Optional.of(null); // NullPointerException
            3. Optional.ofNullable(null); // Optional.empty returned
        */



        Optional<String> grade1 = getGrade(50);// returns an empty Optional
        Optional<String> grade2 = getGrade(55);// returns "PASS" Optional
        System.out.println(grade1.orElse("UNKNOWN"));// UNKNOWN
        if(grade2.isPresent()){
            grade2.ifPresent(x->System.out.println(x));// PASS
        }else{
            System.out.println(grade2.orElse("Empty"));
        }
    }
}

