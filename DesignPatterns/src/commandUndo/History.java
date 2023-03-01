package commandUndo;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<UndoableCommand>();

    public void push(UndoableCommand command)
    {
        commands.add(command);
    }

    public UndoableCommand pop()
    {
        return commands.pop();
    }

    public int getSize()
    {
        return commands.size();
    }
}
