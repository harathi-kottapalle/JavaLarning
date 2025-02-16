package Task_9th_feb;

import java.util.Arrays;

public class sort_the_array {
    public static void main(String[] args) {
        //Sort the array → int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        //1,3,4,10,12,32,34,100
        //without using any functions.
        //Hint - compare and replace(temp)
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);

        }
    }
}
