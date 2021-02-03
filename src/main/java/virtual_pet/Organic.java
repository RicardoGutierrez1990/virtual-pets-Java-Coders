package virtual_pet;


    public abstract class Organic extends VirtualPet {

        private int hungerLevel;
        private int thirstLevel;
        private int boredomLevel;

        public Organic(String name, String color, int age, int hungerLevel, int thirstLevel, int boredomLevel) {
            super(name, color, age);
            this.hungerLevel = hungerLevel;
            this.thirstLevel = thirstLevel;
            this.boredomLevel = boredomLevel;
        }

        public void eat(){
            System.out.println(name + " Thanks this food is good");
        }

        public void drink(){
            System.out.println(name + " Thanks for the drink");
        }


    }



