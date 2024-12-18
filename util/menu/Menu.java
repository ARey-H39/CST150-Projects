package util.menu;

import java.util.List;
import java.util.Scanner;

public abstract class Menu {
    private final String title;
    private final List<MenuItem> options;
    protected String description;
    protected boolean active = false;
    protected int numOfOptions;

    public Menu(String title, String description, List<MenuItem> options) {
        this.title = title;
        this.description = description;
        this.options = options;
        this.numOfOptions = options.size();
    }

    public void display() {
        active = true;
        while (active) {
            System.out.println("\033[1;34m" + title.toUpperCase() + "\033[0m");
            if (description != null) {
                System.out.println(description + "\n---");
            }
            for (MenuItem option : options)
                System.out.println(option.getId() + ") " + option.getTitle().toUpperCase());
            System.out.println((options.size() + 1) + ") Exit");
            int input = getInput();
            processInput(input);
        }
    }

    private int getInput() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter your choice: ");
            input = scanner.nextInt();
            if (input >= 1 && input <= options.size() + 1) validInput = true;
        }

        return input;
    }

    protected MenuItem getOption(int id) {
        return options.get(id - 1);
    }

    protected abstract void processInput(int input);
}
