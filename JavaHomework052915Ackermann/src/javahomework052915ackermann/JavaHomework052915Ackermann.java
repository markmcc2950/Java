package javahomework052915ackermann;

/**
 *
 * @author Mark
 */

public class JavaHomework052915Ackermann 
{
    // Sets the Ackermann Function to call in the main class
    public static int Ackermann(int m, int n) 
    {
        if (m == 0) 
        {
            return (n + 1);
        } 
        
        else if (m > 0 && n == 0) 
        {
            return Ackermann(m - 1, 1);
        } 
        
        else 
        {
            return Ackermann(m - 1, Ackermann(m, n - 1));
        }
    }

    // Displays the results based on the 'equations' in the static Ackermann
    public static void main(String[] args) 
    {
        // Resulted number of Ackermann's Function for (0,0)
        System.out.println("Result for (0, 0)\n\t    =  " 
                                            + Ackermann(0, 0) + "\n");
        
        // Resulted number of Ackermann's Function for (0,1)
        System.out.println("Result for (0, 1)\n\t    =  " 
                                            + Ackermann(0, 1) + "\n");  
        
        // Resulted number of Ackermann's Function for (1,1)
        System.out.println("Result for (1, 1)\n\t    =  " 
                                            + Ackermann(1, 1) + "\n");
        
        // Resulted number of Ackermann's Function for (1,2)
        System.out.println("Result for (1, 2)\n\t    =  " 
                                            + Ackermann(1, 2) + "\n"); 
        
        // Resulted number of Ackermann's Function for (1,3)
        System.out.println("Result for (1, 3)\n\t    =  " 
                                            + Ackermann(1, 3) + "\n"); 
        
        // Resulted number of Ackermann's Function for (2,2)
        System.out.println("Result for (2, 2)\n\t    =  " 
                                            + Ackermann(2, 2) + "\n");
        
        // Resulted number of Ackermann's Function for (3,2)
        System.out.println("Result for (3, 2)\n\t    =  "
                                            + Ackermann(3, 2) + "\n");    
        
        // Resulted number of Ackermann's Function for (3,9)
        System.out.println("And just for fun...\nResult for (3, 9)\n\t    =  "
                                            + Ackermann(3, 9) + "\n");           
    }
}