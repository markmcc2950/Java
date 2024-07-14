import java.util.Scanner;
import java.text.DecimalFormat;

// Java Test Grader

/**
 *
 * @author Mark
 */

public class JavaTestGrader
{
    public static void main(String[] args)
    {
        int score_a;            // Test Score
        float total;            // Proper test score (# * 5)
        float total2;           // Proper test score (# / 2)

        
        // Create a Scanner object for the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Get the first test score
        System.out.print("Please input your test score: ");
        
        score_a = keyboard.nextInt();
        
        total = (score_a * 5 );
        total2 = (total / 2);
        
        // Create a DecimalFormat object.
        DecimalFormat formatter = new DecimalFormat ("00");

        
        
        //Determine the grade.
        if (total > 0)
            
        {
        System.out.println("Your total test grade is: " +
                " " + formatter.format(total2) + "%.");
        }
        else 
           
        
        
        {

    }

        // End the Program
        System.exit(0);                                                   
    }   
} 