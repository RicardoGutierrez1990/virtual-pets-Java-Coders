package virtual_pet;

public abstract class Robotic extends VirtualPet {



    public Robotic(String name, String color, int age) {
        super(name, color, age);
    }


    public void charge(){
        System.out.println(name + " Thanks! Battery level went up");
    }

    public void maintenance(){
        System.out.println(name + " Thanks! Oil level went up");
    }

    }

