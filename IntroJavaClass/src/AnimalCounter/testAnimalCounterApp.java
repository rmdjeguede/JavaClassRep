package AnimalCounter;
import java.util.Scanner;

public class testAnimalCounterApp {
    private static Scanner sc = new Scanner(System.in);
    public static String animal;

    public static void main(String[] args) {

        // declaring variable to hold the number of time the user enter a type of animal.
            int countShHolder = 0;
            int countAlHolder = 0;
        // display a welcome message.
        System.out.println("Welcome to the animal counter program: ");
        System.out.println();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            // get an input from the user.
            System.out.print("Enter the animal you want to register: ");
            String animal = sc.nextLine();


            String sCount = "";
            if (animal.equalsIgnoreCase("alligator") ) {
                // create a count holder for alligator.
                countAlHolder += 1;

                for (int i = 0; i < countAlHolder; i++) {
                // call for the subclass object Alligators
                Alligators a = new Alligators(); 
                a.incrementCount(countAlHolder);                     // call the object incrementCount to count the animal
                sCount = a.getCountString();  
                System.out.println(sCount); }
            }
            else if (animal.equalsIgnoreCase("sheep")) {
                // create a count holder for the subclass sheep.
                countShHolder += 1;

                // call for the subclass sheep.
                Sheeps s = new Sheeps();
                s.incrementCount(countShHolder);
                sCount = s.getCountString();  
                System.out.println(sCount);  
            }
            else {
                System.out.println("Sorry, this is not a register animal yet! Working on it.");
            }
            

            System.out.print("Do you want to continue: (y/n) ");
            choice = sc.nextLine();
        }

    }
}

