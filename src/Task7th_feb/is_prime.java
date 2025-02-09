package Task7th_feb;

import java.util.Scanner;

public class is_prime {
    public static void main(String[] args) {
        //Check if a Number is Prime
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();
        sc.close();

        boolean isprime=true;
        if (num<=1){
            isprime=false;
        }else {
            for (int i=2; i<=num/2; i++){
                if (num%i==0){
                    isprime=false;
                }

            }
        }if (isprime) {
        System.out.println(num + " is a Prime number.");
    } else {
        System.out.println(num + " is NOT a Prime number.");
    }


    }
}
