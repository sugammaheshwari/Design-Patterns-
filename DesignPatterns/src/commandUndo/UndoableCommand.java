package commandUndo;

/*
        Why UndoableCommand is a seperate Interface ?
        Why didn't we implemented unexecute in Command Interface ?

        A : Because not every command will be Undoable !!!
 */
public interface UndoableCommand extends Command {
    void unexecute();
}
