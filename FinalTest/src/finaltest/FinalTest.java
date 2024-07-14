/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest;

/**
 *
 * @author Mark
 */
public class FinalTest 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println(test2(10, 20));
    }
    public static int test2(int x, int y)
    {
        if ( x < y)
        {
            return -5;
        }
        else
        {
            return (test2(x - y, y + 5) + 6);
        }
    }    
}
