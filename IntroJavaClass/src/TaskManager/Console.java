package TaskManager;

import java.util.Scanner;

public class Console {
    private static Scanner sc = new Scanner(System.in);

    public static String geString(String prompt) {
        System.out.println(prompt);
        return (sc.nextLine());
    }
    
}
