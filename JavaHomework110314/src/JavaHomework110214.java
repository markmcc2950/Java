import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


// Java Homework 11.02.2014

/**
 *
 * @author Mark
 */

public class JavaHomework110214
{
    public static void main(String[] args) 
    
    {

         int totalDays;               // Max number of days
         double pennies = 0.01;       // Number of Pennies
         double totalPennies = 0.01;  // Total Salary
         
         		
	// Decimal formating for salary variables
	NumberFormat tp = DecimalFormat.getInstance();
	tp.setMaximumFractionDigits(2);
         
        
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in); 
        
        {
        // Get the number of days.
        System.out.print("How many days have you worked?");
        totalDays = keyboard.nextInt();
            
        // Verify the input.
        while (totalDays < 1) 
            {
            System.out.print("The number of days must be greater than 0.\n" +
                "Re-enter the number of days: ");
                totalDays = keyboard.nextInt();
            }

        }

        // Display the report header.
        System.out.println("Day\t Pennies Earned\t   Total Income");
        System.out.println("--------------------------------------");
        
        // Display the number of days
        int days = 1;

        while (totalDays > 0){
	System.out.println(days + "        $" + tp.format(pennies) + "       " + 
                "        $" + tp.format(totalPennies));
	pennies = (days * 0.01) + 0.01;
	totalPennies += pennies;
	days++;
	totalDays--;
    }

   
    
    
   
    System.exit(0) ;
    
    }
    
    
}

