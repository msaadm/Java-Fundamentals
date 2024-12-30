package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1-10 to search: ");
        int input = scanner.nextInt();

        if (input >= 1 && input <= 10) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == input) {
                    System.out.println("The number you search is found at index " + i);
                    break;
                }
            }
        } else {
            System.out.println("Try again, and enter number between 1-10.");
        }



    }
}