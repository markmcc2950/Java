import java.util.Scanner;

// Java Homework 10.04.2014

public class JavaHomework100414
{
    public static void main(String[] args)
    {
        int miles;                  // Miles Driven   
        int gas;                    // Gallons of Gas Used
        double mpg;
        
       Scanner keyboard = new Scanner(System.in);
       
       // Miles Driven
       System.out.print("How many miles did you drive? ");
       miles = keyboard.nextInt();
       
       // Gallons of Gas Used
       System.out.print("How many gallons of gas " +
                        "did you use? ");
       gas = keyboard.nextInt();
       
       // Calculate Miles per Gallon
       mpg = miles / gas;
       
       // Display Miles Per Gallon
       System.out.println("Your total miles per " +
                          "gallon is " + mpg);
    }   
} 