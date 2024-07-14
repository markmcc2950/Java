package PersonalData;

/**
 *
 * @author Mark
 */
public class PersonalData
{
    private final String name;
    private final String address;
    private final String phone;
    private final int age;
    
    PersonalData(String name1, String address1, String phone1, int age1)
            
    {
        name = name1;
        address = address1;
        phone = phone1;
        age = age1;
    }
    
    public String getName(String Name)
    {
        return name;
    }
    
    public String getAddress(String Address)
    {
        return address;
    }
    
    public String getPhone(String Phone)
    {
        return phone;
    }
    
    public int getAge(String Age)
    {
        return age;
    }
}
    
            
        