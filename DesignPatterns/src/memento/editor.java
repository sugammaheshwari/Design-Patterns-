package memento;

import java.util.ArrayList;

public class editor {
    private String content;
    private String title;

    public editor(String content, String title) {
        this.content = content;
        this.title = title;
    }

    public void updateEditor(String content,String title)
    {
        this.content=content;
        this.title=title;
    }

    public editorState createEditorState()
    {
        return new editorState(this.content,this.title);
    }

    public void restoreEditorState(editorState eState)
    {
        this.content=eState.getContent();
        this.title=eState.getTitle();
    }

    @Override
    public String toString() {
        return content + " " + title;
    }
}
