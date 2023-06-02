import javax.swing.JOptionPane;

/**
 * 
 * @author Henry Salinas
 */

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
    }
}
