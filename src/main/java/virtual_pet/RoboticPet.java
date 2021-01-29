package virtual_pet;


public class RoboticPet {

    private String name;
    private int batteryLevel;
    private int oilLevel;
    private int boredom;


    public RoboticPet(String name, int batteryLevel, int oilLevel, int boredom){

        this.name = name;
        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;
        this.boredom = boredom;

    }

    public void greeting() {
        System.out.println("Hi my name is " + name + ". Here are my current stats:\n"
                +"\n"
                +"The goal of the game if to bring my boredom level to 20\n"
                +"Battery Level:    |" + batteryLevel + "|\n"
                + "Oil Level:        |" + oilLevel + "|\n"
                + "Boredom Level:    |" + boredom + "|\n"
                +"\n"
                + "Please take care of me!");
    }

    public String getName(){
        return name;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getBoredom() {
        return boredom;
    }


}

