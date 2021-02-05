package virtual_pet;

public class OrganicDog extends Organic{
    public OrganicDog(String name, String story) {
        super(name, story);
    }

    public OrganicDog(String name, String story, int hunger, int thirst, int waste, int boredom, int health) {
        super(name, story, hunger, thirst, waste, boredom, health);
    }

    public static void makeNoise(){

        System.out.println("BARK! BARK!");
    }

    public static void greeting(String newPetName) {
        System.out.println("\nHi my name is " + newPetName + " I'm an Organic Dog and I am happy to be in this new shelter!");
    }
}

