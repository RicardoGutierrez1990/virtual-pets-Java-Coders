package virtual_pet;


    public abstract class Organic extends VirtualPet {

        public Organic(String name, String color, int age) {
            super(name, color, age);
        }

        public void eat(){
            System.out.println(name + " Thanks this food is good");
        }

        public void drink(){
            System.out.println(name + " Thanks for the drink");
        }


    }



