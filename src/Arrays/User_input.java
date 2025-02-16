package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        //user input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int[] number =new int[size];

        for (int i = 0; i < number.length ; i++) {
            System.out.println("Enter number");
            number[i] =sc.nextInt();

        }
        Arrays.sort(number);

        for (int i = number.length-1; i >=0 ; i--) {
            System.out.println(number[i]);

        }
    }
}
