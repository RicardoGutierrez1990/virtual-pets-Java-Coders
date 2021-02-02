package virtual_pet;

import java.util.Scanner;


public class Application {


    public static void main(String[] args) {
        System.out.println("\nWelcome to Virtual Pet!");
        System.out.println("Please pick a name for your pet: ");
        Scanner inputScanner = new Scanner(System.in);
        String petName = inputScanner.nextLine();


        VirtualPet Pet = new VirtualPet(petName, 10, 10, 10);
        Pet.greeting();

    }
}

