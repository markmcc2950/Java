package loantest3;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Mark
 */

public class LoanTest3 
{
    public static void main(String[] args) 
    {
        // Create a special y value decimal format with no decimal points
        DecimalFormat exponent = new DecimalFormat("0.00");  
        DecimalFormat month = new DecimalFormat("0");
        
        // Create a Scanner object for the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        double P = 1000.00;
                
        double r = 0.05;
        
        double n = 12;
        
        double t = 20;
        
        double e = (r/n);
        
        double nt = (n*t);
        
        double total = P * (Math.pow(1 + (r/n), n*t));
        
        System.out.println("\n$" + exponent.format(P) + " being invested for " + 
                month.format(t) + " years, compounded " + month.format(n) + 
                " times per year at " + exponent.format(r) + "% interest " +
                "rate is " + exponent.format(total));
        
        
    }
    
}
