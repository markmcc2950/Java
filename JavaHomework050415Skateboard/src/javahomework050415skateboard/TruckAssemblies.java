package javahomework050415skateboard;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Mark
 */

public class TruckAssemblies extends JPanel
{
    // Holds the cost of all the services
    
    public final double axle_1 = 35.00;      // For the 7.75 inch axle
    public final double axle_2 = 40.00;      // For the 8 inch axle
    public final double axle_3 = 45.00;      // For the 8.5 unch axle

   
    
    // Create the check boxes for the 5 alternative services
    
    private JRadioButton Ax_1;       // Radio button for 7.75" axle
    private JRadioButton Ax_2;       // Radio button for 8" axle
    private JRadioButton Ax_3;       // Radio button for 8.5" axle

    


    public TruckAssemblies()
    {
        // Set the panel to 3 rows by 1 columns
        setLayout(new GridLayout(3, 1));    

        
        // Create the radio buttons
        Ax_1 = new JRadioButton("7.75 inch axle [$35]");
        Ax_2 = new JRadioButton("8.0 inch axle [$40]");
        Ax_3 = new JRadioButton("8.5 inch axle [$45]");
   

        
        // Create the border and title of the panel
        setBorder(BorderFactory.createTitledBorder("Truck Assemblies "
                                                 + "[SELECT ONE]"));

        // Add the 3 radio buttons to the panel
        add(Ax_1);
        add(Ax_2);
        add(Ax_3);

    }

    
    public double getAssemblyCost()
    {
        // Sets the initial assembly cost in case no check boxes are selected
        double assemblyCost = 0.0;

        if (Ax_1.isSelected())
            assemblyCost = axle_1;           // Selects 7.75" axle
        else if (Ax_2.isSelected())
            assemblyCost = axle_2;           // Selects 8" axle
        else if (Ax_3.isSelected())
            assemblyCost = axle_3;           // Selects 8.5" axle


        // Provide the final assembly cost used in the main program
        return assemblyCost;
   }
}
