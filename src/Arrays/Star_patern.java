package Arrays;

import java.util.Scanner;

public class Star_patern {
    public static void main(String[] args) {
        //patern is
        //*
        //**
        //***
        //****
        //*****
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print( "*" );

            }
            System.out.println(" ");

        }

    }
}
