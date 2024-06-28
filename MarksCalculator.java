import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;
        
        // Take marks obtained in each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        
        // Calculate total marks
        System.out.println("Total Marks: " + totalMarks);
        
        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;
        System.out.println("Average Percentage: " + averagePercentage);
        
        // Calculate grade
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else if (averagePercentage >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }
        
        // Display results
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
