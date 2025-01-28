package Conditions;

import java.util.Scanner;

public class scanner_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age= sc.nextInt();

        if (age>18){
            System.out.println("you are eligible to vote");
        }else {
            System.out.println("not eligible to vote");
        }
    }
}
