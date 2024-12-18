package util.menu;

import util.program.Program;

import java.util.List;
import java.util.Scanner;

public class ProgramMenu extends Menu {
    private final Program program;

    public ProgramMenu(String title, String description, List<MenuItem> options, Program program) {
        super(title, description, options);
        this.program = program;
        if (program.isDialogs() || program.isFiles()) this.description += "\n---\n";
        if (program.isDialogs()) this.description += "(Runs in separate window, JOptionPane)";
        if (program.isFiles()) this.description += "(File I/O, outputs file to directory)";
    }

    @Override
    protected void processInput(int input) {
        if (input == numOfOptions + 1) {
            active = false;
        } else {
            System.out.println("\n\033[0;34m---- " + program.getTitle() + " ----\033[0m");
            if (program.isDialogs()) System.out.println("* Program running in a separate window.");
            program.run();
            if (!program.isDialogs()) {
                System.out.print("\033[0;36mPress Enter to continue...\033[0m");
                Scanner sc = new Scanner(System.in);
                sc.nextLine();
            }
            System.out.println("\033[0;34m---- " + program.getTitle() + " ----\033[0m\n");
        }
    }
}
