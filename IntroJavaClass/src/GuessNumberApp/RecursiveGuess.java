package GuessNumberApp;

import java.util.Arrays;

public class RecursiveGuess {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Welcome to the Guess Number Game: ");
        System.out.println();

        String choice = "y";
        while (choice.equalsIgnoreCase("Y")) {
            
            // int target = Console.getInt("Enter an integer between 1 and 100 ");

            int left = 0;
            int[] arr = new int[11];
            arr = GenerateArrays();
            int right = arr.length - 1;
        
            int middle = left + ((right - left) / 2); 
            System.out.println(middle);

        }

    }

    public static int[] GenerateArrays() {
        int[] theArray = new int[11];
        for (int i = 0; i < theArray.length; i++) {
            theArray[i] = (int)(Math.random() * 100);
            Arrays.sort(theArray);
            
        }
        System.out.println(Arrays.toString(theArray));
        return theArray;
    }
    
}
