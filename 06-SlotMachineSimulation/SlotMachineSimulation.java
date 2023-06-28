import javax.swing.JOptionPane;
import java.util.Random;

/**
 * 
 * @author Henry Salinas
 */

public class SlotMachineSimulation {

    public static void main(String[] args) {
        double moneyIn, moneyOut;

        String input;
        String selection1, selection2, selection3;
        String results;

        int matches;

        String message =
            "Welcome to the Slot Machine!\n\n" +
            "How much money would you like to insert?";
        input = JOptionPane.showInputDialog(message);
        moneyIn = Double.parseDouble(input);

        selection1 = simulate();
        selection2 = simulate();
        selection3 = simulate();

        results = selection1 + ", " + selection2 + ", " + selection3;

        // All 3 words match
        if (selection1.equals(selection2) && selection1.equals(selection3)) matches = 3;
        // Only 2 words match
        else if (selection1.equals(selection2) ||
                 selection2.equals(selection3) ||
                 selection3.equals(selection1)) matches = 2;
        // No matches found
        else matches = 0;

        moneyOut = moneyIn * matches;

        switch (matches) {
            case 2:
                message = "Congrats! You have 2 matches.";
                break;
            case 3:
                message = "Congrats! You have 3 matches.";
                break;
            default:
                message = "You have 0 matches";
        }

        JOptionPane.showMessageDialog(null,
            results + "\n" + 
            "\n" + message + "\n" + 
            "\nResults:\n" +
            "Inserted " + String.format("$%,.2f", moneyIn) + "\n" +
            "Won " + String.format("$%,.2f", moneyOut)
        );

        System.exit(0);
    }

    public static String simulate() {
        String result = "";

        Random randomNumber = new Random();

        switch (randomNumber.nextInt(6)) {
            case 0:
                result = "Cherries";
                break;
            case 1:
                result = "Oranges";
                break;
            case 2:
                result = "Plums";
                break;
            case 3:
                result = "Bells";
                break;
            case 4:
                result = "Melons";
                break;
            case 5:
                result = "Bars";
                break;
        }
        
        return result;
    }
}
