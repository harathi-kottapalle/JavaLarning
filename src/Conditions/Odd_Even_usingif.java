package Conditions;

import java.util.Scanner;

public class Odd_Even_usingif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("given number is Even number");
        }else {
            System.out.println("given number is Odd number");
        }
    }

}
