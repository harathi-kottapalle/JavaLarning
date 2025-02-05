package Fizz_Buzz;

import javax.swing.*;
import java.util.Scanner;

public class Vovels_consonants {
    public static void main(String[] args) {
        //Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        scanner.close();
        //convert string into lower case
        input = input.toLowerCase();
        //initialize counter
        int vowelCount = 0;
        int consonantCount = 0;
        //iterate to each character

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // // Step 5: Check if character is a letter (ignores numbers & special chars)
            if (Character.isLetter(ch)) ;
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ;
                vowelCount++;
            } else {
                consonantCount++;


            }
        }
        System.out.println("vowel :" + vowelCount);
        System.out.println("consonats :" + consonantCount);
    }

        



    }

