package part1;
import java.util.Scanner; 

public class Password
{
    public static void main(String[] args)
    {
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        System.out.println("Enter your password");
        Scanner scan = new Scanner(System.in);
        String bob = scan.nextLine();
        System.out.println(passwordCheck(bob));








    }
    
    public static boolean passwordCheck(String password)
    {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        int dings = 0;
        for(int i = 0; i < password.length(); i++)
        {
            String pchar = password.substring(i, i+1);
            for(int it = 0; it < letters.length(); it++)
            {
                String lchar = letters.substring(it, it+1);
                if ((pchar == lchar)){
                    dings++;
                }
            }

        }
        if (dings >= 8){
            return true;
        
        }
        else
        {
            return false;
        }




















    }
}
