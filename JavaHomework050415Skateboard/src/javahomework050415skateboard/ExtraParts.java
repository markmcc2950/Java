package javahomework050415skateboard;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Mark
 */

public class ExtraParts extends JPanel
{
    // Holds the cost of all the services
    
    public final double gripTape = 10.00;       // Grip tape cost
    public final double boardBearings = 30.00;  // Board bearing cost
    public final double riserPads = 2.00;       // Riser pads cost
    public final double nuts_bolts = 1.00;      // Nuts & bolts kit cost
   
    
    // Create the check boxes for the 5 alternative services
    
    private final JCheckBox tape;           // Check box for grip tape
    private final JCheckBox bearings;       // Check box for board bearings
    private final JCheckBox pads;           // Check box for riser pads
    private final JCheckBox nutsBolts;      // Check box for nuts & bolts kit
  
    

    public ExtraParts()
    {
        // Set the panel to 4 rows by 1 columns
        setLayout(new GridLayout(4, 1));    

        // Create the check boxes.
        tape = new JCheckBox("Grip Tape [$10]");
        bearings = new JCheckBox("Board Bearings [$30]");
        pads = new JCheckBox("Riser Pads [$2]");
        nutsBolts = new JCheckBox("Nuts & Bolts Kit [$1]");     
       
        // Create the border and title of the panel
        setBorder(BorderFactory.createTitledBorder("Board Accessories"));

        // Add the 4 check boxes to the panel
        add(tape);
        add(bearings);
        add(pads);
        add(nutsBolts);
    }

    
    public double getExtraCost()
    {
        // Sets the initial service cost in case no check boxes are selected
        double extraCost = 0.0;

        if (tape.isSelected())
            extraCost += gripTape;          // Adds grip tape price
        if (bearings.isSelected())
            extraCost += boardBearings;     // Adds board bearings price
        if (pads.isSelected())
            extraCost += riserPads;         // Adds riser pads price
        if (nutsBolts.isSelected())
            extraCost += nuts_bolts;        // Adds nuts & bolts price

        // Provide the final accessory cost used in the main program
        return extraCost;
   }
}
