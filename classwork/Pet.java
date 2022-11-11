package classwork;

import java.net.http.HttpRequest.BodyPublisher;

public class Pet {
    private String name;
    private int age;
    private double weight;
    private String type;
    private String breed;

    public Pet(String iN, int iA, double iW, String iT, String iB){
        name = iN;
        age = iA;
        weight = iW;
        type = iT;
        breed = iB;

        
    }
    public Pet(){
        name = "Name";
        age = 0;
        weight = 0.0;
        type = "Animal";
        breed = "Breed";
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public String getType(){
        return type;
    }
    public String getBreed(){
        return breed;
    }
}
