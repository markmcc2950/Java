package javahomework04172015joesauto;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Mark
 */

public class FlushPanel extends JPanel
{
    // Holds the cost of the two flush services offered
    
    public final double RAD_FLUSH = 30.00;      // Cost of radiator flush
    public final double TRAN_FLUSH = 80.00;     // Cost of transmission flush

    
    // Creates the check boxes for the two flush services offered
    
    private final JCheckBox radiator;           // To select radiator flush
    private final JCheckBox transmission;       // To select transmission flush


    public FlushPanel()
    {
        // Set the panel to 2 rows by 1 column
        setLayout(new GridLayout(2, 1));

        // Create the check boxes
        radiator = new JCheckBox("Radiator Flush", true);
        transmission = new JCheckBox("Transmission Flush");

        // Add a border and title to the panel
        setBorder(BorderFactory.createTitledBorder("Flush Services"));

        // Add the check boxes to the panel
        add(radiator);
        add(transmission);
    }


    public double getFlushCost()
    {
        // Sets the initial flush cost in case neither are selected
        double flushCost = 0.0;

        if (radiator.isSelected())
            flushCost += RAD_FLUSH;         // Adds the radiator flush cost
        if (transmission.isSelected())
            flushCost += TRAN_FLUSH;        // Adds the transmission flush cost

        // Provide the final flush cost used in the main program
        return flushCost;
    }
}
