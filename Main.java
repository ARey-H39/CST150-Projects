import src.BodyMassIndex.BodyMassIndex;
import src.BookClubPoints.BookClubPoints;
import src.Conversion.Conversion;
import src.FileWriteDemo.FileWriteDemo;
import src.SlotMachineSimulation.SlotMachineSimulation;
import src.StockCommission.StockCommission;
import src.TestAverage.TestAverage;
import util.menu.MainMenu;
import util.menu.Menu;
import util.menu.MenuItem;
import util.program.Program;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Program> programs = createPrograms();
        Menu mainMenu = createMainMenu(programs);

        mainMenu.display();
    }

    private static ArrayList<Program> createPrograms() {
        ArrayList<Program> programs = new ArrayList<>();

        // Skills: Printing statements, accepting and cleaning user input, arithmetics
        programs.add(new Program("Test Average", """
                A program that calculates the average of three given test scores.""",
                TestAverage.class
        ));

        // Skills: Dialog boxes to ask for user input and display information, arithmetics
        programs.add(new Program("Stock Commission", """
                A program that calculates the total cost of a stock purchase, including the
                stock price and the commission fee.""",
                StockCommission.class, true
        ));

        // Skills: Decision structures (if/else)
        programs.add(new Program("Body Mass Index", """
                A program that calculates a person's Body Mass Index (BMI) based on their weight
                in pounds and height in inches. It then categorizes the BMI as underweight,
                optimal, or overweight.""",
                BodyMassIndex.class, true
        ));

        // Skills: Decision structures (switch/case)
        programs.add(new Program("Book Club Points", """
                A program that calculates and displays the loyalty points earned by a bookstore
                customer based on their monthly book purchases. The program utilizes a tiered
                point system, rewarding customers with increasing points for greater book purchases.""",
                BookClubPoints.class, true
        ));

        // Skills: File I/O, loops
        programs.add(new Program("File Write Demo", """
                A basic program designed to explore the process of opening, writing to, and saving files.""",
                FileWriteDemo.class, false, true
        ));

        programs.add(new Program("Slot Machine Simulation", """
                A slot machine simulator that generates random fruit symbols. Users can input a
                bet amount and win based on matching symbols: two matching symbols double the
                bet, and three matching symbols triple it.""",
                SlotMachineSimulation.class, true
        ));

        programs.add(new Program("Conversion Program", """
                A program that converts distances between meters, kilometers, inches, and feet.
                Users input a distance in meters and select the desired conversion unit.""",
                Conversion.class
        ));

        programs.add(new Program("Rainfall Class", """
                A program that creates a Rainfall class to store and analyze monthly rainfall data.
                The class provides methods to calculate total annual rainfall, average monthly
                rainfall, and identify months with the highest and lowest rainfall.""",
                src.Rainfall.Main.class
        ));

        return programs;
    }

    private static MainMenu createMainMenu(List<Program> programs) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        int i = 1;
        for (Program program : programs) {
            menuItems.add(new MenuItem(i, program.getTitle(), program));
            i++;
        }
        return new MainMenu("Main Menu", null, menuItems);
    }
}
