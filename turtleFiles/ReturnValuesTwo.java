import java.util.*;
import java.awt.*;
import java.lang.Math;


public class ReturnValuesTwo {
    public static void main(String[] args){
        World world = new World(300,300);
        Turtle yertle = new Turtle(world);
        Turtle bertle = new Turtle(world);
        System.out.println(yertle.getDistance(0,0));

        int bertleXPos = (bertle.getXPos());
        int bertleYPos = (bertle.getYPos());

        System.out.println(yertle.getDistance(bertleXPos,bertleYPos));

        String lastName = "Vu";
        String otherLastName = "Lopez";

        int comparison = lastName.compareTo(otherLastName);
        System.out.println(comparison);

    }
}