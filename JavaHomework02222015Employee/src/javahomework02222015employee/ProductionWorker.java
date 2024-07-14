package javahomework02222015employee;
import java.text.DecimalFormat;

/**
 *
 * @author Mark
 */

public class ProductionWorker extends Employee
{
    private int shift;                      // Employee Shift Number (1 or 2)
    private double empPay = 0.00;           // Employee hourly rate
    public static final int dayShift = 1;   // Stores day shift information
    public static final int nightShift = 2; // Stores night shift information


    // Store all of the employee's information from both classes for main class
    public ProductionWorker(String name, String number, String date, 
                            int newShift, double newPayRate) 
    {
        super(name, number, date);
        this.shift = newShift;
        this.empPay = newPayRate;
    }

    // For getting employee shift outside of the class
    public int getShift() 
    {
        return shift;
    }

    // For getting employee pay rate outside of the class
    public double getPayRate() 
    {
        return empPay;
    }

    // Allows public use of the private shift variable
    public void setShift(int newShift) 
    {
        this.shift = newShift;
    }
    
    // Allows public use of the private empPay variable
    public void setPayRate(double newPayRate) 
    {
        this.empPay = newPayRate;
    }

    // Prints information out for ProductionWorker class information
    @Override
    public String toString() 
    {   
        // Initiate decimal format for pay rate on print out in main class
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        String str = super.toString();

        // Checks and prints out night or dayshift information in main class
        str += "\nShift: ";
        if (shift == dayShift)
        str += "Day";
        else if(shift == nightShift)
        str += "Night";

        // Prints out employee hourly pay rate in main class
        str += ("\nHourly Pay Rate: $" + dollar.format(empPay) +
                " per hour.");

        return str;
    }
    
}
