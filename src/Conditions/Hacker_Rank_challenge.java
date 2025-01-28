package Conditions;
import java.util.Scanner;
public class Hacker_Rank_challenge {
    public static void main(String[] args) {
        // grade calculator program using if-elseif-else conditions
        Scanner sc = new Scanner(System.in);
        System.out.println("score");
        int score= sc.nextInt();
        char grade ='F';
        if (score>=90 && score<=100){
            grade ='A';
        } else if (score>=80 && score<=89) {
            grade ='B';

        }else if (score>=70 && score<=79) {
            grade ='c';

        }else if (score>=60 && score<=69) {
            grade ='D';

        } else if (score<=0 || score>100) {
            grade='o';
            System.out.println("not mentioned in a grade");

        } else {
            grade ='F';
        }

        System.out.println("grade is :" +grade);
        sc.close();
    }
}
