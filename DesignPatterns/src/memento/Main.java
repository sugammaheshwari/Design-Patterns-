package memento;

public class Main {
    public static void main(String[] args)
    {
        var editor = new editor("content1","title1");
        var editorHistory = new editorHistory();

        editorHistory.pushEditorState(editor.createEditorState());

        editor.updateEditor("content2","title2");
        editorHistory.pushEditorState(editor.createEditorState());

        editor.updateEditor("content3","title3");
        editorHistory.pushEditorState(editor.createEditorState());

        editor.restoreEditorState(editorHistory.popEditorState());
        editor.restoreEditorState(editorHistory.popEditorState());

        System.out.println(editor);
        // output content1 title1
    }
}
