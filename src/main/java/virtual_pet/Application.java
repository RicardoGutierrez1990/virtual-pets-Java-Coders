package virtual_pet;

import java.util.Scanner;


public class Application {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String playersPetOption;




        System.out.println("\nWelcome to Virtual Pet!");
        System.out.println("Please pick a name for your pet: ");
        Scanner inputScanner = new Scanner(System.in);
        String petName = inputScanner.nextLine();


//        VirtualPet newRoboDog = new RoboDog(petName,3);
//        ((RoboDog) newRoboDog).greeting();


        System.out.println();
        System.out.println("Hello! my name is " + petName + "."+"\nBefore we continue, let's go over some options to find out what type of pet would you like me to be.\n");
        System.out.println("Please select one of our five options:\n");
        System.out.println("Press 1 for a Robotic Dog.");
        System.out.println("Press 2 for a Robotic Cat.");
        System.out.println("Press 3 for an Organic Dog.");
        System.out.println("Press 4 for an Organic Cat.\n");
        System.out.println("Press 5 to exit the game.");
        playersPetOption = input.nextLine();




//        String [] myPets = {"RoboDog"}
//        switch(playersPetOption){
//            case "1": {
//                RoboDog.greeting();
//                break;
//            }
//
//        default: {
//                System.out.println("This is not a valid option, Please try Again");
//            }
//        }


//        VirtualPet newRoboDog = new RoboDog(petName,3);
//        ((RoboDog) newRoboDog).greeting();






//        inputScanner = new Scanner(System.in);
//        int playersPetOption = inputScanner.nextInt();
//        inputScanner.nextLine();










    }
}




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

