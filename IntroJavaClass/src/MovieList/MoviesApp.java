package MovieList;
import java.util.Scanner;

public class MoviesApp {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Movie List Application: ");
        System.out.println();

        String choice = "Y";
        while(choice.equalsIgnoreCase("y")) {
            int catNumber = MovieConsole.getInt(
            """ 
            1. Animated
            2. Drama
            3. Horror
            4. Musical
            5. Scifi
            6. Comedy
            
            Enter category number: """
            );

            if (catNumber == 1) {
                MovieDB.getanimated();
            }
            else if (catNumber == 2) {
                MovieDB.getdrama();
            }
            else if (catNumber == 3) {
                MovieDB.gethorror();
            }
            else if (catNumber == 4) {
                MovieDB.getmusical();
            }
            else if (catNumber == 5) {
                MovieDB.getscifi();
            }
            else if (catNumber == 6) {
                MovieDB.getcomedy();
            }
            else {
                System.out.println("There is no such category yet!");
            }

            System.out.print("Would like to continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println(choice);
            System.out.println();
        }
    }
}
