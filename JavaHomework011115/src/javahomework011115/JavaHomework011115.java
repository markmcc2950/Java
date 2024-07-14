package javahomework011115;
import java.util.Scanner;

/**
 *
 * @author Mark
 */
public class JavaHomework011115
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        // List of valid account numbers
        int[] Accounts = {5658845,4520125,7895122,8777541,8451277,
                   1302850, 8080152,4562555,5552012,5050552,7825877, 1250255,
                   1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
        int results;
        
        // Ask for the account number
        System.out.print("Enter your bank account number now: ");
        int number = in.nextInt();
        
        // Search the array for the account number
        results = sequentialSearch(Accounts, number);
        
        // Determine whether the account was found and display the message
        if (results == -1)
        {
            System.out.println("Account not found. Now terminating session.");
        }
        else
        {
            System.out.println("Account found.");
        }
    }

        /**
         * The sequentialSearch method searches an array for a value.
         * @param array The array to search.
         * @param value The value to search for.
         * @return The subscript of the value if found in the array, else -1
         */
        
        public static int sequentialSearch(int[] array,
                                           int value)
        {
            int index;                  // Loop control variable
            int element;                // Element the value is found at
            boolean found;              // Flag indicating search results
            
            // Element 0 is the starting point of the search
            index = 0;
            
            // Store the default values element and found
            element = -1;
            found = false;
            
            // Search the array
            while (!found && index < array.length)
            {
                if(array[index] == value)
                {
                    found = true;
                    element = index;
                }
                index++;
            }
            
            return element;
        }
}