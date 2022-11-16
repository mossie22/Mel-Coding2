public class Song
{
   // Create at least 1 method called verse that takes parameters
   // that can be used to print out the verses of the song you chose
    private String verse1;
    private String verse2;
    private String verse3;
    

    public String printverse(String pverse){
        System.out.println(pverse);
    }

    public Song(String iv1, String iv2, String iv3){
        verse1 = iv1;
        verse2 = iv2;
        verse3 = iv3;

    }

   public static void main(String args[])
   {
       // Create a Song object and call its method(s) to print out
       // the verses of the song you chose
       // There should be at least 1 method called verse that takes arguments

        Song Around = new Song("Around the world, around the world", "Around the world, around the worldAround the world, around the world", "Around the world, around the worldAround the world, around the worldAround the world, around the world");
        Around.printverse(Around.verse1);
        Around.printverse(Around.verse2);
        Around.printverse(Around.verse1);
        Around.printverse(Around.verse3);

  }
}
