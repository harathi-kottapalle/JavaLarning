package Task7th_feb;

import java.util.Scanner;

public class factorial_of_number {
    public static void main(String[] args) {
        //Factorial of a Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num =sc.nextInt();
        sc.close();
        long factorial =1;
        for (int i=1; i<=num; i++){
            factorial*=i;
        }
        System.out.println("factorial of "+num+ "is :" +factorial);
    }
}
