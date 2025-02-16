package Task_9th_feb;

import java.util.Arrays;

public class second_smallet_number {
    public static void main(String[] args) {
        //Second smallest number  in any array
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(numbers);

        System.out.println("second smallest number is:"+numbers[1]);

        }

    }

