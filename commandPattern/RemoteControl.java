package commandPattern;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private Map<String, Command> commands = new HashMap<>();

    public Command getCommand(String slot) {
        return commands.get(slot);
    }

    public void setCommand(String slot, Command command) {
        this.commands.put(slot, command);
    }

    public String clickButton(String slot) {
        Command command = commands.get(slot);
        if (command == null) {
            return "No command assigned to: " + slot;
        }
        return command.execute();
    }
}