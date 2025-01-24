package Ternaryoperators;

public class Age_classification {
    public static void main(String[] args) {
        //print different ages like major,minor and senior//
        // <18 =minor, >18major, >65
        int age=15;

        String result = (age<18)? "minor" :((age>65)? "senior":"major");
        System.out.println("person is:" +result);
    }
}
