package englishProject;
import java.util.Scanner; // import the Scanner class

public class Game {
    public static void main(String[] args)
    {
        int score = 0;
        Scanner scan = new Scanner(System.in); // create a Scanner object
        System.out.println("Mel's Project for Jamaica Kincaid's Girl");
        System.out.println("Start by choosing your birth sex. Enter either M or F.");
        String name = scan.nextLine(); // read user's String input
        System.out.println("You don't get to choose actually, that'd be too easy.");
        System.out.println("Time to do some chores.");
        System.out.println("Wash the white clothes on Monday and put them on the stone heap; wash the color clothes on Tuesday and put them on the clothesline to dry");
        System.out.println("Type 0 if you follow the directions exactly. Type 1 if you make a small mistake.");
        int qone = scan.nextInt();
        if (qone == 1)
        {
            score -=1;
        }   
        System.out.println("Time to grow okra. This is how you grow okra—far from the house, because okra tree harbors red ants");
        System.out.println("Type 0 if you follow the directions exactly. Type 1 if you make a small mistake.");
        int qtwo = scan.nextInt();
        if (qtwo == 1)
        {
            score -=1;
        }   
        System.out.println("Try to spit in the air. This is how to spit up in the air if you feel like it, and this is how to move quick so that it doesn’t fall on you");
        System.out.println("Type 0 if you follow the directions exactly. Type 1 if you make a small mistake.");
        int qthree = scan.nextInt();
        if (qthree == 1)
        {
            score -=1;
        } 
        System.out.println("Let's see how your life turned out. The results may show up in your daily life.");
        System.out.println("Lets say you're in a bakery. You want bread.");
        System.out.println("You need to see if the bread is fresh.");
        System.out.println("Does the baker let you squeeze the bread?");
        if (score < 0)
        {
            System.out.println("The baker sees you.");
            System.out.println("He has heard about your 'reputation'");
            System.out.println("He shoos you away.");
            System.out.println("Bad ending.");

        }
        else
        {
            System.out.println("The baker sees you.");
            System.out.println("He has heard about you");
            System.out.println("He gives you the 'eyes'");
            System.out.println("He lets you squeeze the bread.");
            System.out.println("Good ending?");
        }
        System.out.print("Thank you for playing.");

    }
    
}
