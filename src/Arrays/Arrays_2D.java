package Arrays;

public class Arrays_2D {
    public static void main(String[] args) {
        //2d array
        int[] [] size=new int[2][2];
        size[0] [0]=1;
        size[0] [1]=2;

        size[1] [0]=1;
        size[1] [1]=2;

        for (int i = 0; i < size.length ; i++) {
            for (int j = 0; j <size[i].length; j++) {
                System.out.print(size[i] [j] +"|");

            }
            System.out.println(i);


        }

    }
}
