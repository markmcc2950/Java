package loantest2;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Mark
 */

public class LoanTest2 
{
    public static void main(String[] args) 
    {
        // Create a special y value decimal format with no decimal points
        DecimalFormat exponent = new DecimalFormat("0.00");  
        DecimalFormat month = new DecimalFormat("0");
        
        // Create a Scanner object for the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is the amount of money being invested?");
        double P = keyboard.nextDouble();
                
        System.out.println("\nWhat is the interest rate being calculated? (%)");
        double r = (keyboard.nextInt()) * 0.01;
        
        System.out.println("\nHow many months will the investment be compounded?");
        double t = keyboard.nextInt();
        
        System.out.println("\n$" + P + " being invested for " + month.format(t)
                + " months at " + exponent.format(r) + "% interest rate is "+
                exponent.format(P * (Math.pow(Math.E, (r*t)))));
    }
    
}
