package virtual_pet;

public class OrganicCat extends Organic{
    public OrganicCat(String name, String story) {
        super(name, story);
    }

    public OrganicCat(String name, String story, int hunger, int thirst, int waste, int boredom, int health) {
        super(name, story, hunger, thirst, waste, boredom, health);
    }


}


