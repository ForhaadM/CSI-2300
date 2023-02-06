import java.util.*;
public class metricConversions {
    public static void main(String[] args) {
        System.out.println("Welcome to metric converter!");

        Scanner scn = new Scanner(System.in);

        String user = "";

        while (!user.equals("exit")){
            System.out.println("Please input your query. (g = oz, kg = lb, mm = in, km = m");
            System.out.println("Enter 'exit' to exit the program");
            user = scn.nextLine();

            if(user.equals("g = oz")){
                grams (scn);
            }
            else if (user.equals("kg = lb")){
                kilograms(scn);
            }
            else if (user.equals("mm = in")){
                milimeters(scn);
            }
            else if (user.equals ("km = m")){
                kilometers(scn);
            }
        }
        
    }
    public static void grams (Scanner scn)
    {
        String user = "";
        System.out.println("Please enter an amount or 'exit' to exit");
        Float amount = (float) 0.0;
        user = scn.nextLine();
        if (!user.equals("exit")){
            System.out.println("inside grams " + user);
            amount = TryParseFloat(user);
            if (amount == null){
                System.out.println("Bad input " +  user);
            }
            else 
            {
                Float ounce = (float) (amount * 0.035274);
                System.out.println("Ounce = " + ounce);
            }
            System.out.println(""); }
        }
        
        public static void milimeters (Scanner scn)
    {
        String user = "";
        System.out.println("Please enter an amount or 'exit' to exit");
        Float amount = (float) 0.0;
        user = scn.nextLine();
        if (!user.equals("exit")){
            System.out.println("inside milimeters " + user);
            amount = TryParseFloat(user);
            if (amount == null){
                System.out.println("Bad input " +  user);
            }
            else 
            {
                Float ounce = (float) (amount * 0.093701);
                System.out.println("inches = " + ounce);
            }
            System.out.println("");
        }
        
        
    }
    public static void kilometers (Scanner scn)
    {
        String user = "";
        System.out.println("Please enter an amount or 'exit' to exit");
        Float amount = (float) 0.0;
        user = scn.nextLine();
        if (!user.equals("exit")){
            System.out.println("inside kilometers " + user);
            amount = TryParseFloat(user);
            if (amount == null){
                System.out.println("Bad input " +  user);
            }
            else 
            {
                Float ounce = (float) (amount * 0.621371);
                System.out.println("miles = " + ounce);
            }
            System.out.println("");
        }
}
public static void kilograms (Scanner scn)
{
    String user = "";
    System.out.println("Please enter an amount or 'exit' to exit");
    Float amount = (float) 0.0;
    user = scn.nextLine();
    if (!user.equals("exit")){
        System.out.println("inside kilograms " + user);
        amount = TryParseFloat(user);
        if (amount == null){
            System.out.println("Bad input " +  user);
        }
        else 
        {
            Float ounce = (float) (amount * 2.205);
            System.out.println("Pounds = " + ounce);
        }
        System.out.println(""); }
    }

    public static Float TryParseFloat (String myFloat){
        try 
        {
            return Float.parseFloat(myFloat);
        }
        
            catch (NumberFormatException ex)
            {
                return null;
            }
        }
    }
