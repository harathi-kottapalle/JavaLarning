package Arrays;

public class Maxvalue_Interview_Question {
    public static void main(String[] args) {
        int[] array={1,8,9,5,8};
        //logic building
        //input -->int
        //output-->max value is --->9
        int maxoutput=give_max(array);
        System.out.println(maxoutput);

        int minout=give_min(array);
        System.out.println(minout);



    }
    static int give_max(int[] array){
        int max=array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>max){
                max=array[i] ;
            }

        }

        return max;
    }
       static int give_min(int[] array){
        int min=array[0];
           for (int i = 0; i <array.length; i++) {
               if (array[i]<min) {
                   min =array[i];


               }

           }


        return min;

       }

}
