import javax.swing.JOptionPane;


// Java Homework 11.10.2014

/**
 *
 * @author Mark
 */

public class JavaHomework111014
{
    public static void main(String[] args) 
    
    {
    
        String input;                   // For user input
        final int minfloors = 1;        // Minimum floors
        final int minrooms = 10;         // Minimum rooms
        int floors;                     // Number of hotel floors
        int rooms;                      // Number of hotel rooms
        int totalrooms;                 // Total number of roooms
        int vacancy;                   // Number of vacant rooms
        int occupied;                   // Number of occupied rooms
        double occupy_rate;             // Occupancy rate
            
        // Get the user to input the number of hotel floors
        JOptionPane.showMessageDialog(null, "How many floors are " +
        "in the hotel?");
            
        
        // Verify number is valid
        do{
            input = JOptionPane.showInputDialog("The number of " +
                    "floors must be at least " + minfloors);
            floors = Integer.parseInt(input);
            
        }while (floors < minfloors);
        
        //Get the user to input the number of hotel rooms
        JOptionPane.showMessageDialog(null, "How many rooms are " +
                "on each floor?" );
        
        // Verify number is valid
        do{
            input = JOptionPane.showInputDialog("The number of rooms " +
                    "must be greater than " + minrooms);
            rooms = Integer.parseInt(input);
            
        }while(rooms < minrooms);
        
        // Get the actual number of occupied rooms
        input = JOptionPane.showInputDialog("How many rooms are occupied?");
        occupied = Integer.parseInt(input);
        totalrooms = (floors * rooms);
        occupy_rate = ((double)occupied / totalrooms);
        vacancy = (totalrooms - occupied);
            
        // Show the results
            
        JOptionPane.showMessageDialog(null, "There are " + totalrooms + " " +
                "rooms in the hotel.\nThe number of rooms currently " +
                "occupied is " + occupied + " rooms.\n" + vacancy + " rooms " +
                "are vacant, and the overall occupancy rate of the hotel " +
                "is " + occupy_rate);
        
        // End the program
        System.exit(0);
            
        }
                        
}

