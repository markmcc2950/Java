package javahomework04172015joesauto;
import javax.swing.*;

/**
 *
 * @author Mark
 */

public class PanelTitle extends JPanel
{
    private JLabel title; // Displays a title above the other panels


    public PanelTitle()
    {
        // Create the displayed title
        title = new JLabel("Joe's Automotive Services");

        // Add the title to the panel
        add(title);
    }
}
