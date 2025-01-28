package Conditions;

public class exam_01 {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);

        if (age>18){
            System.out.println("you are eligible to vote");
        }
        else {
            System.out.println("not allowed to vote");

        }
    }
}
