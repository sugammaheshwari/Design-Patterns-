package Mediator;
public class TextBox extends UIControl{
    private String content="";
    public TextBox(DialogBoxInterface owner) {
        super(owner);
    }
    public String getContent()
    {
        return content;
    }
    public void setContent(String newContent)
    {
        content = newContent;
        UIchanged();
    }
}
