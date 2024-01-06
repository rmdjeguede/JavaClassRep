package DiceRoller;

public class MathRandom {

    // create a class that generate the random number:
    public static int mRandom() {
        int max = 12;
        int min = 1;
        int range = max - min + 1;
        // get the random number using Math.random method:
        int rand = (int)(Math.random() * range) + min;
        return rand;
    }

    
}
