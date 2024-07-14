// Java Homework 10.11.2014

import javax.swing.JOptionPane;
 
public class JavaHomework101114

 {
     public static void main(String[] args)
     {
        String inputString;         // For reading input
        String name;                // User's name  
        int age;                    // Age of user
        double annualpay;           // User's Annual Pay


         
        // Get the user's name
        name = JOptionPane.showInputDialog("What is " +
                                           "your name? ");
         
        // Get the age of the user
        inputString = JOptionPane.showInputDialog("How old are you? ");

         
        // Convert the input to an int.
        age = Integer.parseInt(inputString);

         
        // Get the User's Annual Pay
        inputString = JOptionPane.showInputDialog("What is your desired " +
                                                  "annual pay amount?" );

         
        // Convert the input to a double
        annualpay = Double.parseDouble(inputString);
         
        // Display message
        JOptionPane.showMessageDialog(null, "My name is " + name +
                            ", I am " + age + " years old, and I " +
                            "hope to earn $" + annualpay + " per year." );
         

         // End the Program
         System.exit(0);                                                   
     }
}
