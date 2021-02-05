package virtual_pet;


public abstract class Organic extends VirtualPet{
    public Organic(String name, String story) {
        super(name, story);
    }

    public Organic(String name, String story, int hunger, int thirst, int waste, int boredom, int health) {
        super(name, story, hunger, thirst, waste, boredom, health);
    }
}




