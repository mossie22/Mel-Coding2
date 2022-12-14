import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the dividend");
        Double dividend = scan.nextDouble();
        System.out.println("Enter the divisor");
        Double divisor = scan.nextDouble();
        if (divisor == 0)
        {
            System.out.print("STOP IT");
        }
        else
        {
            Double remainder = (dividend % divisor);
            if (remainder == 0.0)
            {
                System.out.println("Because the quotient is " + (dividend/divisor) + ", " + dividend + " is equally divisible by " + divisor + ".");
            }
            else
            {
               System.out.println("Because the quotient is " + (dividend/divisor) + ", " + dividend + " is not equally divisible by " + divisor + ".");
            }
        }   
    }
}
