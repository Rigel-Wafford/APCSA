package Chapter04;

import java.util.Scanner;

/**
 * Determines whether the first string entered is a substring of the second
 * string entered
 *
 * @author Rigel W.
 */
public class C4_2 {

    /**
     * The main method
     *
     * @param args The arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = input.next();
        System.out.print("Enter string s2: ");
        String s2 = input.next();

        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
