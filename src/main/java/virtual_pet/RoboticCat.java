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

    public static void greeting(String newPetName) {
         System.out.println("\nHi my name is " + newPetName + ". " + "I'm a Robotic Cat and can't wait to play with you!");

    }
}
