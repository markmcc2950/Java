import java.text.DecimalFormat;


// Java Homework 11.24.2014

/**
 *
 * @author Mark
 */

public class JavaHomework112414
{
    public static void main(String[] args)
    {
        // Create a decimal format
        DecimalFormat df = new DecimalFormat("0.0°");
        
        
        System.out.println("This table shows Fahrenheit to Celsius conversion");
        
        // Show the table
        System.out.println("Fahrenheit°" + "\t\t\t" + "Celsius°");
        System.out.println("===========================================");
        
            for (double tempF = 0; tempF <= 20; tempF++)
            {
                System.out.println(df.format(tempF) + "\t\t\t\t" + 
                df.format(cel(tempF)));
            }           
    }
            public static double cel(double tempF)
            {
                return (tempF-32) * 0.55555;
            }
           
}
        