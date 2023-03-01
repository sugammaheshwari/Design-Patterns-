package memento;

public class editorState {
    private String content;
    private String title;

    public editorState(String content, String title) {
        this.content = content;
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }
}
