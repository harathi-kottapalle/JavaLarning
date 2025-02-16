package Task_9th_feb;

import java.util.Scanner;

public class pyramid_patern {
    public static void main(String[] args) {
        //pyramid patern

        //    *
        //   ***
        //  *****
        // *******
        //*********
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arraysize");
        int pyramid = sc.nextInt();
        for (int i = 0; i <= pyramid; i++) {
            for (int j = pyramid - i; j > 0; j--) {
                System.out.print(" ");

            }
            for (int k = 0; k <(2*i-1) ; k++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }







    }
}
