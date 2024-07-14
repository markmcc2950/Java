package javahomework050415skateboard;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Mark
 */

public class Decks extends JPanel
{
    // Holds the cost of the three different decks available
    
    public final double masterThrasher = 60.00;     // Master Thrasher deck
    public final double streetKing = 50.00;         // Street King deck
    public final double theDictator = 45.00;        // Dictator deck


    
    // Creates the radio boxes to select one of the three deck types
    
    private final JRadioButton master;      // To select Master Thrasher
    private final JRadioButton street;      // To select Street King
    private final JRadioButton dictator;    // To select Dictator
    

    public Decks()
    {
        // Set the panel to 1 row by 3 columns
        setLayout(new GridLayout(1, 3));

        // Create the radio buttons
        master = new JRadioButton("The Master Thrasher [$60]", true);
        street = new JRadioButton("The Street King [$50]");
        dictator = new JRadioButton("The Dictator [$45]");        

        // Add a border and title to the panel
        setBorder(BorderFactory.createTitledBorder("Skateboard Deck "
                                                 + "[SELECT ONE]"));

        // Add the radio buttons to the panel
        add(master);
        add(street);
        add(dictator);        
    }


    public double getDeckCost()
    {
        // Sets the initial flush cost in case neither are selected
        double deckCost = 0.0;

        if (master.isSelected())
            deckCost = masterThrasher;
        else if (street.isSelected())
            deckCost = streetKing;
        else if (dictator.isSelected())
            deckCost = theDictator;

        // Provide the final flush cost used in the main program
        return deckCost;
    }
}
