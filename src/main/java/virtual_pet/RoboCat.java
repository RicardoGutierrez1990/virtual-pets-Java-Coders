package virtual_pet;

   public class RoboCat extends Robotic {

       private int batteryLevel;
       private int oilLevel;
       private int boredomLevel;

       public RoboCat(String name, String color, int age, int batteryLevel, int oilLevel, int boredomLevel){
           super(name, color, age, batteryLevel, oilLevel, boredomLevel);

           this.batteryLevel = batteryLevel;
           this.oilLevel = oilLevel;
           this.boredomLevel = boredomLevel;

       }

       @Override
       public void greeting() {
           System.out.println("Hi my name is " + name + ". My color is " + getColor() + " and I am " + getAge() + " year old" +

                   ".\nHere are my current stats:\n"
                   + "\n"
                   + "Energy Level:  |" + batteryLevel + "|\n"
                   + "Oil Level:     |" + oilLevel + "|\n"
                   + "Boredom Level: |" + boredomLevel + "|\n"
                   + "\n"
                   + "Please take care of me!");

       }

       @Override
       public void makeNoise() {
           System.out.println(name + " RoboMeow! RoboMeow!");
       }

   }












//       public int getEnergyLevel(){
//           return energyLevel;
//       }
//
//       public int getOilLevel(){
//           return oilLevel;
//       }
//
//       public int getBoredomLevel(){
//           return boredomLevel;
//       }
//}
