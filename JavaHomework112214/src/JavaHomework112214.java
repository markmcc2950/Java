import java.util.Scanner;
import java.text.DecimalFormat;


// Java Homework 11.22.2014

/**
 *
 * @author Mark
 */

public class JavaHomework112214
{
        static int rooms;                     // Total rooms
        static double volume;                 // Square footage per room
        static double price;                  // Total price per gallon of paint
        
        
    public static void main(String[] args)    
    {
        double time = 0.00;                   // Hours of labor spent
        double work = 0.00;                   // Charge of labor
        double totalCost = 0.00;              // Total job cost
        double paint = 0.00;                  // Cost of paint job
        double gallons = 0.00;                // Amount of gallons of paint used
        
        // Create a scanner object
        Scanner scan = new Scanner(System.in);
        
        // Get the user inputted rooms to paint
        while (rooms < 1 || price < 1 || volume < 1)
        {
        System.out.print("[Please note that the number entered must be " +
                        "greater than one.] \nHow many rooms would " +
                        "you like to paint: ");
        rooms = scan.nextInt();

        // Get the user inputted square footage per room
        System.out.print("[Please note that the number entered must be " +
                        "greater than one.] \nWhat is the square footage " +
                        "of each room: ");
        volume = scan.nextInt();  
        
        // Get the user inputted price per gallon of paint
        System.out.print("[Please note that the number entered must be " +
                        "greater than one.] \nWhat is the total cost for " +
                        "each gallon of paint: ");
        price = scan.nextInt();                 
        }
        
        gallons = (volume / 115.00);        // Gallons of paint
        time = (volume * 8) / 115.00;       // Labor time        
        work = time * 18;                   // Labor cost        
        paint = (volume * price) / 115.00;  // Cost of paint job
        totalCost = work + paint;         // Total cost of job
        
        // Set up a decimal format
        DecimalFormat df=  new DecimalFormat("0.00");

        
        
    System.out.println("\nYou require the following: \n" + df.format(gallons) + 
            " gallons of paint.\n" + df.format(time) + " hours of labor." +
            "\n$" + df.format(work) + " dollars to pay for labor." +
            "\n$" + df.format(paint) + " to pay for the paint." +
            "\n\nThe overall required cost will be $" + df.format(totalCost));

    
    // In case one of the original numbers has a zero inputted
        }
    public static void rooms() 
            {
        Scanner input = new Scanner(System.in);
        System.out.println("How many rooms would you like to paint?");
        rooms    = input.nextInt();

    }  
    public static void volume() 
            {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the square footage of each room?");
        volume = input.nextInt();

    }  
    public static void price() 
            {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the total cost for each gallon of paint?");
        price = input.nextInt();

    }         
                
    
    
}
        