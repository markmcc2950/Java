package javahomework052415recursive;
import java.text.DecimalFormat;

/**
 *
 * @author Mark
 */

public class JavaHomework052415Recursive 
{
    public static void main(String[] args) 
    {
        // Create a DecimalFormat object
        DecimalFormat power = new DecimalFormat("0.00");   
        
        // Create a special y value decimal format with no decimal points
        DecimalFormat exponent = new DecimalFormat("0");
        
        double x = 17.52;   // Specific x value to multiply to the y power
        double y = 2.00;    // Specific y power to multiply on the x value
        
        // Display the results of the math
        System.out.println(power.format(x) + " raised to the power of " + 
                    exponent.format(y) + " is " + power.format(pow(x,y)));
    }
    
    // Allows the exponent multiplication in the main method
    public static double pow(double x, double y)
    {
        if (y > 0)
            return x * pow(x, y-1);
        else
            return 1;   // If a negative number is entered, will multiply by 1
    }
}
