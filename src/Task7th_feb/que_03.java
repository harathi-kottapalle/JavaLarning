package Task7th_feb;

import java.util.Scanner;

public class que_03 {
    public static void main(String[] args) {
        //Multiplication Table of a Given Number (take the input from user)
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(num+ "x" +i+ "="+(num * i));
        }
    }
}
