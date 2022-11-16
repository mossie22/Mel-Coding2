package classwork;

public class Routine {
    private double school;
    private double sleep;
    private double friends;
    private double hobbies;

    public Routine(double ischool, double isleep, double ifriends, double ihobbies){
        school = ischool;
        sleep = isleep;
        friends = ifriends;
        hobbies = ihobbies;

    }
    public Routine(){
        school = 0.0;
        sleep = 0.0;
        friends = 0.0;
        hobbies = 0.0;
    }
    public double getSchool(){
        return school;
    }
    public void setSchool(double newSchool){
        school = newSchool;
    }

    public double getSleep(){
        return sleep;
    }
    public void setSleep(double newSleep){
        sleep = newSleep;
    }

    public double getFriends(){
        return friends;
    }
    public void setFriends(double newFriends){
        friends = newFriends;
    }

    public double getHobbies(){
        return hobbies;
    }
    public void setHobbies(double newHobbies){
        hobbies = newHobbies;
    }

    public double returnTotal(){
        return (hobbies + friends + sleep + school);
    }

    
}
