package if_else_programs;

import java.util.Scanner;

public class if_else03 {
    public static void main(String[] args) {
        //Convert Days into Years, Months, and Days.
        //
        //       :- Take the Days Input from the User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days");
        int totalDays = sc.nextInt();
        sc.close();

        int years =totalDays /365 ;
        int remainingDays = totalDays%365;
        int months = totalDays/30;
        int days = totalDays%365;

        System.out.println(totalDays + " days = " + years + " years, " + months + " months, and " + days + " days.");

    }
}
