public class CopySong
{
   // Create at least 1 method called verse that takes parameters
   // that can be used to print out the verses of the song you chose
    public static String verse1;
    public static String verse2;
    public static String verse3;
    public static int numVerses;

    public static String printverse(String pverse){
        System.out.println(numVerses);
        System.out.println(pverse);
        System.out.println(numVerses);
        numVerses++;
    }

    public CopySong(String iv1, String iv2, String iv3){
        verse1 = iv1;
        verse2 = iv2;
        verse3 = iv3;

    }

   public static void main(String args[])
   {
       // Create a Song object and call its method(s) to print out
       // the verses of the song you chose
       // There should be at least 1 method called verse that takes arguments
        CopySong.printverse(verse1);
        CopySong.printverse(verse2);
        CopySong.printverse(verse1);
        CopySong.printverse(verse3);
        
        
  }
}
