package virtual_pet;

public abstract class Robotic extends VirtualPet {

//    private int batteryLevel;
//    private int oilLevel;
//    private int boredomLevel;

    public Robotic(String name, String color, int age, int batteryLevel, int oilLevel, int boredomLevel) {
        super(name, color, age);

//        this.batteryLevel = batteryLevel;
//        this.oilLevel = oilLevel;
//        this.boredomLevel = boredomLevel;
    }


    public void charge(){
        System.out.println(name + " Thanks! Battery level went up");
    }

    public void maintenance(){
        System.out.println(name + " Thanks! Oil level went up");
    }



    }

