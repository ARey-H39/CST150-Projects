package src.Rainfall;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] rainfallPerMonth = new double[12];

        Rainfall monthlyRain = new Rainfall();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("To use this program, enter the total rainfall per month."
                + "\nNegative values are not accepted.\n");

        for (int i = 0; i < monthlyRain.getMonths().length; i++) {
            double input = 0.0;

            do {
                if (input < 0) {
                    System.out.println("\nThat input is invalid. "
                            + "Enter a value greater than or equal to 0.");
                }

                System.out.print("Total rainfall in " + monthlyRain.getMonths()[i] + ": ");
                input = keyboard.nextDouble();
                rainfallPerMonth[i] = input;
            }
            while(input < 0);
        }

        monthlyRain.setFigures(rainfallPerMonth);

        System.out.println("\nTotal Rainfall per Month");
        System.out.printf("%9s: %-8.2f %9s: %-8.2f\n", monthlyRain.getMonths()[0], rainfallPerMonth[0], monthlyRain.getMonths()[6], rainfallPerMonth[6]);
        System.out.printf("%9s: %-8.2f %9s: %-8.2f\n", monthlyRain.getMonths()[1], rainfallPerMonth[1], monthlyRain.getMonths()[7], rainfallPerMonth[7]);
        System.out.printf("%9s: %-8.2f %9s: %-8.2f\n", monthlyRain.getMonths()[2], rainfallPerMonth[2], monthlyRain.getMonths()[8], rainfallPerMonth[8]);
        System.out.printf("%9s: %-8.2f %9s: %-8.2f\n", monthlyRain.getMonths()[3], rainfallPerMonth[3], monthlyRain.getMonths()[9], rainfallPerMonth[9]);
        System.out.printf("%9s: %-8.2f %9s: %-8.2f\n", monthlyRain.getMonths()[4], rainfallPerMonth[4], monthlyRain.getMonths()[10], rainfallPerMonth[10]);
        System.out.printf("%9s: %-8.2f %9s: %-8.2f\n\n", monthlyRain.getMonths()[5], rainfallPerMonth[5], monthlyRain.getMonths()[11], rainfallPerMonth[11]);

        System.out.println("Total rainfall: " + monthlyRain.yearTotal());
        System.out.println("Average monthly rainfall: " + monthlyRain.monthlyAverage());
        System.out.println("Most rainfall: " + monthlyRain.mostRainfall());
        System.out.println("Least rainfall: " + monthlyRain.leastRainfall());
    }
}
