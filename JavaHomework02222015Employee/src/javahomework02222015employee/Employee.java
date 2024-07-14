package javahomework02222015employee;

/**
 *
 * @author Mark
 */

public class Employee 
{
    private String name;        // Holds the employee's name
    private String number;      // Holds the employee's number
    private String date;        // Holds the employee's date of hire

    
    // Store the employee's information for use in the ProductionWorker class
    public Employee(String name, String number, String date) 
    {
        this.name = name;
        this.number = number;
        this.date = date;
    }

    // For getting the employee name outside of the class
    public String getName() 
    {
        return name;
    }

    // For getting the employee number outside of the class
    public String getNumber() 
    {
        return number;
    }    

    // For getting the employee hire date outside of the class
    public String getDate() 
    {
        return date;
    }


    // Allows public use of the private name variable
    public void setName(String name) 
    {
        this.name = name;
    }    
    
    /* Allows public use of the private number variable
    *  Also checks to make sure number is in proper format
    */
    public void setNumber(String number) 
    {
        if (isValidNum(number) == false)
        {          
            this.number = "Error: Employee number is invalid.";
        }
        else
        {
            this.number = number; 
        }   
    }    

    // Allows public use of the private date variable
    public void setDate(String hireDate) 
    {
        this.date = hireDate;
    }


    // Prints information out for Employee class information
    public String toString() 
    {
        String str = "Employee Name: " + name +
                     "\nEmployee Number: " + number +
                     "\nEmployee Hire Date: " + date;
        return str;
    }
    

    // Boolean to test is employee number is valid
    private static boolean isValidNum(String number)
    {
        boolean status = false;
        
        if (number.length() < 5 || number.length() > 5)
        {
            status = false;
        }
        else if ((!Character.isDigit(number.charAt(0)))  ||
                (!Character.isDigit(number.charAt(1)))   ||
                (!Character.isDigit(number.charAt(2)))   ||
                (number.charAt(3) != '-')                ||
                ((!Character.isLetter(number.charAt(4))) ||
                ((number.charAt(4) == 'N' || number.charAt(4) == 'O' ||
                  number.charAt(4) == 'P' || number.charAt(4) == 'Q' || 
                  number.charAt(4) == 'R' || number.charAt(4) == 'S' || 
                  number.charAt(4) == 'T' || number.charAt(4) == 'U' || 
                  number.charAt(4) == 'V' || number.charAt(4) == 'W' || 
                  number.charAt(4) == 'X' || number.charAt(4) == 'Y' || 
                  number.charAt(4) == 'Z'))))
        {
            status = false;
        }
        else
        {
            status = true;
        }
        
        return status;
    }    
}    

