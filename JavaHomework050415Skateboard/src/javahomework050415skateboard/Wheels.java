package javahomework050415skateboard;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Mark
 */

public class Wheels extends JPanel
{
    // Holds the cost of all the services
    
    public final double wheel_1 = 20.00;      // For the 51mm wheel
    public final double wheel_2 = 22.00;      // For the 55mm wheel
    public final double wheel_3 = 24.00;      // For the 58mm wheel
    public final double wheel_4 = 28.00;      // For the 61mm wheel
   
    
    // Create the check boxes for the 5 alternative services
    
    private final JRadioButton Wh_1;       // Radio button for 51mm wheel
    private final JRadioButton Wh_2;       // Radio button for 55mm wheel
    private final JRadioButton Wh_3;       // Radio button for 58mm wheel
    private final JRadioButton Wh_4;       // Radio button for 61mm wheel
    


    public Wheels()
    {
        // Set the panel to 4 rows by 1 columns
        setLayout(new GridLayout(4, 1));    

        
        // Create the radio buttons
        Wh_1 = new JRadioButton("51mm wheel [$20]");
        Wh_2 = new JRadioButton("55mm wheel [$22]");
        Wh_3 = new JRadioButton("58mm wheel [$24]");
        Wh_4 = new JRadioButton("61mm wheel [$28]");   

        
        // Create the border and title of the panel
        setBorder(BorderFactory.createTitledBorder("Board Wheels "
                                                 + "[SELECT ONE]"));

        // Add the 4 radio buttons to the panel
        add(Wh_1);
        add(Wh_2);
        add(Wh_3);
        add(Wh_4);
    }

    
    public double getWheelCost()
    {
        // Sets the initial wheel cost in case no check boxes are selected
        double wheelCost = 0.0;

        if (Wh_1.isSelected())
            wheelCost = wheel_1;           // Selects 51mm wheel
        else if (Wh_2.isSelected())
            wheelCost = wheel_2;           // Selects 55mm wheel
        else if (Wh_3.isSelected())
            wheelCost = wheel_3;           // Selects 58mm wheel
        else if (Wh_4.isSelected())
            wheelCost = wheel_4;           // Selects 61mm wheel

        // Provide the final wheel cost used in the main program
        return wheelCost;
   }
}
