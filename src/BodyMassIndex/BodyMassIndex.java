package src.BodyMassIndex;

import javax.swing.JOptionPane;

public class BodyMassIndex {
    public static void main(String[] args) {

        // Declare variables
        double height, weight, BMI;

        String input;

        // Ask for user's height
        input =  JOptionPane.showInputDialog("Enter your height (inches):");
        height = Double.parseDouble(input);

        // Ask for user's weight
        input = JOptionPane.showInputDialog("Enter your weight (lbs):");
        weight = Double.parseDouble(input);

        // Get Body Mass Index based on information given
        BMI = weight * 703 / (height * height);

        // Based on BMI, give a specific message
        if (BMI < 18.5) {
            String message = String.format("Your Body Mass Index (BMI) is : %.1f\n"
                    + "Based on your BMI, you are considered underweight.", BMI);
            JOptionPane.showMessageDialog(null, message);
        } else if (BMI > 25) {
            String message = String.format("Your Body Mass Index (BMI) is : %.1f\n"
                    + "Based on your BMI, you are considered overweight.", BMI);
            JOptionPane.showMessageDialog(null, message);
        } else {
            String message = String.format("Your Body Mass Index (BMI) is : %.1f\n"
                    + "Based on your BMI, you are at optimal weight.", BMI);
            JOptionPane.showMessageDialog(null, message);
        }
    }
}