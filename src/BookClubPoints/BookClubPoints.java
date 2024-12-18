package src.BookClubPoints;

import javax.swing.JOptionPane;

public class BookClubPoints {
    public static void main(String[] args) {
        int booksPurchased; // Variable where input will be stored
        String input; // Variable to allow user input from dialog

        // Display dialog box and ask for user input
        input = JOptionPane.showInputDialog(
                "Book Club Points\n" +
                "Check how many points you have earned by the end of the month.\n\n" +
                "How many books have you purchased this month:"
        );
        // Parse input from dialog into integer
        booksPurchased = Integer.parseInt(input);

        // Give specific message based on user input
        switch (booksPurchased) {
            case 0:
                // If user inputs 0, display message in a dialog
                JOptionPane.showMessageDialog(null,
                        "Book Club Points\n\n" +
                                "I'm sorry, you have not earned any points this month.\n" +
                                "Earn points by purchasing books."
                );
                break;
            case 1:
                // If user inputs 1, display message in a dialog
                JOptionPane.showMessageDialog(null,
                        "Book Club Points\n\n" +
                                "Congrats! You have earned 15 points this month.\n" +
                                "Earn more points by purchasing more books."
                );
                break;
            case 2:
                // If user inputs 2, display message in a dialog
                JOptionPane.showMessageDialog(null,
                        "Book Club Points\n\n" +
                                "Congrats! You have earned 15 points this month.\n" +
                                "Earn more points by purchasing more books."
                );
                break;
            case 3:
                // If user inputs 3, display message in a dialog
                JOptionPane.showMessageDialog(null,
                        "Book Club Points\n\n" +
                                "Congrats! You have earned 30 points this month.\n" +
                                "Earn more points by purchasing more books."
                );
                break;
            default:
                if (booksPurchased >= 4)
                    // If user inputs 4 or greater, display message in dialog
                    JOptionPane.showMessageDialog(null,
                            "Book Club Points\n\n" +
                                    "Congrats! You have earned 60 points this month."
                    );
                else
                    // If user inputs a number less than 0 (just in case), display message in dialog
                    JOptionPane.showMessageDialog(null,
                            "Book Club Points\n\n" +
                                    "Sorry, that input is invalid.\n" +
                                    "Please try running the program again and input a number 0 or more."
                    );
                break;
        }
    }
}
