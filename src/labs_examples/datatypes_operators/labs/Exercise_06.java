package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        float pi = 3.14f;
        float r = 3.14f;
        float h = 5f;

        float volume = (2 * pi * r * h) + (2 * pi * r * r);

        System.out.println("Volume of a cylinder with radius: " + r + " and height: " + h + " is " + volume);

    }
}