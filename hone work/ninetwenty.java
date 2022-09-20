
import java.util.Scanner;
public class ninetwenty {
    public static void main(String[] args)

   {

       // Fill in values for these variables

       int currentYear = 2022;

       int birthYear = 2005;

       int dogBirthYear = 2006;


       // Write a formula to calculate your age

       // from the currentYear and your birthYear variables

       int age = (currentYear - birthYear);


       // Write a formula to calculate your dog's age

       // from the currentYear and dogBirthYear variables

       int dogAge = (currentYear - dogBirthYear);


       // Calculate the age of your dog in dogYears

       //(7 times your dog's age in human years)

       int dogYearsAge = (dogAge * 7);


            // Print out your age, your dog's age, and your dog's age in

            // dog years. Make sure you print out text too so that the                

            // user knows what is being printed out.
            System.out.println("My age: " + age);
            System.out.println("Dog's age: " + dogAge);
            System.out.println("Dog's age in dog years: " + dogYearsAge);
            Scanner myObj = new Scanner(System.in);
            String userName;
            // Enter username and press Enter
            System.out.println("whats ur name?"); 
            userName = myObj.nextLine();   
            System.out.println("hello " + userName); 


    



   }
}
