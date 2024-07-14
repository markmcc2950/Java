package javahomework04172015joesauto;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Mark
 */

public class OtherServices extends JPanel
{
    // Holds the cost of all the services
    
    public final double OIL_CHANGE = 26.00;             // Oil change cost
    public final double LUBE_JOB = 18.00;               // Lube job cost
    public final double INSPECTION = 15.00;             // Inspection cost
    public final double MUFFLER_REPLACEMENT = 100.00;   // Muffler replace cost
    public final double TIRE_ROTATION = 20.00;          // Tire rotate cost
   
    
    // Create the check boxes for the 5 alternative services
    
    private JCheckBox oil;                  // Check box for oil change
    private JCheckBox lube;                 // Check box for lube job
    private JCheckBox inspection;           // Check box for inspection
    private JCheckBox muffler;              // Check box for muffler replacement
    private JCheckBox tire;                 // Check box for tire rotation
    


    public OtherServices()
    {
        // Set the panel to 3 rows by 2 columns
        setLayout(new GridLayout(3, 2));    

        
        // Create the check boxes.
        oil = new JCheckBox("Oil Change");
        lube = new JCheckBox("Lube");
        inspection = new JCheckBox("Routine Inspection");
        muffler = new JCheckBox("Muffler Replacement");
        tire = new JCheckBox("Tire Rotation");       

        
        // Create the border and title of the panel
        setBorder(BorderFactory.createTitledBorder("Other Services"));

        // Add the 5 check boxes to the panel
        add(oil);
        add(lube);
        add(inspection);
        add(muffler);
        add(tire);
    }

    
    public double getServiceCost()
    {
        // Sets the initial service cost in case no check boxes are selected
        double serviceCost = 0.0;

        if (oil.isSelected())
            serviceCost += OIL_CHANGE;              // Adds oil change price
        if (lube.isSelected())
            serviceCost += LUBE_JOB;                // Adds lube job price
        if (inspection.isSelected())
            serviceCost += INSPECTION;              // Adds inspection price
        if (muffler.isSelected())
            serviceCost += MUFFLER_REPLACEMENT;     // Adds muffler price
        if (tire.isSelected())
            serviceCost += TIRE_ROTATION;           // Adds tire rotation price 

        // Provide the final service cost used in the main program
        return serviceCost;
   }
}
