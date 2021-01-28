package virtual_pet;


public class VirtualPet {

        private String name;
        private int hunger;
        private int thirst;
        private int boredom;


    public VirtualPet(String name, int hunger, int thirst, int boredom){

        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;

    }

            public void greeting() {
            System.out.println("Hi my name is " + name + "! My hunger level is: "
                    + hunger + ". My thirst level is: " +
                     + thirst + ". My current mood is: "
                    + boredom + ". Please take care of me!");
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

