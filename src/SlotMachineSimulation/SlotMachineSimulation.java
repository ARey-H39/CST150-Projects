package src.SlotMachineSimulation;

import javax.swing.JOptionPane;
import java.util.Random;

public class SlotMachineSimulation {
    public static void main(String[] args) {
        double moneyIn;
        double moneyOut;

        Random randomNumber = new Random();

        String selection1;
        String selection2;
        String selection3;
        String results;
        int matches;

        String input;
        boolean playAgain;

        do {
            String message =
                    "Welcome to the Slot Machine!\n\n"
                            + "How much money would you like to insert?";
            input = JOptionPane.showInputDialog(message);
            moneyIn = Double.parseDouble(input);

            selection1 = simulate(randomNumber.nextInt(6));
            selection2 = simulate(randomNumber.nextInt(6));
            selection3 = simulate(randomNumber.nextInt(6));

            results = selection1 + ", " + selection2 + ", " + selection3 + "\n";

            if(selection1.equals(selection2) && selection1.equals(selection3)) matches = 3;
            else if (selection1.equals(selection2) ||
                    selection2.equals(selection3) ||
                    selection3.equals(selection1)) matches = 2;
            else matches = 0;

            moneyOut = moneyIn * matches;

            switch (matches) {
                case 2:
                    message = "\nCongrats! You have 2 matches.\n";
                    break;
                case 3:
                    message = "\nJackpot! You have 3 matches.\n";
                    break;
                default:
                    message = "\nYou have 0 matches.\n";
            }

            do {
                input = JOptionPane.showInputDialog(
                        results + message +
                                "\nResults:\n"
                                + "\tInserted " + String.format("$%,.2f", moneyIn) + "\n"
                                + "\tWon " + String.format("$%,.2f", moneyOut) + "\n\n"
                                + "Would you like to play again? (Yes/No)");
                input = input.toLowerCase();
                if (input.equals("yes")) {
                    playAgain = true;
                } else if (input.equals("no")) {
                    playAgain = false;
                }
            } while (!(input.equals("yes")) && !(input.equals("no")));


            if (input.equals("yes")) {
                playAgain = true;
            } else {
                playAgain = false;
            }
        } while (playAgain);
    }

    public static String simulate(int randNum) {
        String result;

        switch (randNum) {
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
            default:
                result = "Error: Input is invalid";
        }
        return result;
    }
}
