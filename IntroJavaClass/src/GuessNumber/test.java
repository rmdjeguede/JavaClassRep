package GuessNumber;

import java.util.Scanner;


public class test {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter an integer between 10 and 35: ");
        System.out.println();

        int target = sc.nextInt();
        int[] getArray = {12, 15, 17, 19, 22, 24, 26, 29, 31, 32, 34};
        int low = 0;
        int hight = 10;

        while (low <= hight) {
            int middle = low + ((hight - low) / 2);

            if (getArray[middle] < target) {
                low = middle + 1;
            }
        }
    }


   
}

    

