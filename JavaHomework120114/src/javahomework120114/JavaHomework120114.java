package javahomework120114;
import java.util.Scanner;

/**
 *
 * @author Mark
 * This program demonstrates the PersonalData class
 */

// I came upon strange error where only through Friends or Family input (Name),
// the code would skip the portion where it asks for the user input. The 
// result was the final output would have no input for friend or family name.
// I countered this by making a pointless variable (tN) to put before the name
// input. This skips the tN variable as it skipped the name before, and allows
// the code to function as normal.

public class JavaHomework120114
{  
    public static void main(String[] args)
    {
        String tN;              // To hold a name
        String tAd;             // To hold an address
        String tP;              // To hold a phone number
        double tAg;             // To hold an age
        String tB;              // Blank input to counter odd error
        
        // Create a scanner object
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("First let's get your personal information: \n");        
        
        // Get the personal name
        System.out.print("\nEnter your name: ");
        tN = keyboard.nextLine();
        
        // Get the personal address
        System.out.print("Enter your address: ");
        tAd = keyboard.nextLine();
        
        // Get the personal phone number
        System.out.print("Enter your phone number: ");
        tP = keyboard.nextLine();
        
        // Get the personal age
        System.out.print("Enter your age: ");
        tAg = keyboard.nextDouble();

        
        // Create an instance of the PersonalData class
        // passing the data that was entered as arguments
        // to the constructor for yourself.
        PersonalData personal = new PersonalData(tN, tAd, tP, tAg);      
     
         
        System.out.print("\nNext we'll get your friend's information:");

        // Blank input to counter odd error where it skips a line
        System.out.print(" ");
        tB = keyboard.nextLine();   
        
        // Get the friend's name
        System.out.print("\nEnter your friend's name: ");
        tN = keyboard.nextLine();
        
        // Get the friend's address
        System.out.print("Enter your friend's address: ");
        tAd = keyboard.nextLine();
        
        // Get the friend's phone number
        System.out.print("Enter your friend's phone number: ");
        tP = keyboard.nextLine();
        
        // Get the friend's age
        System.out.print("Enter your friend's age: ");
        tAg = keyboard.nextDouble();
        
        // Create an instance of the PersonalData class
        // passing the data that was entered as arguments
        // to the constructor for your friend.
        PersonalData friend = new PersonalData(tN, tAd, tP, tAg);  
        
        System.out.print("\nLast, we'll get the family's information: \n");        
      
        // Blank input to counter odd error where it skips a line
        System.out.print(" ");
        tB = keyboard.nextLine();           
        // Get the family member's name
        System.out.print("\nEnter your family member's name: ");
        tN = keyboard.nextLine();
        
        // Get the family member's address
        System.out.print("Enter your family member's address: ");
        tAd = keyboard.nextLine();
        
        // Get the family member's phone number
        System.out.print("Enter your family member's phone number: ");
        tP = keyboard.nextLine();
        
        // Get the family member's age
        System.out.print("Enter your family member's age: ");
        tAg = keyboard.nextDouble();
        
        // Create an instance of the PersonalData class
        // passing the data that was entered as arguments
        // to the constructor for your family.
        PersonalData family = new PersonalData(tN, tAd, tP, tAg);       
        
    // Results shifted left to provide proper room for organization

    // Display the data for your personal information
    System.out.println();
    System.out.println("\nHere is your personal information: ");
    System.out.println("Your name: " + personal.getName());
    System.out.println("Your address: " + personal.getAddress());
    System.out.println("Your phone #: " + personal.getPhone());
    System.out.println("Your age is: " + personal.getAge());
        
    // Display the data for your friend's information
    System.out.println();
    System.out.println("\nHere is your friend's information: ");
    System.out.println("Your friend's name: " + friend.getName());
    System.out.println("Your friend's address: " + friend.getAddress());
    System.out.println("Your friend's phone #: " + friend.getPhone());
    System.out.println("Your friend's age is: " + friend.getAge());
        
    // Display the data for your family member's information
    System.out.println();
    System.out.println("\nHere is your family member's information: ");
    System.out.println("Your family member's name: " + family.getName());
    System.out.println("Your family member's address: " + family.getAddress());
    System.out.println("Your family member's phone #: " + family.getPhone());
    System.out.println("Your family member's age is: " + family.getAge());        
    }
}    