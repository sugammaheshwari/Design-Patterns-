package Mediator;
public class DialogBox implements DialogBoxInterface{
    private TextBox textbox = new TextBox(this);
    private Button button = new Button(this);
    public void mimickTextBoxUpdatedAction(String content)
    {
        textbox.setContent(content);
    }
    @Override
    public void changed(UIControl uiControl) {
        if(uiControl == textbox)
        {
            if(textbox.getContent()=="") button.updateButtonState(false);
            else button.updateButtonState(true);
        }
    }
}