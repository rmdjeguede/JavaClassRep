package AnimalCounter;

/**
 * Countable
 */
// Creating an interface named Countable:
public interface Countable {
    void incrementCount(int count);
    void resetCount();
    int getCount();
    String getCountString();
}