package src.Conversion;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        double meters = 0;
        double convert;

        boolean quit = false;

        Scanner keyboard = new Scanner(System.in);

        // Check for valid input of meters
        do {
            System.out.print("Enter a distance in meters: ");
            meters = keyboard.nextDouble();

            if(meters < 0) {
                System.out.println("Input is invalid."
                        + " Distance cannot be negative."
                        + " Please try again.\n");
            }

            if(meters == 0) {
                System.out.println("Input is invalid."
                        + " Distance should be greater than 0."
                        + " Please try again.\n");
            }
        } while(!(meters > 0));

        // Ask user for how they want to convert meters
        do {

            int input;

            menu();
            System.out.print("\nEnter your choice: ");
            input = keyboard.nextInt();

            switch(input) {
                case 1:
                    convert = showKilometers(meters);
                    System.out.println(meters + " meters is " + convert + " kilometers.\n");
                    break;
                case 2:
                    convert = showInches(meters);
                    System.out.println(meters + " meters is " + convert + " inches.\n");
                    break;
                case 3:
                    convert = showFeet(meters);
                    System.out.println(meters + " meters is " + convert + " feet.\n");
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    quit = true;
                    break;
                default:
                    System.out.println("Input invalid.\n");
            }

        } while(!quit);
    }

    public static double showKilometers(double meters) {
        double kilometers = meters * 0.001;
        return kilometers;
    }

    public static double showInches(double meters) {
        double inches = meters * 39.37;
        return inches;
    }

    public static double showFeet(double meters) {
        double feet = meters * 3.251;
        return feet;
    }

    public static void menu() {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }
}
