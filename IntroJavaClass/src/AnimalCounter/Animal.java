package AnimalCounter;

public abstract class Animal implements Countable {

    public static int count = 0;
    public static String sCount;

    @Override
    public void incrementCount(int count) {
       Animal.count = count;
    }
    
    @Override
    public void resetCount() {
         count = 0;
    }

    
    public static int getCount(int count) {
        return count;
    }

    public static String getCountString(int count) {
        return sCount = Integer.toString(count); 
    }

   
}
