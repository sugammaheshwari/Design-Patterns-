package Mediator;

public class Button extends  UIControl{

    private boolean stateOfButton=false;
    public Button(DialogBoxInterface owner) {
        super(owner);
    }
    public boolean getStateOfButton()
    {
        return stateOfButton;
    }
    public void updateButtonState(boolean state)
    {
        stateOfButton = state;
        System.out.println("State of Botton :" + state);
    }
}
