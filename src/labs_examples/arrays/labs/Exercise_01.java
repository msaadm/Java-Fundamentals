package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        float average = (float) sum / nums.length;

        System.out.println("The Sum of the numbers is: " + sum);
        System.out.println("The Average of the numbers is: " + average);
    }
}