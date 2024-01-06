package TaskManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TaskDB {
    private static Connection getConnection() throws SQLException {
        String dbUrl = "jdbc:sqlite:task_manager.sqlite";
        Connection connection = DriverManager.getConnection(dbUrl);
        return connection;
    }

    // Return the history of completed task
    public static ArrayList<Task> getTask() {
        String sql  = "Select Name " + " From task";
        var  task = new ArrayList<Task>();
        try (Connection connection = getConnection();
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        Task t = new Task();
                        task.add(t);
                    }
                    return task;
                } catch (SQLException e) {
                    System.out.println(e);
                    return null;
                }
    }
     public static void addTask( String task) {
        String sql = "INSERT INTO task " + "VALUES (?)"; 
        try (Connection connection = getConnection();
                PrepareStatement ps = connection.prepareStatement(sql)) {
                    

        }
     }
    
}
