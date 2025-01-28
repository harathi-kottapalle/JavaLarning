package Conditions;

import java.util.Scanner;
import java.util.Scanner;

public class if_elseif_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int num1=sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter number1");
        int num2= sc1.nextInt();

        if (num1>num2){
            System.out.println("num1");
        } else if (num2>num1) {
            System.out.println("num2");
        }else {
            System.out.println("equal");
        }

        }
    }


