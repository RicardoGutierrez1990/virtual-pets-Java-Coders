package virtual_pet;

public class OrganicCat extends Organic{
    public OrganicCat(String name, String story) {
        super(name, story);
    }

    public OrganicCat(String name, String story, int hunger, int thirst, int waste, int boredom, int health) {
        super(name, story, hunger, thirst, waste, boredom, health);
    }


    public static void makeNoise(){
        System.out.println("MEOW! MEOW!");
    }

    public static void greeting(String newPetName) {
        System.out.println("\nHi my name is " + newPetName + " I love to chase mice and play with my owners, I'm not your typical cat!");
    }
}


