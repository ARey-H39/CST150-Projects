package util.menu;

import util.program.Program;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends Menu{
    public MainMenu(String title, String description, List<MenuItem> options) {
        super(title, description, options);
    }

    @Override
    protected void processInput(int input) {
        if (input == numOfOptions + 1) {
            active = false;
        } else {
            System.out.println();
            Program program = getOption(input).getProgram();
            Menu menu = new ProgramMenu(program.getTitle(), program.getDescription(),
                    new ArrayList<>(List.of(new MenuItem(1, "Run program", program))), program);
            menu.display();
            System.out.println();
        }
    }
}
