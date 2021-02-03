package virtual_pet;


public abstract class VirtualPet {

    protected String name;
    private String color;
    private boolean isAlive;
    private int age;

    public VirtualPet(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.isAlive = true;

    }

    public abstract void greeting();

    public void play() {
        System.out.println(name + " plays with owner");
    }

    public abstract void makeNoise();

    public void rest() {
        System.out.println(name + " is resting.");
    }

    public void die() {
        System.out.println(name + "is no longer with us :(");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getAge() {
        return age;
    }


}





































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
//
//
//
//    public void eat() {
//        energyLevel = energyLevel -5;
////   same thing     hunger -= 5;
//    }


