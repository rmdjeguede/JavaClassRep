package GradeConverter;
import java.util.Scanner;

public class GradeConverter {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Letter Grade Converter \n");

        String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            // get the numerical grade from the user
            System.out.print("Enter numerical grade: ");
            int numGrade = Integer.parseInt(sc.nextLine());

            // call the methode that convert the grade
            String gradeConvert = gradeConvertion(numGrade);

            // show the convertion to the user
            System.out.println("Letter grade: " + gradeConvert);

            // see if the user want to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }

    public static String gradeConvertion(int numGrade) {

        String gradeConvert = "";
        if (numGrade >= 88 && numGrade <101) {
            gradeConvert = "A";
        }
        else if (numGrade >= 80 && numGrade < 88) {
            gradeConvert = "B";
        }
        else if (numGrade >= 67 && numGrade < 80) {
            gradeConvert = "C";
        }
        else if (numGrade >= 60 && numGrade < 67) {
            gradeConvert = "D";
        }
        else if (numGrade < 60) {
            gradeConvert = "F";
        }
        else {
            System.out.println("Entry must be between 1 and 100! ");
            gradeConvert = "Don't Know!";
        }
        return gradeConvert;
    }
}
