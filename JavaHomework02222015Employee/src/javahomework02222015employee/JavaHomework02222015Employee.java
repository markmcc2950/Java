package javahomework02222015employee;
import java.util.Scanner;

/**
 *
 * @author Mark
 */

public class JavaHomework02222015Employee 
{
    // Main class
    public static void main(String[] args) 
    {
        String name;            // The employee's name
        String number;          // The employee's number
        String date;            // The employee's hire date
        int shift;              // The employee's shift (1 or 2)
        double pay = 0.00;       // The employee's pay per hour
        
        
        // Initiate a scanner
        Scanner keyboard = new Scanner(System.in);
        
        
        // Get the employee's name
        System.out.println("Please enter the employee's name:");
        name = keyboard.nextLine();
        
        // Get the employee's number
        System.out.println("The employee number must be in the format of " +
                "'###-X'. The letter in place of X must be between A and M." +
                "\nExample: 012-A.\n\nPlease enter the employee's number in " +
                "format '###-X':");
        
        number = keyboard.nextLine();
        
        // Loop check to make sure employee number is in proper format
        while(isValidNum(number) == false)
        {
            if (isValidNum(number) == true)
            {          
                number = keyboard.nextLine();
            }
            else if (isValidNum(number) == false)
            {
                System.out.println("Error: Employee number is invalid." +
                          "\nPlease enter the employee's number again:");
                number = keyboard.nextLine();   
            }
        }
        
        // Get the employee's date of hire
        System.out.println("Please enter the day the employee was hired:");
        date = keyboard.nextLine();
        
        // Get the employee's shift number; 1 (day) or 2 (night)
        System.out.println("A daytime shift is 1, while a night time shift is" +
                             " 2.\nPlease enter the employee's shift number:");
        shift = keyboard.nextInt();
        
        // Loop check to make sure the shift is ONLY 1 or 2
        while (shift < 1 || shift > 2)
        {
            System.out.println("Error, shift must be 1 (day) or 2 (night).");
            System.out.println("Please enter the employee's shift number:");
            shift = keyboard.nextInt();
        }
        
        // Get the employee's hourly pay rate
        System.out.println("Please enter the employee's hourly rate of pay:");
        pay = keyboard.nextDouble();

        // Use information stored in ProductionWorker class to use variables
        ProductionWorker work = new ProductionWorker(name,number,date,shift,pay);

        // Prints out the results stored in the ProductionWorker class
        System.out.println(work);
        System.exit(0);
    }
    
    
    
    
    // Boolean to test is employee number is valid
    private static boolean isValidNum(String number)
    {
        boolean status = false;
        
        // Checks to make sure employee number is only 5 characters long
        if (number.length() < 5 || number.length() > 5)
        {
            status = false;
        }
        
        /**
         *  This section checks to make sure that:
         *      - The first 3 characters are digits only
         *      - The 4th character is a hyphen
         *      - The 5th character is a letter, and that it's only letters
         *        between 'A' and 'M'. 
         * 
         *        I'm not sure if there's an easier way
         *        to check a selection of letters beyond typing them all out
         *        individually.
         */
        
        else if ((!Character.isDigit(number.charAt(0)))  ||
                (!Character.isDigit(number.charAt(1)))   ||
                (!Character.isDigit(number.charAt(2)))   ||
                (number.charAt(3) != '-')                ||
                ((!Character.isLetter(number.charAt(4))) ||
                ((number.charAt(4) == 'N' || number.charAt(4) == 'O' ||
                  number.charAt(4) == 'P' || number.charAt(4) == 'Q' || 
                  number.charAt(4) == 'R' || number.charAt(4) == 'S' || 
                  number.charAt(4) == 'T' || number.charAt(4) == 'U' || 
                  number.charAt(4) == 'V' || number.charAt(4) == 'W' || 
                  number.charAt(4) == 'X' || number.charAt(4) == 'Y' || 
                  number.charAt(4) == 'Z'))))
        {
            status = false;
        }
        else
        {
            status = true;
        }
        
        return status;
    }    
        
}