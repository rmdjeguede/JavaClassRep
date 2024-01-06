package AnimalCounter;

public class Sheeps extends Animal {
    private String animal = "Blackie";
    public int sheepCount = 0;
    public String sheepString = "";

    @Override
    public void incrementCount(int count) {
        sheepCount = count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        return sheepString = Integer.toString(sheepCount) + " " + animal; 
    }
    
}
