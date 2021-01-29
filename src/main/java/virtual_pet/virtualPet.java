package virtual_pet;


public class virtualPet {

    private String name;
    private int thirstLevel;
    private int hungerLevel;
    private int boredomLevel;


    public virtualPet(String name, int thirstLevel, int hungerLevel, int boredomLevel){

        this.name = name;
        this.thirstLevel = thirstLevel;
        this.hungerLevel = hungerLevel;
        this.boredomLevel = boredomLevel;

    }

    public void greeting() {
        System.out.println("Hi my name is " + name + ". Here are my current stats:\n"
                +"\n"
                +"Thirst Level:     |" + thirstLevel + "|\n"
                + "Hunger Level:     |" + hungerLevel + "|\n"
                + "Boredom Level:    |" + boredomLevel + "|\n"
                +"\n"
                + "Please take care of me!");
    }

    public String getName(){
        return name;
    }

    public int thirstLevel() {
        return thirstLevel;
    }

    public int hungerLevel() {
        return hungerLevel;
    }

    public int boredomLevel() {
        return boredomLevel;
    }



    public void eat() {
        hungerLevel = hungerLevel -5;
//   same thing     hunger -= 5;
    }
}

