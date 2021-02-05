package virtual_pet;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {

        System.out.println("\n....It's a cold winter night of February 2021 in Columbus Ohio.");
        System.out.println("\nYou went out for a walk to clear your head from a school project you could not figure out. " +
                "\nAs you are walking down the street you hear a soft bark coming from the bushes covered in snow. Bark! Bark!.. It's a puppy!!" +
                "\nYou decide to take the dog to the closest shelter, which happens to be open 24/7 and takes Organic and Robotic pets! \n");
        System.out.println("\nWelcome to WE ARE ALL ONE Shelter! Where pets from all types are welcomed.\n");
        System.out.println("\nWhat is your puppies name?");
        Scanner inputScanner = new Scanner(System.in);
        String puppiesName = inputScanner.nextLine();
        String petChoice;

        Scanner input = new Scanner(System.in);
        virtual_pet.VirtualPetShelter pets = new VirtualPetShelter();

        VirtualPet pet1 = new OrganicDog(puppiesName, "Young puppy found in the bushes. Pure breed husky looking to find some friends and a family to become part of.", 40, 50, 90, 30, 80);

        pets.add(pet1);

        String decision = "";
        while (!decision.equalsIgnoreCase("Yes")) {

            System.out.println("");

            System.out.println("This is how the pets in the shelter are doing today: \n");

            System.out.println("Name\t|Hunger\t|Thirst\t|Waste\t|Boredom|Health\t");
            System.out.println("--------|-------|-------|-------|-------|-------");
            System.out.println();
            System.out.println(pets.petStatus());
            System.out.println("\nWhat would you like to do next?\n");

            System.out.println("1. Feed ALL Organic pets.");
            System.out.println("2. Give water to ALL Organic pets.");
            System.out.println("3. Charge ALL Robotic pets.");
            System.out.println("4. Oil Change on ALL Robotic pets.");
            System.out.println("5. Play with a pet.");
            System.out.println("6. Clean ALL organic pets cages.");
            System.out.println("7. Take a pet out of the shelter to a new home.");
            System.out.println("8. Admit a pet.");
            System.out.println("9. Quit");

            String numberInput = input.nextLine();
            if (numberInput.equals("1")) {
                pets.feedAllPets();
                System.out.println("\nYUM! That food was delicious. Thank you so much!\n");

            } else if (numberInput.equals("2")) {
                pets.waterAll();
                System.out.println("AHHHHHH.. Nice cold and refreshing water. We are not thirsty anymore. Thank you!\n");

            } else if (numberInput.equals("3")) {

                System.out.println("\nCHARGING...\n" +
                        "CHARGING...\n" +
                        "ALL Robotic pets have been charged. Thank you! We are full of energy to carry on with our day.");

            } else if (numberInput.equals("4")) {

                System.out.println("\nCHECKING OIL LEVELS...\n" +
                        "REPLACING OLD OIL...\n" +
                        "MAINTENANCE IN PROGRESS...\n" +
                        "ALL Robotic pets are up to date. Thank you! Now all of our parts won't make tha squiggly noise again! ");

            } else if (numberInput.equals("5")) {
                System.out.println("\nPlease choose one of our available pets.");
                System.out.println("\nWhich pet would you like to play with today? (Please input pet's name exactly as shown below)\n");
                System.out.println(pets.availableOptions());
                String petName = input.nextLine();

                pets.play(petName);
                System.out.println("\nGood call! " + petName + " will be excited to spend some time with you playing!.\n");

            } else if (numberInput.equals("6")) {
                pets.cleanAllWaste();
                System.out.println("\nSWEEPING...\n" +
                        "PICKING UP POOP...\n" +
                        "HOSING DOWN AND WASHING FLOORS... \n" +
                        "\nAll set! these cages look spotless. Thank you so much for cleaning our cages. We like to live in a clean environment.\n");


            } else if (numberInput.equals("7")) {
                System.out.println("Awesome! It's time for a lucky pet to find a new family.");
                System.out.println("Which pet would you like to send out?\n");
                System.out.println(pets.availableOptions());
                String petName = input.nextLine();

                if (!pets.doesPetRemain(petName)) {
                    System.out.println("This pet does not exist.");
                } else {
                    pets.adopt(petName);
                    System.out.println(petName + " is sad and will miss the shelter, but at the same time excited for the new home and adventures to come!");
                }


            } else if (numberInput.equals("8")) {
                System.out.println("\nPlease enter the name of the pet you are turning in: ");
                String newPetName = input.nextLine();

                System.out.println("Please tell us " + newPetName + "'s story. Something unique we should know about the pet.");
                String newPetStory = input.nextLine();



                System.out.println("What kind of pet is it? " +
                        "\n1)Organic Dog  " +
                        "\n2)Organic Cat  " +
                        "\n3)Robot Dog  " +
                        "\n4)Robot Cat");
                System.out.println("\nUse the number to select your answer:");
                petChoice = input.nextLine();
                switch (petChoice) {
                    case "1": {
                        pets.add(new OrganicDog(newPetName, newPetStory));
                        System.out.println("\nHi my name is " + newPetName + " I'm an Organic Dog and I am happy to be in this new shelter! BARK! BARK!");
                        break;
                    }
                    case "2": {
                        pets.add(new OrganicCat(newPetName, newPetStory));
                        System.out.println("\nHi my name is " + newPetName + " I love to chase mice and play with my owners, I'm not your typical cat!");
                        break;
                    }
                    case "3": {
                        pets.add(new RoboticDog(newPetName, newPetStory));
                        System.out.println("\nHi my name is " + newPetName + " I'm a Robot Dog. I hate when it rains for it messes with my good looks!");

                        break;
                    }
                    case "4": {
                        pets.add(new RoboticCat(newPetName, newPetStory));
                        System.out.println("\nHi my name is " + newPetName + ". " + "I'm a Robotic Cat and can't wait to play with you!");
                        break;
                    }
                    default: {
                        System.out.println("Wrong input, please try again!");
                    }

                }
                System.out.println("\nThanks for leaving your pet with us! It will receive all the love and attention it needs.\n");


            } else if (numberInput.equals("9")) {
                System.out.println("Are you sure you wish to quit the game?");
                System.out.println("Enter Yes or No");
                decision = input.nextLine();

                if (decision.equalsIgnoreCase("Yes")) {
                    System.out.println("You have quit the game...");

                } else {
                    decision.equalsIgnoreCase("No");
                    System.out.println("Glad you are still with us.");
                    System.out.println("Thank you for being a friend... Traveled down a road and back again... Your heart is true, you're a pal and a confidant.\n");
                }

            }
            pets.tickAll();
        }

        input.close();
    }
}
