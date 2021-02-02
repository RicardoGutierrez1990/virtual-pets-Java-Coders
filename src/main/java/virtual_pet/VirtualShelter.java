//package virtual_pet;
//
//
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//public class VirtualShelter {
//
//    Map<String, VirtualPet> virtualPets = new HashMap<>();
//
//    //TODO
//    // Take in a virtual pet.
//    // Adopt out a virtual pet. - remove
//    // Feed all virtual pets.
//    // Give info about all virtual pets.
//
//    public void takeIn(VirtualPet virtualPet){
//        virtualPets.put(virtualPet.getName(), virtualPet);
//    }
//
//    public void adoptOut(String name){
//        virtualPets.remove(name);
//    }
//
//    public void feedAllVirtualPets(){
//        for(VirtualPet virtualPetToFeed : virtualPets.values()){
//            virtualPetToFeed.eat();
//        }
//    }
//
//    public Collection<VirtualPet> retrieveAllVirtualPets(){
//        return virtualPets.values();
//    }
//
//
//}