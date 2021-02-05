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

}

