import java.util.List;
import java.util.ArrayList;

public class Undo {
    private static Undo instance;

    private Undo() {
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    private final List<String> commands = new ArrayList<>();

    public void addCommand(String cmd) {
        commands.add(cmd);

    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.remove(commands.size() - 1);
        }
    }

    public void showHistory() {
        for (String cmd : commands) {
            System.out.println(cmd);
        }
    }
}

