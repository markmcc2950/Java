/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nameageannualincome;

import javax.swing.JOptionPane;


/**
 *
 * @author boardnsocal
 */
public class NameAgeAnnualIncome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        String inputString;
        int age;
        double annualPay;
        
        // Get the user's name.
        name = JOptionPane.showInputDialog("What is " +
                "your name? ");
        // Get the user's age.
        inputString = JOptionPane.showInputDialog("What is " +
                 "your age? ");
        // convert the input to an integer
        age = Integer.parseInt(inputString);
        // get the annualPay
        inputString = JOptionPane.showInputDialog("What is your " +
                "Desired Income? ");
        // convert the input to a double
        annualPay = Double.parseDouble(inputString);
        // Display the results
        JOptionPane.showMessageDialog(null,
                "My name is " + name
                + ". My age is " + age + " and I hope to earn $" + annualPay + 
                " per year.");
        // end the program
        System.exit(0);
    }
    
}
