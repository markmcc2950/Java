import javax.swing.JOptionPane;
import java.text.DecimalFormat;

// Java Homework 10.11.2014

/**
 *
 * @author Mark
 */

public class JavaHomework101214
{
    public static void main(String[] args)
    {
        String inputString;         // For reading input
        int purchase;               // Total amount purchased 
        double statetax;            // Amount of State Sales Tax (0.04%)
        double statepurchase;       // State Tax applied to Purchase
        double countytax;           // Amount of County S. Tax   (0.02%)
        double countypurchase;      // County Tax applied to Purchase
        double totaltax;            // County + State Tax
        double totalpurchase;       // County & State Tax applied to Purchase
        double almosttotal;         // Total when multiplied with taxes
        double total;               // Actual Total Amount


        // Get the user's purchase amount
        inputString = JOptionPane.showInputDialog("What is the total " +
                                            "amount being purchased? ");
        
        // Convert Purchase amount to an int.
        purchase = Integer.parseInt(inputString);
        
        // State & County Tax
        statetax = 0.04;
        countytax = 0.02;
        statepurchase = statetax * purchase;
        countypurchase = countytax * purchase;
       


        // Get the Total Tax Amount
        totaltax = statetax + countytax;
        totalpurchase = totaltax * purchase;
        
        
        // Get the Total Tax to add on
        almosttotal = purchase * totaltax;
        
        
        // Get the full Total Amount
        total = almosttotal + purchase;
        
        // Create a DecimalFormat object.
        DecimalFormat formatter = new DecimalFormat ("00");
        
        // Display message
        JOptionPane.showMessageDialog(null, "Your total purchase " + 
                         " is $" + purchase + ", the State Sales Tax " +
                         " is $" + statepurchase + ", the County Sales Tax " +
                         " is $" + countypurchase + ", the total Sales Tax " +
                         " is $" + totalpurchase + ", and the total of the " +
                         " sale with tax is $" + total );       
        // End the Program
        System.exit(0);                                                   
    }   
} 