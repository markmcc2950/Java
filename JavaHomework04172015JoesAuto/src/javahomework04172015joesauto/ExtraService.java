package javahomework04172015joesauto;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Mark
 */

public class ExtraService extends JPanel
{
    // To take user input for extra services used ($20/hr)
    private final JTextField extraService;      


    public ExtraService()
    {

        // Create the text field to be used
        extraService = new JTextField(12);

        // Add a border and title around the panel
        setBorder(BorderFactory.createTitledBorder("Extra Hours Worked"));

        // Add the Java Text Field to the panel
        add(extraService);
    }


    public double getExtraCost()
    {
        // Creates the variable for user inputted extra hours needed
        double extraCost = 0.00;
        
        // Holds the data from the extraService Java Text Field variable
        double extra;
      
        // Retrieve the number entered for the extra services dialog box
        extra = Double.parseDouble(extraService.getText() + "0");
      
        // Extra services cost $20/hour || Multiply by 2 since 0 is added above
        extraCost = extra * 2.00;        

        return extraCost;
    }
}
