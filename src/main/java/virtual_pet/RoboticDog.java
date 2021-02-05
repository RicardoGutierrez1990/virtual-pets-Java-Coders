package virtual_pet;

public class RoboticDog extends Robotic {
    public RoboticDog(String name, String story) {
        super(name, story);
    }

    public RoboticDog(String name, String story, int hunger, int thirst, int waste, int boredom, int health) {
        super(name, story, hunger, thirst, waste, boredom, health);
    }


}
