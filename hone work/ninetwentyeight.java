import java.util.Scanner; // import the Scanner class

public class ninetwentyeight {
    public static void main(String[] args){
        System.out.print("how much does it cost?: ");
        Scanner scan = new Scanner(System.in); // create a Scanner object
        int cost = scan.nextInt(); // read user's String input
        System.out.println("cost of tshirt is: " + cost);
        System.out.println("the cost of personalized tshirt is: " + (cost + 1));
        System.out.println("cost of tshirt without personalization is: " + cost);
        System.out.println("how much does dinner cost?: ");
        double dinner = scan.nextDouble();
        System.out.println("how much does laser tag for one person cost?: ");
        double lasertag = scan.nextDouble();
        System.out.println("how much does three scoops of ice cream cost?: ");
        double dessert = scan.nextDouble();

        double finaldinner = dinner * 3;
        double finallasertag = lasertag * 2;
        double finaldessert = dessert + (dessert/3);

        System.out.println("Dinner: " + finaldinner);
        System.out.println("Laser tag: " + finallasertag);
        System.out.println("Ice cream: " + finaldessert);

        System.out.println("Grand total: " + finaldinner + finallasertag + finaldessert);


    }
}
