package NumberFinder;
import java.util.ArrayList;
import java.util.Comparator;


public class RecGuessNum {

    // generate a randon Array of 10 integers.
    public static ArrayList <Integer> getArr() {

        ArrayList <Integer> num = new ArrayList<>(); // create a random object.
    
        int Coef = 100;
        for (int i = 0; i < 10; i++) {
            num.add((int)(Math.random() * Coef));
        }
        num.sort(Comparator.naturalOrder());
        return num;

    }


        public static int calculateMiddle(ArrayList <Integer> arr) {
        
            arr = getArr();
            int mid = (arr.get(0) + ((arr.get(9) - arr.get(0)) / 2));
            return mid;
        }
    public int count = 0;
    public static void recursiveGuess(int target) {

        int count = 0;
        ArrayList <Integer> arr = new ArrayList<>();
        arr = getArr();
        int mid = calculateMiddle(arr);

        for (int i = 0; i < 21; i++ ) {
            if (target == arr.get(mid)) {
                System.out.println("Correct Guess");
            } 
            else if (target > arr.get(mid)) {
                count += 1;
                System.out.println("Guess " + count + " is " + arr.get(mid));
                arr.add(mid, target);
                mid = calculateMiddle(arr);
            }
            else if (target < arr.get(mid)) {
                count += 1;
                System.out.println("Guess " + count + " is " + arr.get(mid));
                arr.add(mid, target);
                mid = calculateMiddle(arr);
            }
        }
    }
    
}
