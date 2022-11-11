package classwork;

public class PetTesterClass {
    public static void main(String[] args){
        Pet Bob = new Pet("Bob", 2, 15.6, "Dog", "German Shepard");
        Pet Flinky = new Pet("Flinky", 2, 12.0, "Cat", "Siberian");
        Pet Test = new Pet();
        System.out.println(Flinky.getAge());
        System.out.println(Bob.getName());
        System.out.println(Test.getBreed());
    }
}
