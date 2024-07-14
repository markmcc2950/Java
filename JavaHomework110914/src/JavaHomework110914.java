import java.util.*;
import java.io.*;


// Java Homework 11.09.2014

/**
 *
 * @author Mark
 */

public class JavaHomework110914
{
    public static void main(String[] args) throws IOException
    
    {
    
        // Create Scanner Object.
        Scanner input = new Scanner(System.in);
        
        // Get user inputted file name.
        System.out.println("Enter the desired file name: ");
        String fileName = input.nextLine();
        
        // Open the user specified file.
        File file = new File(fileName + ".txt");
        
        // Verify the inputted file exists.
        if(!file.exists()){
                System.out.println("The file " + fileName + ".txt " +
                        "does not exist.");
                System.exit(0);       
        }
        
        // Initiate the scanner with user file.
        Scanner inputFile = new Scanner(file);
        String line;
        
        // Initialize the counter.
        int counter = 0;
        
        // While loop
        while(inputFile.hasNext()){
                line = inputFile.nextLine();
                if(counter < 5)
                    System.out.println(line);
                counter += 1;               
        }
        
        // Close the file.
        inputFile.close();
        
    }
    
}
        