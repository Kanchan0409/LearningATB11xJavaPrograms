package Task;

public class Ternary_operator_grades {
    public static void main(String[] args) {
        /*Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59*/
        int marks = 70;
        if(marks > 100 || marks < 0)
            System.out.println("Invalid marks entered");
        else {
            String grade = marks >= 90 ? "A Grade" : marks >= 80 ? " B Grade" : marks >= 70 ? "C Grade" : marks >= 60 ? "D Grade" : "F Grade";
            System.out.println(grade);
        }
    }
}
