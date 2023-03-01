package Mediator;
public class UIControl {
    protected DialogBoxInterface owner;
    public UIControl(DialogBoxInterface owner){this.owner = owner;}
    public void UIchanged() {owner.changed(this);}
}
