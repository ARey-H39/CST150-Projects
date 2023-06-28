import javax.swing.JOptionPane;

/**
 * 
 * @author Henry Salinas
 */

public class SlotMachineSimulation {

    public static void main(String[] args) {
        double moneyIn;

        String input;

        String message =
            "Welcome to the Slot Machine!\n\n" +
            "How much money would you like to insert?";
        input = JOptionPane.showInputDialog(message);
        moneyIn = Double.parseDouble(input);

        System.exit(0);
    }
}
