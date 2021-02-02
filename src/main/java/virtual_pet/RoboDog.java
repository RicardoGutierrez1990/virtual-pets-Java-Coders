package virtual_pet;

public class RoboDog extends Robotic {


    public RoboDog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " RoboBark! RoboBark!");
    }
}
