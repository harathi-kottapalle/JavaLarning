package Conditions;

import java.util.Scanner;

public class Hacker_Rank_Q2 {
    public static void main(String[] args) {
        // write a program for triangle classifier -->
        //equal(3 angles are equal), isosacle (1 right angle) scalene(one obtuse angle),
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1");
        double side1 = sc.nextDouble();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter side1");
        double side2 = sc1.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter side1");
        double side3 = sc2.nextDouble();

        //edge cases for -10 values
        if (side1<=0 || side2<=0 ||side3<=0){
            System.out.println("invalid input");
        }else {

            if (side1 == side2 && side2 == side3 && side1 == side3) {
                System.out.println("3 agles are equal");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("1 angle is right");

            } else {
                System.out.println("scalene");
            }
        }

    }
}
