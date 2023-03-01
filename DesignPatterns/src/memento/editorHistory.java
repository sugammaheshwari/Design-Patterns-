package memento;

import java.util.ArrayList;
import java.util.List;

public class editorHistory {
    private List<editorState> editorStateList = new ArrayList<editorState>();

    public void pushEditorState(editorState eState) {
        editorStateList.add(eState);
    }

    public editorState popEditorState()
    {
        editorStateList.remove(editorStateList.size()-1);
        return editorStateList.get(editorStateList.size()-1);
    }
}