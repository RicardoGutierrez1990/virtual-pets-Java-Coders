package virtual_pet;

public class RoboticDog extends Robotic {
    public RoboticDog(String name, String story) {
        super(name, story);
    }

    public RoboticDog(String name, String story, int hunger, int thirst, int waste, int boredom, int health) {
        super(name, story, hunger, thirst, waste, boredom, health);
    }

    public static void makeNoise(){

        System.out.println("ROBO-BARK! ROBO-BARK!");
    }


    public static void greeting(String newPetName) {
        System.out.println("\nHi my name is " + newPetName + " I'm a Robot Dog. I hate when it rains for it messes with my wiring!");
    }
}
