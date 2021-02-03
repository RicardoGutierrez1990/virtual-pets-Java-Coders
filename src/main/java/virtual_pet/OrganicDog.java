package virtual_pet;

public class OrganicDog extends Organic{

    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

    public OrganicDog(String name, String color, int age, int hungerLevel, int thirstLevel, int boredomLevel) {
        super(name, color, age,hungerLevel, thirstLevel, boredomLevel);

        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;

    }

    @Override
    public void greeting() {
        System.out.println("Hi my name is " + name + ". My color is " + getColor() + " and I am " + getAge() + " years old" +

                ".\nHere are my current stats:\n"
                + "\n"
                + "Hunger Level:  |" + hungerLevel + "|\n"
                + "Thirst Level:  |" + thirstLevel + "|\n"
                + "Boredom Level: |" + boredomLevel + "|\n"
                + "\n"
                + "Please take care of me!");

    }

    @Override
    public void makeNoise() {
        System.out.println(name + " goes woof-woof");
    }
}

