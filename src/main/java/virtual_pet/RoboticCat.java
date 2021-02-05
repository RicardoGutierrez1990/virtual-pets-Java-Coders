package virtual_pet;

public class RoboticCat extends Robotic {
    public RoboticCat(String name, String story) {
        super(name, story);
    }

    public RoboticCat(String name, String story, int hunger, int thirst, int waste, int boredom, int health) {
        super(name, story, hunger, thirst, waste, boredom, health);
    }



    public static void makeNoise(){

        System.out.println("ROBO-MEOW! ROBO-MEOW!");
    }
}
