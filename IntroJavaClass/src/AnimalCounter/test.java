package AnimalCounter;
import java.util.Scanner;

public class test {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a valid interger: ");
        int userEntry = sc.nextInt();
        int count = 0;
        for (int a = 0; a < 20; a++) {
            if (userEntry == a) {
            count = a;
            System.out.println(count);
            }
        } 

    }
}
