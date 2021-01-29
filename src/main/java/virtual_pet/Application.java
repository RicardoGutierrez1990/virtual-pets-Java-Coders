package virtual_pet;

import java.util.Scanner;


public class Application {


    public static void main(String[] args) {
        System.out.println("\nWelcome to Virtual Pet!");
        System.out.println("Please select a Pet option (Please type 1 for ROBOTIC, 2 for ORGANIC, 3 QUIT GAME) ");

        Scanner inputScanner = new Scanner(System.in);
        int petOption = inputScanner.nextInt();
        inputScanner.nextLine();

        do {
            if (petOption == 3) {
                System.out.println("See you next time!");
                break;
            } else if (petOption == 1) {
                System.out.println("You've Selected a ROBOTIC pet option!");
                System.out.println("Please input your new pet's name: ");
                String playersPickedName = inputScanner.nextLine();


                RoboticPet newRoboPet = new RoboticPet(playersPickedName, 10, 10, 10);
                newRoboPet.greeting();
                break;
            } else if (petOption == 2) {
                System.out.println("You've Selected an ORGANIC pet option!");
                System.out.println("Please input your new pet's name: ");
                String playersPickedName = inputScanner.nextLine();


                OrganicPet newOrgPet = new OrganicPet(playersPickedName, 10, 10, 10);
                newOrgPet.greeting();
                break;
            }

            else {
                System.out.println("This is not a valid option. Please try again.");
                continue;
            }

        } while (petOption != 0 && petOption > 4);

    }
}

