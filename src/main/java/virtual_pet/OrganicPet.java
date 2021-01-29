package virtual_pet;

public class OrganicPet {
    private String name;
    private int hunger;
    private int thirst;
    private int boredom;

    public OrganicPet(String name, int hunger, int thirst, int boredom) {

        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;

    }

    public void greeting() {
        System.out.println("Hi my name is " + name + ". Here are my current stats:\n"
                +"\n"
                +"Hunger Level:    |" + hunger + "|\n"
                + "Thirst Level:    |" + thirst + "|\n"
                + "Boredom Level:   |" + boredom + "|\n"
                +"\n"
                + "Please take care of me!");
    }

    public String getName(){
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }


}
