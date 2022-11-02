package classwork;

public class Riddle
{
    // write 2 instance variables for question and answer: private type variableName;
    private String riddleQuestion;
    private String riddleAnswer;
    // constructor
    public Riddle(String initQuestion, String initAnswer)
    {
        riddleQuestion = initQuestion;
        riddleAnswer = initAnswer;
    }

    // Print riddle question
    public void printQuestion()
    {
        // print out the riddle question with System.out.println
        System.out.println(riddleQuestion);
    }

    // Print riddle answer
    public void printAnswer()
    {
        System.out.println(riddleAnswer);
        // print out the riddle answer with System.out.println
    }

    // main method for testing
    public static void main(String[] args)
    {
        // call the Riddle constructor to create 2 new Riddle objects
        // with the arguments for the riddle question and answer.
        // call the riddle objects' printQuestion() and printAnswer methods
        Riddle chicken = new Riddle("Why did the chicken cross the road?","To get to the other slide");
        chicken.printQuestion();
        chicken.printAnswer();

    }
}
