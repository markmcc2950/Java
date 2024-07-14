package javahomework04172015joesauto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 *
 * @author Mark
 */

public class JavaHomework04172015JoesAuto extends JFrame
{
   private FlushPanel flush;            // Flush panel
   private OtherServices services;      // Remaining services panel
   private ExtraService misc;           // Extra hour services panel
   private PanelTitle banner;           // Adds a title to the top of the panels
   private JPanel buttonPanel;          // To hold the buttons
   private JButton calcButton;          // To calculate the overall service cost
   private JButton exitButton;          // To exit the application


   public JavaHomework04172015JoesAuto()
   {
      // Adds a title to the window
      setTitle("Services Calculator");

      // Sets the exit button to exit the program
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a border layout manager
      setLayout(new BorderLayout());

      
      // Retrieve the panels from the classes
      
      banner = new PanelTitle();        // For the overall panels title
      flush = new FlushPanel();         // For the flush services panel
      services = new OtherServices();   // For the remaining services panel
      misc = new ExtraService();        // For extra hourly services

      
      // Create the button panel
      buildButtonPanel();


      // Sets the title to the top
      add(banner, BorderLayout.NORTH); 
      
      // Sets the flush panel left
      add(flush, BorderLayout.WEST);  
      
      // Sets the remaining panel center  
      add(services, BorderLayout.CENTER);  
      
      // Sets the hourly panel right
      add(misc, BorderLayout.EAST);     
      
      // Sets the calculate/exit panel bottom
      add(buttonPanel, BorderLayout.SOUTH); 
      

      // Allows the window of the class panels o be displayed
      pack();
      setVisible(true);
   }


   private void buildButtonPanel()
   {
      // Create a panel for the calculate and exit buttons
      buttonPanel = new JPanel();

      // Create the buttons
      calcButton = new JButton("Total Cost of Services");
      exitButton = new JButton("No more services today, thank you");

      // Initiate action listeners
      calcButton.addActionListener(new CalcButtonListener());
      exitButton.addActionListener(new ExitButtonListener());

      // Add the buttons to the bottom of the panel
      buttonPanel.add(calcButton);
      buttonPanel.add(exitButton);
   }

 
   private class CalcButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Variable to hold the total cost of service
         double total;

         // Calculate the total of all services selected
         total = flush.getFlushCost() + services.getServiceCost() +
                                        misc.getExtraCost();

         // Create a DecimalFormat object
         DecimalFormat dollar = new DecimalFormat("0.00");

         // Display the cost of all services
         JOptionPane.showMessageDialog(null, "Cost of services for your " +
                                "vehicle today: $" + dollar.format(total));
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
      new JavaHomework04172015JoesAuto();
   }
}
