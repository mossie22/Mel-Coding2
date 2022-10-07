public class classworkProgrammingChallenge {
    public static void main(String[] args){
        World habitat = new World(500, 500);

        Turtle yertle = new Turtle(habitat);

        //small square
        yertle.forward();
        yertle.turnLeft();
        yertle.forward();
        yertle.turnLeft();
        yertle.forward();
        yertle.turnLeft();
        yertle.forward();
        yertle.turnLeft();

        //big square
        yertle.forward();
        yertle.forward();
        yertle.turnLeft();
        yertle.forward();
        yertle.forward();
        yertle.turnLeft();
        yertle.forward();
        yertle.forward();
        yertle.turnLeft();
        yertle.forward();
        yertle.forward();
        yertle.turnLeft();
        habitat.show(true);
        

    }


}
