package virtual_pet;

   public class RoboCat extends Robotic{

       public RoboCat(String name, String color, int age) {
           super(name, color, age,10,10,10);
       }

       @Override
    public void makeNoise() {
           System.out.println(name + "RoboMeow! RoboMeow!");
    }
}
