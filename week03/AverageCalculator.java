/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 2: Student Average Calculator
 *
 * Student: David Otokhina
 * Matriculation Number: 25/16254
 * Programme: Computer Science
 *
 * Reads a student's name and three course scores, then displays
 * the total and the average. As in the extension exercise, each
 * score must be between 0 and 100 before the result is calculated.
 */
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter score for Course 1: ");
        double score1 = input.nextDouble();

        System.out.print("Enter score for Course 2: ");
        double score2 = input.nextDouble();

        System.out.print("Enter score for Course 3: ");
        double score3 = input.nextDouble();

        // Extension exercise: every score must be in the range 0 to 100.
        boolean validScores = score1 >= 0 && score1 <= 100
                && score2 >= 0 && score2 <= 100
                && score3 >= 0 && score3 <= 100;

        if (validScores) {
            double total = score1 + score2 + score3;
            double average = total / 3.0;

            System.out.println("\n--- STUDENT RESULT ---");
            System.out.println("Student: " + name);
            System.out.printf("Total: %.2f%n", total);
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("\nInvalid input: each score must be between 0 and 100.");
        }

        input.close();
    }
}
