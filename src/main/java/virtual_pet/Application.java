package virtual_pet;

import java.util.Scanner;


public class Application {


    public static void main(String[] args) {


        System.out.println("\nHello and welcome to Virtual Pet!");
        System.out.println("Please pick a name for your future pet: ");
        Scanner inputScanner = new Scanner(System.in);
        String petName = inputScanner.nextLine();


        System.out.println("\nBefore we continue, let's go over some options to find out what type of pet would you like me to be.\n");
        System.out.println("Please select one of our five options:\n");
        System.out.println("Press 1 for a Robotic Dog.");
        System.out.println("Press 2 for a Robotic Cat.");
        System.out.println("Press 3 for an Organic Dog.");
        System.out.println("Press 4 for an Organic Cat.");
        System.out.println("Press 5 to exit the game.\n");

        Scanner input = new Scanner(System.in);
        String playersPetOption;
        playersPetOption = input.nextLine();

        RoboDog newRoboDog = new RoboDog(petName,"Silver",5,10,10,10);
        RoboCat newRoboCat = new RoboCat(petName, "Blue",1,10,10,10);
        OrganicDog newOrgDog = new OrganicDog(petName,"Black and Brown",7,10,10,10);
        OrganicCat newOrgCat = new OrganicCat(petName, "Orange",18,10,10,10);




        switch(playersPetOption){
            case "1": {
            newRoboDog.greeting();
            newRoboDog.makeNoise();
                break;
            }

            case "2": {
             newRoboCat.greeting();
             newRoboCat.makeNoise();
             break;
            }

            case "3": {
             newOrgDog.greeting();
             newOrgDog.makeNoise();
             break;
            }

            case "4": {
             newOrgCat.greeting();
             newOrgCat.makeNoise();
             break;
            }

            case "5": {
                System.out.println("GAME OVER. See you next time!");
                break;
            }

            default: {
                System.out.println("This is not a valid option, Please try Again");
            }
        }

    }
}



            //        String [] myPets = {"RoboDog"}

//        VirtualPet newRoboDog = new RoboDog(petName,3);
//        ((RoboDog) newRoboDog).greeting();






//        inputScanner = new Scanner(System.in);
//        int playersPetOption = inputScanner.nextInt();
//        inputScanner.nextLine();










//    Robotic sampleRobotic = new RoboDog("Fido","Black",5);
//
//    sampleRobotic.play();
//    sampleRobotic.maintenance();
//    sampleRobotic.makeNoise();













//        System.out.println("\nWelcome to Virtual Pet!");
//        System.out.println("Please pick a name for your pet: ");
//        Scanner inputScanner = new Scanner(System.in);
//        String petName = inputScanner.nextLine();
//
//
//        VirtualPet Pet = new VirtualPet(petName, 10, 10, 10);
//        Pet.greeting();
//
//        System.out.println("What type of pet would you like to adopt?:");
//        System.out.println();
//        System.out.println("Press 1 for ROBOTIC - Press 2 for ORGANIC");
//        inputScanner = new Scanner(System.in);
//        String playersOption = inputScanner.nextLine();
//
//        System.out.println("Awesome! you picked ROBOTIC! \n");
//        System.out.println("woulfdhuf");
//
//    }
//}

// System.out.println("This is not a valid option. Please try again.");

