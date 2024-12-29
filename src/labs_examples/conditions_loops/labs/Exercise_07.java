package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 * <p>
 * Take in a word from the user and using a "while" loop, find the first vowel in the word.
 * Once you find the vowel, print out the word and the first vowel.
 * <p>
 * Hints:
 * - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 * - you'll likely want to use a String that contains all the vowels:
 * - ie: String vowels = "aeiou";
 */

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");

        String word = scanner.next();
        String vowels = "aeiou";

        for (int i = 0; i < word.length(); i++) {
            int foundAt = vowels.indexOf(word.toLowerCase().charAt(i));

            if (foundAt != -1) {
                System.out.println("Your input word is: " + word);
                System.out.println("First vowel in your input word is: " + vowels.charAt(foundAt));
                break;
            }
        }

    }

}
