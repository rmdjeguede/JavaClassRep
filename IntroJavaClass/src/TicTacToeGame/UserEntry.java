package TicTacToeGame;
import java.util.Scanner;

public class UserEntry {
    private static Scanner sc = new Scanner(System.in);
    static String[][] grid;

    public static void uEntry() {

        for (int a = 0; a < 9; a++) {
            // Take the first player input.
            System.out.println("It's X turn to play: ");
            System.out.print("Pick a Row (1, 2, 3)");
            int pOneRow = sc.nextInt();
            System.out.print("Pick a Column (1, 2, 3): ");
            int pOneCol = sc.nextInt();
            System.out.println();
            pBoard();

            // Take the second player input.
            System.out.println("It's O turn to play: ");
            System.out.print("Pick a Row (1, 2, 3)");
            int pTwoRow = sc.nextInt();
            if (pTwoRow == pOneRow) {
                System.out.print("Pick a Row (1, 2, 3) except" + pOneRow);
            } else {
                continue;
            }
            System.out.print("Pick a Column (1, 2, 3): ");
            int pTwoCol = sc.nextInt();
                        if (pTwoCol == pOneCol) {
                System.out.print("Pick a Column (1, 2, 3) except" + pOneCol);
            } else {
                continue;
            }
            System.out.println();
            pBoard();
            }

    }

    public static void pBoard() {
        String[][] grid = {{" ", " "," "},
                                   {" ", " ", " "},
                                   {" ", " ", " "}};
        System.out.println("+---+---+---+");
        System.out.println("| " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + " |" );
        System.out.println("| " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + " |" );
        System.out.println("| " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + " |" );
        System.out.println("+---+---+---+");
    }
    
    
}
