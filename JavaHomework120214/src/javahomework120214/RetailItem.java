package javahomework120214;

/**
 *
 * @author Mark
 */
public class RetailItem
{
    // Fields
    private String description;
    private int units;
    private double price;
    
    /**
     * 
     * @param De = Description
     * @param Un = Units
     * @param Pr = Price
     */
    
    public RetailItem(String De, int Un, double Pr)
    {
        description = De;
        units = Un;
        price = Pr;
    }
    
    /**
     * The setName method sets the personal name
     * @param De   The item's brief description
     */
    
    public void setName(String De)
    {
        description = De;
    }
    
    /**
     * The setAddress method sets the personal address
     * @param Un    The  number of units in the inventory
     */
    
    public void setAddress(int Un)
    {
        units = Un;
    }
    
    /**
     * The setPhone method sets the personal phone number
     * @param Pr    The item's price
     */
    
    public void setPhone(double Pr)
    {
        price = Pr;
    }  

    
    /**
     * getDesc method
     * @return The description of the item
     */
    
    public String getDesc()
    {
        return description;
    }
    /**
     * getUnits method
     * @return The number of units in inventory
     */
    
    public int getUnits()
    {
        return units;
    }
    
    /**
     * getPrice method
     * @return The price of the item
     */
    
    public double getPrice()
    {
        return price;
    }
    
   
}   