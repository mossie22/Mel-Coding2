public class Team
{
    // Static Variables
    // ...
    public static int totalTeams;
    public static int minTeams;

    // Public Methods
    public Team() 
    {
        minTeams = 6;
        totalTeams++;

    }
    
    // Static Methods 
    // ...
    public static boolean tournamentReady(){
        if(totalTeams >= minTeams){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        
        System.out.println(Team.tournamentReady());

    }



}
