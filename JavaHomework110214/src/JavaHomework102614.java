import java.util.Scanner;
import java.text.DecimalFormat;

// Java Homework 10.26.2014

/**
 *
 * @author Mark
 */

public class JavaHomework102614
{
    public static void main(String[] args)
    {
        int weight;            // User inputted weight
        int height;            // User inputted height
        float heightx;         // Height^2
        float bmi;             // BMI = Weight X 703 / Height^2  
        
        // Create a Scanner object for the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Get the height input
        System.out.print("Please input your " +
                         "height in inches: ");
        
        height = keyboard.nextInt();
        heightx = height;
        
        // Get the weight input
        System.out.print("Please input your " +
                         "weight in pounds: ");
        
        weight = keyboard.nextInt();
        
        bmi = (703 * weight) / (height * heightx);
        
        // Create a DecimalFormat object.
        DecimalFormat formatter = new DecimalFormat ("00.00");

        
        
        //Determine the BMI.
        if (bmi < 18.5)
            
        {
        System.out.println("Your Body Mass Index is: " +
                " " + formatter.format(bmi) + ".\n\tYou are underweight. ");
        }
        else if (bmi > 25)
        {
        System.out.println("Your Body Mass Index is: " +
                " " + formatter.format(bmi) + ".\n\tYou are overweight. ");
        }
        else if (bmi >= 18.5 || bmi <= 25)
        {
        System.out.println("Your Body Mass Index is: " +
                " " + formatter.format(bmi) + ".\n\tYou are optimal weight. ");
        }
        
        {

    }

        // End the Program
        System.exit(0);                                                   
    }   
} 