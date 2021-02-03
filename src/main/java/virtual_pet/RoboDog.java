package virtual_pet;

public class RoboDog extends Robotic {

    private int batteryLevel;
    private int oilLevel;
    private int boredomLevel;

    public RoboDog(String name, String color, int age, int batteryLevel, int oilLevel, int boredomLevel) {
        super(name, color, age, batteryLevel,oilLevel,boredomLevel);

        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;
        this.boredomLevel = boredomLevel;

    }

    @Override
    public void greeting() {
        System.out.println("Hi my name is " + name + ". My color is " + getColor() + " and I am " + getAge() + " years old" +

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
        System.out.println(name + " RoboBark! RoboBark!");
    }

}














//    public int getEnergyLevel(){
//        return energyLevel;
//    }
//
//    public int getOilLevel(){
//        return oilLevel;
//    }
//
//    public int getBoredomLevel(){
//        return boredomLevel;
//    }









    //    private int energyLevel;
//    private int oilLevel;
//    private int boredomLevel;



//
//        public void greeting() {
//        System.out.println("Hi my name is " + name + ". I am a  " + getColor() +" RoboDog and I am " + getAge() + " years old\n"
//
//                + "Please take care of me!");
//    }






//
//    public RoboDog(int energyLevel, int oilLevel, int boredomLevel){
//        this.energyLevel = energyLevel;
//        this.oilLevel = oilLevel;
//        this.boredomLevel = boredomLevel;
//    }
//
//














//    private int thirstLevel;
//    private int energyLevel;
//    private int boredomLevel;
//
//
//    public VirtualPet(String name, int thirstLevel, int energyLevel, int boredomLevel){
//
//        this.name = name;
//        this.thirstLevel = thirstLevel;
//        this.energyLevel = energyLevel;
//        this.boredomLevel = boredomLevel;
//
//    }
//
//    public void greeting() {
//        System.out.println("Hi my name is " + name + ". Here are my current stats:\n"
//                +"\n"
//                +"Thirst Level:     |" + thirstLevel + "|\n"
//                + "Hunger Level:     |" + energyLevel + "|\n"
//                + "Boredom Level:    |" + boredomLevel + "|\n"
//                +"\n"
//                + "Please take care of me!");
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public int getThirstLevel() {
//        return thirstLevel;
//    }
//
//    public int getEnergyLevel() {
//        return energyLevel;
//    }
//
//    public int getBoredomLevel() {
//        return boredomLevel;
//    }
