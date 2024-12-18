package src.TestAverage;

import java.util.Scanner;

public class TestAverage {
    public static void main (String[] args) {
        String studentName;
        double scoreOne;
        double scoreTwo;
        double scoreThree;
        double total;
        double average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Student's Name: ");
        studentName = keyboard.nextLine();

        System.out.print("Score 1: ");
        scoreOne = keyboard.nextDouble();

        System.out.print("Score 2: ");
        scoreTwo = keyboard.nextDouble();

        System.out.print("Score 3: ");
        scoreThree = keyboard.nextDouble();

        total = scoreOne + scoreTwo + scoreThree;
        average = total / 3;

        System.out.println(studentName + " has an average score of " + average + ".");
    }
}
