public class Assignment
{
    private String assignmentName;
    private double numberGrade;

    public Assignment(String initName, double initNumGrade){
        assignmentName = initName;
        numberGrade = initNumGrade;
    }

    // Finish the code inside the letterGrade() method below to print out
    // to the Terminal the name of the assignment, the number grade of
    // the assignment, and the corresponding letter grade of the 
    // assignment. Remember that the letter grade is: 
    // an A if you score 90 or higher, 
    // a B if you score between an 80 and an 89, 
    // a C if you score between a 70 and a 79, 
    // a D if you score between a 60 and a 69, 
    // and an F otherwise.
    

    public void letterGrade(){
        if (numberGrade >= 90)
        {
            System.out.println(assignmentName + " Grade: A");

        }
        else if (numberGrade >= 80)
        {
            System.out.println(assignmentName + " Grade: B");
        }
        else if (numberGrade >= 70)
        {
            System.out.println(assignmentName + " Grade: C");
        }
        else if (numberGrade >= 60)
        {
            System.out.println(assignmentName + " Grade: D");
        }
        else
        {
            System.out.println(assignmentName + " Grade: F");
        }


    }

    public static void main(String[] args)
    {
        Assignment assignmentOne = new Assignment("homework", 88.5);
        assignmentOne.letterGrade();

        // Below, write the code to create four more objects to test out 
        // all of the conditions of your letterGrade() method.
        Assignment assignmentTwo = new Assignment("gnomework", 98.5);
        assignmentTwo.letterGrade();
        Assignment assignmentThree = new Assignment("flomework", 78.5);
        assignmentThree.letterGrade();
        Assignment assignmentFour = new Assignment("homework", 68.5);
        assignmentFour.letterGrade();
        Assignment assignmentFive = new Assignment("homework", 58.5);
        assignmentFive.letterGrade();


    }
}
 {
    
}
