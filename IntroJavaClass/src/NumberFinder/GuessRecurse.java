package NumberFinder;

import java.util.ArrayList;
import java.util.Comparator;

public class GuessRecurse {
    
    // create a class to generate a random list of ten numbers strore in an ArrayList.
    public static ArrayList<Integer> getArray() {
        ArrayList<Integer> num = new ArrayList<>();
        int Coef = 100;

        for (int i = 0; i < 10; i++) {
            num.add((int)(Math.random() * Coef));
            num.sort(Comparator.naturalOrder()); // sort de ArrayList.
        }
        return num;
    }

    // create a class to obtain a ramdom high value.
    public static int getMax() {
        ArrayList <Integer> maxArray = new ArrayList<>();
        maxArray = getArray(); 
        int max = maxArray.get(9);

        return max;
    }

    // create a class that provide a random minimal value.
    public static int getMin() {
        ArrayList <Integer> minArray = new ArrayList<>();
        minArray = getArray();
        int min = minArray.get(0);

        return min;
    }

    // create a class to calculate the middle of a random high value and a random low value.
    public static int getMiddle() {

        int min = getMin();
        int max = getMax();

        int middle = (min + ((max - min) / 2));

        return middle;
    } 
}

