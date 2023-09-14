package twoone;

public class H2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "1");
        Dog dog2 = new Dog("Max", "2");

        System.out.println("Dog 1: " + dog1.getName() + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + dog2.getBreed());

        // Modifying dog attributes using setter methods
        dog1.setName("3");
        dog2.setBreed("4");

        
        System.out.println("Dog 1: " + dog1.getName() + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName()  + dog2.getBreed());
    }
}
    
    
        
    
class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}