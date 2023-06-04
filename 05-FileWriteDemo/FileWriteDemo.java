import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Henry Salinas
 */

 public class FileWriteDemo {
 
    public static void main(String[] args) throws IOException {
        String filename, friendName;
        int numFriends;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many friends do you have?: ");
        numFriends = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Enter the filename: ");
        filename = keyboard.nextLine();

        PrintWriter outputFile = new PrintWriter(filename);

        for (int i = 1; i <= numFriends; i++) {
            System.out.print("Enter the name of friend number " + i + ": ");
            friendName = keyboard.nextLine();
        }

        outputFile.close();
    }
}
