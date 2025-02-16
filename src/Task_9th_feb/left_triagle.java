package Task_9th_feb;

import java.util.Scanner;

public class left_triagle {
    public static void main(String[] args) {
        //Left Triangle Star Pattern
        //*****
        //****
        //***
        //**
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int triagle=sc.nextInt();
        for (int i = triagle; i >=0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
