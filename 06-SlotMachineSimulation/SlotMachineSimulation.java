import javax.swing.JOptionPane;
import java.util.Random;

/**
 * 
 * @author Henry Salinas
 */

public class SlotMachineSimulation {

    public static void main(String[] args) {
        double moneyIn;

        String input;
        String selection1, selection2, selection3;

        String message =
            "Welcome to the Slot Machine!\n\n" +
            "How much money would you like to insert?";
        input = JOptionPane.showInputDialog(message);
        moneyIn = Double.parseDouble(input);

        selection1 = simulate();
        selection2 = simulate();
        selection3 = simulate();

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
