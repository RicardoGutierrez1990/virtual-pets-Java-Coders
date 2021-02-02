package virtual_pet;


public class VirtualPet {

    private String name;
    private int thirstLevel;
    private int energyLevel;
    private int boredomLevel;


    public VirtualPet(String name, int thirstLevel, int energyLevel, int boredomLevel){

        this.name = name;
        this.thirstLevel = thirstLevel;
        this.energyLevel = energyLevel;
        this.boredomLevel = boredomLevel;

    }

    public void greeting() {
        System.out.println("Hi my name is " + name + ". Here are my current stats:\n"
                +"\n"
                +"Thirst Level:     |" + thirstLevel + "|\n"
                + "Hunger Level:     |" + energyLevel + "|\n"
                + "Boredom Level:    |" + boredomLevel + "|\n"
                +"\n"
                + "Please take care of me!");
    }

    public String getName(){
        return name;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }



    public void eat() {
        energyLevel = energyLevel -5;
//   same thing     hunger -= 5;
    }
}

