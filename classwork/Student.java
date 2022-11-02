package classwork;
/** Student class with 4 instance variables, 3 constructors, 
 * a print method, and a main method to test them.
 */
public class Student
{
    // Write 4 instance variables
    private String firstName;
    private String lastName;
    private double GPA;
    private boolean passing;

    // Write 3 constructors to initialize the instance variables
    //  1. no parameters using default values
    //  2. 1 parameter and the rest default values
    //  3. 4 parameters
    public Student()
    {
        firstName = "John";
        lastName = "Smith";
        GPA = 0.0;
        passing = false;
    }
    public Student(String ifirstName, String ilastname)
    {
        firstName = ifirstName;
        lastName = ilastname;
        GPA = 0.0;
        passing = false;
    }
    public Student(String ifirstName, String ilastname, double iGPA, boolean ipassing)
    {
        firstName = ifirstName;
        lastName = ilastname;
        GPA = iGPA;
        passing = ipassing;
    }
    // Write a print method that prints all the instance variables
    public void print()
    {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(GPA);
        System.out.println(passing);
    }

   // main method
   public static void main(String[] args)
   {
      // Construct 3 Student objects using the 3 different constructors

      // call their print() methods
      Student s1 = new Student();
      s1.print();
      Student s2 = new Student("Bob","Jones");
      s2.print();
      Student s3 = new Student("Robert","Jonesert",4.0,true);
      s3.print();
   }
}
