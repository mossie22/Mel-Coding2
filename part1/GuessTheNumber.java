package part1;
import java.util.Scanner; // import the Scanner class

public class GuessTheNumber
{ 
    // This is the secret number that will pass the test cases!
    static int secretNumber = 16;
    public static void main(String[] args)
    {
        // Allow the user to keep guessing numbers between
        // 1 and 100 until they guess the correct number
        
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("See if you can guess the number!");
        
        // This calls the static method guessMyNumber. 
        // Notice that the method is outside of the main method. 
        guessMyNumber();
        
    }
    
    public static void guessMyNumber() 
    {  
        int guess = 0;
        Scanner scan = new Scanner(System.in);
        while(guess != secretNumber){
            System.out.println("enter guess:");
            guess = scan.nextInt();
            if (guess != secretNumber){
                System.out.println("Try again!");
            }


        }
        System.out.println("You got it!");
    }
}
       
