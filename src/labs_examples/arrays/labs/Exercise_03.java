package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] multiplierOfthree = new int[5][5];

        for (int i = 0; i < multiplierOfthree.length; i++) {
            for (int j = 0; j < multiplierOfthree[0].length; j++) {
                multiplierOfthree[i][j] = 3 * (j + 1) + (3 * multiplierOfthree.length * i);
            }
        }

        for (int[] row : multiplierOfthree) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}
