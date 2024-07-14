package javahomework120114;

/**
 *
 * @author Mark
 */
public class PersonalData
{
    // Fields
    private String name;
    private String address;
    private String phone;
    private double age;
    
    /**
     * 
     * @param Na = Name
     * @param Ad = Address
     * @param Ph = Phone
     * @param Ag = Age
     */
    
    public PersonalData(String Na, String Ad, String Ph, double Ag)
    {
        name = Na;
        address = Ad;
        phone = Ph;
        age = Ag;
    }
    
    /**
     * The setName method sets the personal name
     * @param Na   The person's name
     */
    
    public void setName(String Na)
    {
        name = Na;
    }
    
    /**
     * The setAddress method sets the personal address
     * @param Ad    The person's address
     */
    
    public void setAddress(String Ad)
    {
        address = Ad;
    }
    
    /**
     * The setPhone method sets the personal phone number
     * @param Ph    The person's phone number
     */
    
    public void setPhone(String Ph)
    {
        phone = Ph;
    }  
    
    /**
     * The setAge method sets the personal age
     * @param Ag    The person's age
     */
    
    public void setAge(double Ag)
    {
        age = Ag;
    } 
    
    /**
     * getName method
     * @return The name of the person
     */
    
    public String getName()
    {
        return name;
    }
    /**
     * getAddress method
     * @return The address of the person
     */
    
    public String getAddress()
    {
        return address;
    }
    
    /**
     * getPhone method
     * @return The phone number of the person
     */
    
    public String getPhone()
    {
        return phone;
    }
    
    /**
     * getAge method
     * @return The age of the person
     */
    
    public double getAge()
    {
        return age;
    }
   
}   