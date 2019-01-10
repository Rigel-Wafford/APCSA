package Chapter02;

import java.util.Scanner;

/**
 * Calculates the price, tax, tip, and the total cost of a meal by taking in the
 * cost of the main meal, the drink, and the desert.
 *
 * @author Rigel W.
 */
public class P2 {

    /**
     * The main method
     *
     * @param args The arguments taken in
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the meal: $");
        double meal = input.nextDouble();
        System.out.print("Enter the price of the drink: $");
        double drink = input.nextDouble();
        System.out.print("Enter the price of the dessert: $");
        double dessert = input.nextDouble();

        double foodPrice = meal + drink + dessert;
        double salesTax = 0.10 * foodPrice;
        double tip = 0.15 * (foodPrice + salesTax);
        double totalCost = foodPrice + salesTax + tip;

        System.out.println("Price of food: $" + foodPrice);
        System.out.println("Sales tax: $" + salesTax);
        System.out.println("Tip: $" + tip);
        System.out.println("Total cost: $" + totalCost);
    }
}
