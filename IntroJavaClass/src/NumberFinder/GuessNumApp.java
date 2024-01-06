package NumberFinder;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumApp {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println();

        System.out.println("Welcome to the Computer Guess Number Application.");
        System.out.println();
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            int target = GuessConsole.getInt("Enter a number between 1 and 100: ");

            // Call the recursive guess number class
            recursiveGuess(target, 0, 10);

            System.out.print("Would you like to play again? (y/n) ");
            choice = sc.nextLine();
            System.out.println();
        }
            if (choice.equalsIgnoreCase("n")) {
                System.out.println("Bye!");
            }
        }

            // generate a randon Array of 10 integers.
      public static int[] getArrays() {

        int[] num = new int[10]; // create a random object.
    
        int Coef = 100;
        for (int i = 0; i < 10; i++) {
            num[i] = ((int)(Math.random() * Coef));
        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        return num;

    }

    // class that calculate the middle using the binary search strategy.
    public static int calculateMiddle(int[]  arr, int left, int right) {
        
        left = 0;
        right = arr.length - 1;
        arr = getArrays();
        int mid = (left + ((right - left) / 2));
        System.out.println(mid);
        return mid;
    }
    
    public int count = 0;

    public static void recursiveGuess(int target, int left, int right) {

        int count = 0;
        int[] arr;
        arr = getArrays();
        

        while (left <= right) { 
            int mid = left + ((right - left) / 2);
            if (target == arr[mid]) {
                System.out.println("Correct Guess");
                break;
            } 
            else if (target > arr[mid]) {
                count += 1;
                System.out.println("Guess " + count + " is " + arr[mid]);
                left = mid + 1;
                mid = left + ((right - left) / 2);
            }
            else if (target < arr[mid]) {
                count += 1;
                System.out.println("Guess " + count + " is " + arr[mid]);
                right = mid -1;
                mid = left + ((right - left) / 2);
            }
            else {
                System.out.println("Number not found");
            }
        }
}
}
