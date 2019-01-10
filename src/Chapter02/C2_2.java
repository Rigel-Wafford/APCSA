package Chapter02;

import java.util.Scanner;

/**
 * Calculates interest by taking in the desired balance and the interest rate
 *
 * @author Rigel W.
 */
public class C2_2 {

    /**
     * The main method
     *
     * @param args The arguments taken
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();

        double interest = balance * (interestRate / 1200);
        System.out.println("The interest is " + interest);
    }
}
