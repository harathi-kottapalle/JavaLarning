package Arrays;

public class Sum_of_Array {
    public static void main(String[] args) {
        int[] numbers={10,20,30};
        int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            sum=sum+numbers[i];


        }
        System.out.println("sum of numbers is :"+sum);
    }
}
