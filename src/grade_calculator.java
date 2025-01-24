public class grade_calculator {


    public static void main(String[] args) {
        //Write a program that calculates and
        //displays the letter grade for a given numerical score
        // (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100 //B: 80-89 //C: 70-79 //D: 60-69 //F: 0-59
       // int A=90-100;
        //int B= 80-89;
        //int C =70-79;
        //int D = 60-69;
        //int F= 0-59;
        //int result = (A>90)? 'A';
        int score = 90;
        String grade = (score>=90)? "A": (score>80)? "B" : (score>70)? "C":(score>60)? "D":"F" ;
        System.out.println("gade is :"+grade);

    }
}
