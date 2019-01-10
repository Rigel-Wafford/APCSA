package Chapter02;

import java.util.Scanner;

/**
 * Calculates the average acceleration by taking in two velocities and a time
 * (in seconds)
 *
 * @author Rigel W.
 */
public class C2_1 {

    /**
     * Main method
     *
     * @param args The arguments taken in
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t:");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double accelaration = (v1 - v0) / t;
        System.out.println("The average accelaration is " + accelaration);
    }
}
