package AnimalCounter;

public class Alligators extends Animal {
    private String animal = "alligator";
    public int alligatorCount = 0;
    public String alligatorString = "";

    @Override
    public void incrementCount(int count) {
        alligatorCount = count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        return alligatorString = Integer.toString(alligatorCount) + " " + animal; 
    }
}
