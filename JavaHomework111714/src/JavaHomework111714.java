import java.util.Scanner;
import java.text.DecimalFormat;


// Java Homework 11.17.2014

/**
 *
 * @author Mark
 */

public class JavaHomework111714
{
    public static void main(String[] args)    
    {
        // Get the user inputted Wholesale Price
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the item's wholesale price: $");
        double wholesale = scan.nextDouble();
        
        // Get the user inputted markup percentage
        System.out.print("Enter the percentage the item is marked up: ");
        double markup = scan.nextDouble();
        
        // Get the retail price
        double retail = calculateRetail(wholesale, markup);
        
        // Set up a decimal format
        DecimalFormat df=  new DecimalFormat("0.00");
        System.out.println("Retail price is $" + df.format(retail));
    }  
    
        // Calculate Retail
        public static double calculateRetail(double whole, double mark)
        {
            double retail;
            retail = whole + (mark / 100) * whole;
            return retail;
        }
                
    
    
}
        