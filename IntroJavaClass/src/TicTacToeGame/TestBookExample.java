package TicTacToeGame;
import java.util.*; 
 
public class TestBookExample {
    
    public static void main(String[] args) {
        String[][] grid = { {"O", "X", "X"}, {"X", "O", "X"}, {"X", "X", "O"} };
        for (String[] row : grid) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
     }
}
