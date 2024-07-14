package javahomework052815palindrome;
import java.util.Scanner;

/**
 *
 * @author Mark
 */

public class JavaHomework052815Palindrome
{
     // Main program that takes user input
    public static void main(String[]args)
    {
        // Initiates the scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Asks user input for the word to check
        System.out.println("Type in the potential palindrome: ");
        
        // Set the 'palindrome' string to the user input
        String palindrome = scanner.nextLine();
        
        // Checks to see if the word is a palindrome based off the boolean
        if(truePal(palindrome))
            System.out.println("Congratulations! " +palindrome + " is a " +
                               "palindrome!");
        else
            System.out.println("Ouch, better luck next time! " + palindrome + 
                               " is not a valid palindrome!");
    }
    
    public static boolean truePal(String check)
    {
        // If the length is zero or one, then it is a palindrome
        if(check.length() == 0 || check.length() == 1)
            return true; 
        
        // Checks to see the opposite letters match, one at a time
        if(check.charAt(0) == check.charAt(check.length()-1))
            return truePal(check.substring(1, check.length()-1));

        return false;
    }    
}