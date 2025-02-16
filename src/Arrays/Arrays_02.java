package Arrays;

import java.util.Arrays;

public class Arrays_02 {
    public static void main(String[] args) {
        //alternative method
        int[] numbers= {10,3,2,8,5,3};
        Arrays.sort(numbers);
        //System.out.println("first element is :" +numbers[3]);
       // for (int i = 0; i <numbers.length; i++) {
         //   System.out.println("Element at Index " +i+ "is :" +numbers[i]);

        //}
        for (int i:numbers){       //using for each loop
            System.out.println(i);
        }


    }
}
