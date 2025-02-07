package if_else_programs;

import java.util.Scanner;

public class if_else05 {
    public static void main(String[] args) {
        // Find if a Person is Senior Citizen Based on Age.
        //
        //         :- take the age input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user age");
        int age = sc.nextInt();
        sc.close();

        if (age>=0 && age<=12){
            System.out.println("you are a child ");
        } else if (age>=13 && age<=19) {
            System.out.println("you are a teenager");
            
        } else if (age>=20 && age<=64) {
            System.out.println("you are a adult");
            
        } else if (age>=65) {
            System.out.println("you are senior citizen");
            
        }else {
            System.out.println("invalid age entered");
        }
    }
}
