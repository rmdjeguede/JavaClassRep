package DiceRoller;
import java.util.Scanner;

public class DiceRoller {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dice Roller");
        System.out.println();

        // create the loop for the dice rolling app
        System.out.print("Roll the dice? (y/n): ");
        String choice = sc.nextLine();
        System.out.println();

        // starting of the loop
        while (!choice.equalsIgnoreCase("n")) {
            int randOne = MathRandom.mRandom();
            System.out.print("Die: " + randOne);
            System.out.println();
            int randTwo = MathRandom.mRandom();
            System.out.println("Die: " + randTwo);
            int total = randOne + randTwo;
            System.out.print("Total: " + total);
            System.out.println();
            if (randOne == 1 && randTwo == 1) {
                System.out.println("Snake eyes!");
            }
            else if (randOne == 6 && randTwo == 6) {
                System.out.println("Boxcars!");
            }
            System.out.println();

            // check if the user want to continue:
            System.out.print("Roll again? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
            
        }
    }
}
