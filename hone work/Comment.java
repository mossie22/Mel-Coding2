public class Comment
{
    private String poster;
    private String comment;
    private String date;
    
    public Comment(String personPosting, String message, String commentDate)
    {
        poster = personPosting;
        comment = message;
        date = commentDate;
    }
    
    public String toString()
    {
        return comment + "\n--" + poster + "(" + date + ")";
    }

    public String getPoster()
    {
        return poster;
    }

    public String getComment()
    {
        return comment;
    }
    public String getDate()
    {
        return date;
    }
    //Your code here.


    public static void main(String[] args)
    {
        //Your code here.
        //Create two Comment objects and print them out.
        //Then use the “get” methods to print out the instance variables
        Comment c1 = new Comment("Bob","Hello","10/2/2022");
        System.out.println(c1.getPoster());
        System.out.println(c1.getComment());
        System.out.println(c1.getDate());

        Comment c2 = new Comment("John","Goodbye","10/3/2022");
        System.out.println(c2.getPoster());
        System.out.println(c2.getComment());
        System.out.println(c2.getDate());

    }
}
