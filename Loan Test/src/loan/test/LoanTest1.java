package loan.test;
import java.text.DecimalFormat;

/**
 *
 * @author Mark
 */

public class LoanTest1 
{
    public static void main(String[] args) 
    {
        // Create a DecimalFormat object
        DecimalFormat power = new DecimalFormat("0.00");   
        
        // Create a special y value decimal format with no decimal points
        DecimalFormat exponent = new DecimalFormat("0");
        

        double P = 1000;        // $1,000 initial money to compound
        double r = 0.05;        // Interest rate of 5%
        double t = 12;          // 12 months of constant compound interest
        double x = P * Math.E;  // Specific x value to multiply to the y power
        double y = r*t;         // Specific y power to multiply on the x value
        double A = Math.pow((P*Math.E),(r*t));
        
        // Display the results of the math
        System.out.println("$" + power.format(P) + " compounded continuously " + 
                    "at " + power.format(r) + "% for " + exponent.format(t) +
                    " months is " + power.format(A) + 
                "\n\n\nThis is my personal test: \nP = " + P + "\ne = " + 
                Math.E + "\nr = " + r + "\nt = " + t + "\nx = " + x + "\ny = " +
                y + "\nPe = " + P * Math.E + "\nrt = " + r*t + "\nA = " + A +
                "\nx^y = " + Math.pow(x,y) + "\ne^(r*t) = " + 
                Math.pow(Math.E, (r*t)) + 
                
                "\nP * e^(r*t) = " + P * (Math.pow(Math.E, (r*t))));
    }

}
