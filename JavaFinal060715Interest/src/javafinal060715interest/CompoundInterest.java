package javafinal060715interest;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;


/**
 *
 * @author Mark
 */

public class CompoundInterest extends JPanel
{
    // To take user inputted numbers to get how much money will be given
    private final JTextField deposit;       // Initial deposit to add interest
    private final JTextField duration;      // Amount of times compounded yearly
    private final JTextField intTime;       // Amount of time interest's applied
    private final JTextField intRate;       // % amount of interest applied 

    public CompoundInterest()
    {
        // Set the panel to 2 rows by 1 column
        setLayout(new GridLayout(8, 1));

        // Create the JLabels for each check box
        JLabel deposit1 = new JLabel("Enter the amount to be invested " + 
                                     "(EX: 1000.00):");
        JLabel duration1 = new JLabel("Enter the amount of times the " +
                                     "investment will be compounded per year:");
        JLabel intTime1 = new JLabel("Enter the amount of years this will " +
                                     "be invested (Whole numbers only):");
        JLabel intRate1 = new JLabel("Enter the agreed rate of interest " +
                                     "(EX: 10 = 10%):");
        
        
        // Creates all the text fields and prevents certain characters   
        {
            // Create the deposit text field
            deposit = new JTextField("");
        
            // Prevents the user from entering anything but digits
            deposit.addKeyListener(new KeyAdapter() 
            {
        
                @Override
                public void keyTyped(KeyEvent e) 
                {
                    char c = e.getKeyChar();
                    if ( ((c < '0') || (c > '9')) && (e.getKeyChar() != '.')
                                       && (c != KeyEvent.VK_BACK_SPACE)) 
                    {
                        e.consume();  // Prevents any other character entry
                    }
                }
            });   
        
            // Create the duration text field
            duration = new JTextField("");
        
            // Prevents the user from entering anything but digits
            duration.addKeyListener(new KeyAdapter() 
            {
                @Override
                public void keyTyped(KeyEvent e) 
                {
                    char c = e.getKeyChar();
                    if ( ((c < '0') || (c > '9')) && 
                          (c != KeyEvent.VK_BACK_SPACE)) 
                    {
                        e.consume();  // Prevents any other character entry
                    }
                }
            });  
               
            // Create the interest time text field
            intTime = new JTextField("");
        
            // Prevents the user from entering anything but digits
            intTime.addKeyListener(new KeyAdapter() 
            {
                @Override
                public void keyTyped(KeyEvent e) 
                {
                    char c = e.getKeyChar();
                    if ( ((c < '0') || (c > '9')) && 
                          (c != KeyEvent.VK_BACK_SPACE)) 
                    {
                        e.consume();  // Prevents any other character entry
                    }
                }
            });          
        
            // Create the interest rate text field
            intRate = new JTextField("");        
        
            // Prevents the user from entering anything but digits
            intRate.addKeyListener(new KeyAdapter() 
            {
                @Override
                public void keyTyped(KeyEvent e) 
                {
                    char c = e.getKeyChar();
                    if ( ((c < '0') || (c > '9')) && 
                          (c != KeyEvent.VK_BACK_SPACE)) 
                    {
                        e.consume();  // Prevents any other character entry
                    }
                }
            });   
        }
        
        // Add a border and title to the panel
        setBorder(BorderFactory.createTitledBorder("Compound Interest"));

        // Add the text boxes to the panel
        add(deposit1);      // Adds the desciption for the deposit box
        add(deposit);       // Adds a text box for the intial deposit amount
        add(duration1);     // Adds the desciption for the compounding box
        add(duration);      // Adds a text box for the compounding duration
        add(intTime1);      // Adds the description for the time interest box
        add(intTime);       // Adds a text box for the time interest is applied
        add(intRate1);      // Adds the description for the interest rate box
        add(intRate);       // Adds a text box for the interest rate
    }


    public double getDepositedAmount()
    {
        // Creates the variable for user inputted extra hours needed
        double depositedMoney = 0.00;
        
        // Holds the data from the extraService Java Text Field variable
        double dep;
      
        // Retrieve the number entered for the extra services dialog box
        dep = Double.parseDouble(deposit.getText() + "0");
      
        // Evens numbers out since a zero is added above
        depositedMoney = dep;        

        return depositedMoney;
    }
    
    public double getCompoundDuration()
    {
        // Creates the variable for user inputted extra hours needed
        double compoundTime = 0;
        
        // Holds the data from the extraService Java Text Field variable
        double cmp;
      
        // Retrieve the number entered for the extra services dialog box
        cmp = Double.parseDouble(duration.getText() + "0");
      
        // Evens numbers out since a zero is added above
        compoundTime = cmp * .10;        

        return compoundTime;
    }    
    
    public double getInterestRate()
    {
        // Creates the variable for user inputted extra hours needed
        double interestRate = 0.00;
        
        // Holds the data from the extraService Java Text Field variable
        double rate;
      
        // Retrieve the number entered for the extra services dialog box
        rate = Double.parseDouble(intRate.getText() + "0");
      
        // Evens numbers out since a zero is added above, and to put in %'s
        interestRate = rate * .001;        

        return interestRate;
    }    
    
    public double getInterestTime()
    {
        // Creates the variable for user inputted extra hours needed
        double interestDuration = 0.00;
        
        // Holds the data from the extraService Java Text Field variable
        double time;
      
        // Retrieve the number entered for the extra services dialog box
        time = Double.parseDouble(intTime.getText() + "0");
      
        // Evens numbers out since a zero is added above
        interestDuration = time * .10;        

        return interestDuration;
    }    
}
