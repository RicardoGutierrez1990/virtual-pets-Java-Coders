package virtual_pet;

public class RoboDog extends Robotic {



    public RoboDog(String name, String color, int age) {
        super(name, color, age,10,10,10);
    }


    @Override
    public void makeNoise() {
        System.out.println(name + " RoboBark! RoboBark!");
    }
}







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
