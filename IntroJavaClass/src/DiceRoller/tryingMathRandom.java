package DiceRoller;

public class tryingMathRandom {
    
    public static void main(String[] args) {
        // define the range
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        // generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;

            // output is differente
            System.out.println(rand);
        }
    }
}
