package Chapter02;

import java.util.Scanner;

/**
 * Calculates the cost of driving by taking in driving distance, miles per
 * gallon, and price per gallon as parameters
 *
 * @author Rigel W.
 */
public class C2_3 {

    /**
     * The main method
     *
     * @param args The arguments taken in
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double gallons = distance / milesPerGallon;
        double costOfDriving = pricePerGallon * gallons;

        System.out.println("The cost of driving is $" + costOfDriving);
    }
}
