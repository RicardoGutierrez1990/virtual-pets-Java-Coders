package virtual_pet;



import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualShelter {

    Map<String,virtualPet> virtualPets = new HashMap<>();

    //TODO
    // Take in a virtual pet.
    // Adopt out a virtual pet. - remove
    // Feed all virtual pets.
    // Give info about all virtual pets.

    public void takeIn(virtualPet virtualPet){
        virtualPets.put(virtualPet.getName(), virtualPet);
    }

    public void adoptOut(String name){
        virtualPets.remove(name);
    }

    public void feedAllvirtualPets(){
        for(virtualPet virtualPetToFeed : virtualPets.values()){
            virtualPetToFeed.eat();
        }
    }

    public Collection<virtualPet> retrieveAllvirtualPets(){
        return virtualPets.values();
    }


}