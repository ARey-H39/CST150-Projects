import javax.swing.JOptionPane;

/**
 * 
 * @author Henry Salinas
 */

 public class BookClubPoints {
 
    public static void main(String[] args) {
        // Variable where input will be stored
        int booksPurchased;

        // Variable to allow user input from dialog
        String input;

        // Display dialog box and ask for user input
        input = JOptionPane.showInputDialog(
                "Book Club Points\n" +
                "Check how many points you have earned by the end of the month.\n\n" +
                "How many books have you purchased this month:"
        );
        // Parse input from dialog into integer
        booksPurchased = Integer.parseInt(input);

        // End dialogs
        System.exit(0);
    }
 }
