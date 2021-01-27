package virtual_pet;

import java.util.Scanner;


public class Application {

//    static VirtualPet fido = new VirtualPet("Fido", 10,10,10);

    public static void main(String[] args) {
        System.out.println("Welcome to Virtual Pet!");
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please input your new pet's name? ");
        String firstName = inputScanner.nextLine();

        VirtualPet playersPickedName = new VirtualPet(firstName, 10,10,10);

        playersPickedName.greeting();
    }




}
