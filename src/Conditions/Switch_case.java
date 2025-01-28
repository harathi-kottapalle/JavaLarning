package Conditions;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        //print number of days in a week
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("invalid number");
        }

        }
    }









