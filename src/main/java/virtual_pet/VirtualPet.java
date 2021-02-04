package virtual_pet;


public abstract class VirtualPet {
    private String name;
    private String story;
    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int health;

    public VirtualPet(String name, String story) {
        this(name, story, 50, 60, 70, 80, 90);
    }

    public VirtualPet(String name, String story, int hunger, int thirst, int waste, int boredom, int health) {
        this.name = name;
        this.story = story;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.health = health;
        this.waste = waste;
    }

    public String getName() {

        return name;
    }

    public String getStory() {

        return story;
    }

    public int getHunger() {

        return hunger;
    }

    public int getThirst() {

        return thirst;
    }

    public int getWaste() {

        return waste;
    }

    public int getBoredom() {

        return boredom;
    }

    public int getHealth() {

        return health;
    }



    public void cleanWaste(){
        this.waste -= 5;
    }


    public void feedPet() {
        this.hunger -= 5;
        this.thirst += 4;
    }



    public void giveWater() {

        this.thirst -= 4;
    }


    public void goPlay() {
        this.boredom -= 2;
        this.health += 8;
        this.hunger += 5;
        this.thirst +=3;
    }


    public void tick() {

        this.hunger--;
        this.thirst--;
        this.waste++;
        this.boredom--;
        this.health--;

    }
}



