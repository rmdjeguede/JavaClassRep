package TicTacToeGame;


public class printBoard {
    static String[][] grid;

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
