package javahomework050415skateboard;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 *
 * @author Mark
 */

public class JavaHomework050415Skateboard extends JFrame
{
   private final Decks deckPanel;               // Board deck panel
   private final TruckAssemblies assemblyPanel; // Board asssembly panel
   private final Wheels wheelPanel;             // Board wheel panel
   private final ExtraParts partsPanel;         // Board accessories panel
   private JPanel buttonPanel;                  // To hold the buttons
   private JButton calcButton;                  // To calculate the overall cost
   private JButton exitButton;                  // To exit the application


   public JavaHomework050415Skateboard()
   {      
      // Adds a title to the window
      setTitle("Build Your Own Board");

      // Sets the exit button to exit the program
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a border layout manager
      setLayout(new BorderLayout());

      
      // Retrieve the panels from the classes
      
      deckPanel = new Decks();                  // Panel for board decks
      assemblyPanel = new TruckAssemblies();    // Panel for truck assemblies
      wheelPanel = new Wheels();                // Panel for board wheels
      partsPanel = new ExtraParts();            // Panel for board accessories

      
      // Create the button panel
      buildButtonPanel();

      
      // Sets the deck panel to the top
      add(deckPanel, BorderLayout.NORTH);  
      
      // Sets the wheels panel to the left
      add(wheelPanel, BorderLayout.WEST);
      
      // Sets the truck assembly panel center  
      add(assemblyPanel, BorderLayout.CENTER);  
      
      // Sets the accessories panel to the right
      add(partsPanel, BorderLayout.EAST);     
      
      // Sets the calculate/exit panel bottom
      add(buttonPanel, BorderLayout.SOUTH); 
      

      // Allows the window of the class panels to be displayed
      pack();
      setVisible(true);
   }


   private void buildButtonPanel()
   {
      // Create a panel for the calculate and exit buttons
      buttonPanel = new JPanel();

      // Create the buttons
      calcButton = new JButton("Total Cost of Board");
      exitButton = new JButton("Exit");

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
            double subtotal;

            // Calculate the total of all services selected
            subtotal = deckPanel.getDeckCost() + partsPanel.getExtraCost() +
                       assemblyPanel.getAssemblyCost() + 
                       wheelPanel.getWheelCost();

            // Create a DecimalFormat object
            DecimalFormat dollar = new DecimalFormat("0.00");

            // Display the cost of all services
            JOptionPane.showMessageDialog(null, "Cost of your skateboard " +
                    "before taxes: $" + dollar.format(subtotal) + "\nTotal " +
                    "taxes owed: $" + dollar.format(subtotal * 0.06) + 
                    "\nTotal cost owed: $" + dollar.format(subtotal * 1.06));
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
      new JavaHomework050415Skateboard();
   }
}
