package Arrays;

import java.util.Arrays;

public class interview_question {
    public static void main(String[] args) {
        // Find Second Largest Number in an Array
        int[] numbers={9,6,4,2,5};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-1]);//first last number
        System.out.println(numbers[numbers.length-2]);//second largest number
        System.out.println(numbers[numbers.length-3]);
    }

}
