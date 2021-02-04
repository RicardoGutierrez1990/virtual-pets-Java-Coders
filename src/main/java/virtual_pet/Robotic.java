package virtual_pet;

public class Robotic extends VirtualPet {
    public Robotic(String name, String story) {
        super(name, story);
    }

    public Robotic(String name, String story, int hunger, int thirst, int waste, int boredom, int health) {
        super(name, story, hunger, thirst, waste, boredom, health);
    }
}

