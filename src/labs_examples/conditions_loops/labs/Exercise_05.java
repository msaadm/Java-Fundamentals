package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 * <p>
 * Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 * of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 * Print the results to the console.
 * <p>
 * For example, if a user enters 1 and 100, the output should be:
 * <p>
 * The sum is: 5050
 * The average is: 50.5
 */

public class Exercise_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int min = scanner.nextInt();

        System.out.print("Enter the upper bound: ");
        int max = scanner.nextInt();

        int sum = 0;
        int count = 0;
        float avg = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
            count++;
        }

        avg = (float) sum / count;

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + avg);
    }

}
