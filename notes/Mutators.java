package notes;

public class Mutators {
    //accessors get variables, mutoators change variables
    private String foodGroup;
    private boolean isHotDog;
    //constructiom with no aprapameter
    public Mutators() {
        foodGroup = "Grain";
        isHotDog = true;

    }
    public String getFoodGroup(){
        return foodGroup;
    }
    public boolean getIsHotDog(){
        return isHotDog;
    }
    public void setFoodGroup(String newFoodGroup){
        foodGroup = newFoodGroup;
    }
}
