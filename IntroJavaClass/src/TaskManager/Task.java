package TaskManager;

import java.util.*;

public class Task {
    private List<String> tasks;

    // create a  class constructor.
    public Task() {
        tasks = new ArrayList<>();
    }

    // create a public class that add task to the data base.
    public void addTask(String task) {
        tasks.add(task);
    }

    // declare a class that remove task from the database.
    public void removeTask(String task) {
        tasks.remove(task);
    }

    // create a class that provide the history of complete tasks.
    public List <String> getTasks() {
        return tasks;
    }

    // create a class that check if one task is complete.
    public boolean isTaskCompleted(String task) {
        return tasks.contains(task);
    }

}

