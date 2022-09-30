import java.util.Scanner;

public class ninethirty {
    public static void main(String[] args){
        System.out.println("enter a double: ");
        Scanner scan = new Scanner(System.in); // create a Scanner object
        double myDouble = scan.nextDouble();
        System.out.println(myDouble);
        System.out.println((int) myDouble);
        System.out.println(myDouble + 0.5);
        double myNewDouble = myDouble + 0.5;
        System.out.println((int) myNewDouble);

        System.out.println("enter an integer: ");
        int int1 = scan.nextInt();
        System.out.println("enter another integer: ");
        int int2 = scan.nextInt();
        System.out.println("first int: " + int1);
        System.out.println("second int: " + int2);
        double division = ((double) int1/int2);
        System.out.println(division);

        System.out.println("the minimum integer value in java is -2147483648");
        System.out.println("the maximum integer value in java is 2147483648");
        System.out.println("the total bit size for an integer in java is 32");
        System.out.println(-2147483648 - 1);
        System.out.println(2147483647 + 1);
    }
}
