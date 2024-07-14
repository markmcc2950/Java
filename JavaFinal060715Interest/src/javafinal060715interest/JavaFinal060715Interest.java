package javafinal060715interest;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 *
 * @author Mark
 */

public class JavaFinal060715Interest extends JFrame
{
    private CompoundConstant constant;  // For constant compounded interest
    private CompoundInterest compound;  // For regular compound interest
    private JPanel exitPanel;           // To hold the exit button
    private JPanel buttonPanel;         // To hold the calculate buttons
    private JButton calcButton1;        // To calculate continuous compound
    private JButton calcButton2;        // To calculate compound interest
    private JButton exitButton;         // To exit the application

    public JavaFinal060715Interest()
    {
        // Adds a title to the window
        setTitle("Compound Interest Calculator");

        // Sets the exit button to exit the program
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a border layout manager
        setLayout(new BorderLayout());

      
        // Retrieve the panels from the classes
        constant = new CompoundConstant();
        compound = new CompoundInterest();

        // Create the button panel
        buildExitPanel();

        // Create the button panel
        buildButtonPanel();
        
        // Sets the regular compound interest to the left
        add(compound, BorderLayout.WEST);
        
        // Sets the constant compound interest to the right
        add(constant, BorderLayout.EAST);     

        // Sets the exit panel bottom
        add(exitPanel, BorderLayout.SOUTH); 
        
        // Sets the calculate panel top
        add(buttonPanel, BorderLayout.NORTH);         
      
        // Allows the window of the class panels o be displayed
        pack();
        setVisible(true);
    }


    private void buildExitPanel()
    {
        // Create a panel for the exit button
        exitPanel = new JPanel();

        // Create the button  
        exitButton = new JButton("No more interest calculations for now");

        // Initiate action listener
        exitButton.addActionListener(new ExitButtonListener());

        // Add the button to the bottom of the panel       
        exitPanel.add(exitButton);    
    }
    
    private void buildButtonPanel()
    {
        // Create a panel for the calculate and exit buttons
        buttonPanel = new JPanel();

        // Create the buttons
        calcButton1 = new JButton("Continuous Compound Interest");
        calcButton2 = new JButton("Compound Interest");        

        // Initiate action listeners
        calcButton1.addActionListener(new CalcButtonContinuous());
        calcButton2.addActionListener(new CalcButtonCompound());

        // Add the buttons to the bottom of the panel
        buttonPanel.add(calcButton2);        
        buttonPanel.add(calcButton1);        
    }    

 
    private class CalcButtonContinuous implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // Initialize the decimal format objects
            DecimalFormat dollar = new DecimalFormat("###,###,###.00");
            DecimalFormat time = new DecimalFormat("###,###,###");   
            
            
            double P = constant.getDepositedAmount();
            double r = constant.getInterestRate();
            double t = constant.getInterestTime();
            double n = 0;
            double total = P * (Math.pow(Math.E, (r * t)));     
                
            JOptionPane.showMessageDialog(null, "Invested Amount: $" + 
            dollar.format(P) + "\nTime Invested: " + time.format(t) + 
                    " years\nAgreed interest rate: " + dollar.format(r) +
                    "%\n\nTotal amount returned from investment: $" 
                    + dollar.format(total));                 
        }
    }
    
    private class CalcButtonCompound implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // Initialize the decimal format objects
            DecimalFormat dollar = new DecimalFormat("###,###,###.00"); 
            DecimalFormat time = new DecimalFormat("###,###,###");   
            
            
            double P = compound.getDepositedAmount();
            double n = compound.getCompoundDuration();
            double r = compound.getInterestRate();
            double t = compound.getInterestTime();
            double total = P * (Math.pow(1 + (r/n), n*t));
                
            JOptionPane.showMessageDialog(null, "Invested Amount: $" 
                + dollar.format(P) + "\nTime invested: " + time.format(t) + 
                " years\nTimes the investment is compounded annually: " +
                time.format(n) + " times\nAgreed interest rate: " + 
                dollar.format(r) + "%\n\nTotal amount returned from " +
                "investment: $" + dollar.format(total));
        }
    }    


    private class ExitButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);   // Sets the exit button to close the program
        }
    }
   
    // Main method
    public static void main(String[] args)
    {
        new JavaFinal060715Interest();
    }
}
