package if_else_programs;

import java.util.Scanner;

public class if_else01 {
    public static void main(String[] args) {
        //22)  Check if a Number is Divisible by 5 and 11
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int i=sc.nextInt();
        sc.close();
        if (i%5==0 && i%11==0) {
            System.out.println("number is divisible by both 5 and 11");
        } else if (i%5==0) {
            System.out.println("number is divisible by 5:");

        } else if (i%11==0) {

            System.out.println("number is divisible by 11:");
        }







    }
}
