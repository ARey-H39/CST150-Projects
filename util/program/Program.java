package util.program;

import java.lang.reflect.InvocationTargetException;

public class Program {
    private final String title;
    private final String description;
    private final Class<?> program;
    private boolean dialogs = false;
    private boolean files = false;

    public Program(String title, String description, Class<?> program) {
        this.title = title;
        this.description = description;
        this.program = program;
    }

    public Program(String title, String description, Class<?> program, boolean dialogs) {
        this.title = title;
        this.description = description;
        this.program = program;
        this.dialogs = dialogs;
    }

    public Program(String title, String description, Class<?> program, boolean dialogs, boolean files) {
        this.title = title;
        this.description = description;
        this.program = program;
        this.dialogs = dialogs;
        this.files = files;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDialogs() {
        return dialogs;
    }

    public boolean isFiles() {
        return files;
    }

    public void run() {
        try {
            program.getMethod("main", String[].class).invoke(program, (Object) new String[]{});
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
//            e.printStackTrace();
            System.out.println("* Something went wrong...");
        }
    }
}
