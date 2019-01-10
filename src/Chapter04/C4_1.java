package Chapter04;

import java.util.Scanner;

/**
 * Returns the field of study and the college year a student is in based on a
 * letter and a number.
 *
 * @author Rigel W.
 */
public class C4_1 {

    /**
     * The main method
     *
     * @param args The arguments taken
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String word = input.next().toUpperCase();

        String output = "";
        switch (word.charAt(0)) {
            case 'M':
                output = "Mathematics";
                break;
            case 'C':
                output = "Computer Science";
                break;
            case 'I':
                output = "Information Technology";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }

        switch (word.charAt(1)) {
            case '1':
                output += " Freshman";
                break;
            case '2':
                output += " Sophomore";
                break;
            case '3':
                output += " Junior";
                break;
            case '4':
                output += " Senior";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }

        System.out.println(output);
    }
}
