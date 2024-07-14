package javahomework120214;
import java.util.Scanner;

/**
 *
 * @author Mark
 This program demonstrates the RetailItem class
 */


public class JavaHomework120214
{  
    public static void main(String[] args)
    {
        String testDesc;                // To hold a name
        int testUnits;                  // To hold the number of units
        double testPrice;               // To hold the price
        
        // Create a scanner object
        Scanner keyboard = new Scanner(System.in);     
        
        // Item 1's description
        testDesc = "Jacket";
        
        // Item 1's # of units
        testUnits = 12;
        
        // Item 1's price
        testPrice = 59.95;

        
        // Create an instance of the RetailItem class
        // passing the data that was entered as arguments
        // to the constructor for yourself.
        RetailItem one = new RetailItem(testDesc, testUnits, testPrice);      
     
         
        // Item 2's description
        testDesc = "Designer Jeans";
        
        // Item 2's # of units
        testUnits = 40;
        
        // Item 2's price
        testPrice = 34.95;
        
        // Create an instance of the RetailItem class
        // passing the data that was entered as arguments
        // to the constructor for your friend.
        RetailItem two = new RetailItem(testDesc, testUnits, testPrice);  
        
        // Item 3's description
        testDesc = "Short";
        
        // Item 3's # of units
        testUnits = 20;
        
        // Item 3's price
        testPrice = 24.95;
        
        // Create an instance of the RetailItem class
        // passing the data that was entered as arguments
        // to the constructor for your friend.
        RetailItem three = new RetailItem(testDesc, testUnits, testPrice);       

        // Display the data for item 1
        System.out.println();
        System.out.println("\nHere's item 1's information: ");
        System.out.println("Item 1's Description: " + one.getDesc());
        System.out.println("Item 1's Units on Hand : " + one.getUnits());
        System.out.println("Item 1's Price: $" + one.getPrice());
        
        // Display the data for item 2
        System.out.println();
        System.out.println("\nHere's item 2's information: ");
        System.out.println("Item 2's Description: " + two.getDesc());
        System.out.println("Item 2's Units on Hand : " + two.getUnits());
        System.out.println("Item 2's Price: $" + two.getPrice());
        
        // Display the data for item 1
        System.out.println();
        System.out.println("\nHere's item 3's information: ");
        System.out.println("Item 3's Description: " + three.getDesc());
        System.out.println("Item 3's Units on Hand : " + three.getUnits());
        System.out.println("Item 3's Price: $" + three.getPrice());      
    }
}    