package util.menu;
import util.program.Program;

public class MenuItem {
    private final int id;
    private final String title;
    private final Program program;

    public MenuItem(int id, String title, Program program) {
        this.id = id;
        this.title = title;
        this.program = program;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Program getProgram() {
        return program;
    }
}
